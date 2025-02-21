package com.academy.proyecto.rest;

import com.academy.proyecto.bo.ProductBean;
import com.mongodb.bulk.BulkWriteResult;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Kloud4academyBatchController {

    @Value("${file.input}")
    private String fileInput;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/mongodbbulkupdate")
    public String directHomePage() {
        try {
            commitBulkUpdateToMongoDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Mongodb Bulk Update Processed";
    }

    private void commitBulkUpdateToMongoDB() {
        try {
        	BufferedReader reader = new BufferedReader(new FileReader(fileInput));
        	CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        	CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build();

            List<String[]> allData = csvReader.readAll();
            int count = 0;
            ProductBean productData = null;
            List<ProductBean> productInfoList = new ArrayList<>();

            for (String[] productRow : allData) {
                String[] productArry = new String[productRow.length];
                productData = new ProductBean();
                count = 0;
                for (String productInfo : productRow) {
  
                	if (count == 0) {
                        productData.setProductId(productInfo); // ID de producto (String)
                    } else if (count == 1) {
                        productData.setProductName(productInfo); // Nombre del producto (String)
                    } else if (count == 2) {
                        productData.setStock(Integer.parseInt(productInfo)); // Stock (int)
                    } else if (count == 3) {
                        productData.setPrice(Double.parseDouble(productInfo)); // Precio (Double)
                    } else if (count == 4) {
                        productData.setDescuento(Integer.parseInt(productInfo)); // Descuento (Integer)
                    }
                    count++;
                }
                
             // Calcular el precio con descuento
                double precioConDescuento = productData.getPrice() * (1 - (productData.getDescuento() / 100.0));

             // Redondear a 2 decimales usando BigDecimal
                BigDecimal bd = new BigDecimal(precioConDescuento).setScale(2, RoundingMode.HALF_UP);
                productData.setPrecioConDescuento(bd.doubleValue()); // Establecer el precio con descuento redondeado
                
          
                
                productInfoList.add(productData); // Agregar el producto a la lista
            }

            BulkOperations bulkOps = 
            		mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, "productToyStore") /*ProductBean.class)*/;
            productInfoList.stream().filter(product -> product != null).forEach(product -> {
                org.bson.Document dbDoc = new org.bson.Document().append("$set", product);
                mongoTemplate.getConverter().write(product, dbDoc);
                Query query = new Query().addCriteria(new Criteria("productId").is(product.getProductId()));
                Update update = Update.fromDocument(dbDoc, "");
                bulkOps.upsert(query, update);
            });

            System.out.println("Total de productos a insertar/actualizar: " + productInfoList.size());
            
            BulkWriteResult result = bulkOps.execute();

            System.out.println("Número de documentos modificados: " + result.getModifiedCount());
            System.out.println("Número de documentos insertados: " + result.getUpserts().size());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
