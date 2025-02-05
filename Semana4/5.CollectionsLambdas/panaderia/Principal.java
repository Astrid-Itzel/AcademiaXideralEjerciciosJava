package panaderia;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
	
		Pan concha = new Pan ("Concha", 12.80, 129);
	Pan bolillo = new Pan ("bolillo", 2.50, 165);
	Pan cuernito = new Pan ("cuernito", 7.90, 0);
	Pan roll = new Pan ("roll", 17.90, 87);
	Pan oreja = new Pan ("oreja", 15.90, 37);
	Pan hojaldra = new Pan ("hojaldra", 5.00, 0);
	Pan telera = new Pan ("telera", 2.50, 159);
	
	
	ArrayList<Pan> listaPanes = new ArrayList<>(); 
	
	 listaPanes.add(concha);
	 listaPanes.add(bolillo);
     listaPanes.add(cuernito);
     listaPanes.add(roll);
     listaPanes.add(oreja);
     listaPanes.add(hojaldra);
     listaPanes.add(telera);
     
     //Lambda Consumer. Pasamos un generic como parámetro y no nos regresa nada.
     //forEach​(Consumer<? super T> action)
     System.out.println("Lista de panes:");
     listaPanes.forEach(pan -> System.out.println(pan)); 
     
     //Lambda Comparator. Sort utiliza Comparator para comparar dos elementos y ordenarlos de acuerdo a la propiedad elegida. En este caso, ordenamos por precio. 
     //Casteamos los doubles a int
     listaPanes.sort((e1,e2) -> (int)(e1.getPrecio() - e2.getPrecio()));
     
     
     System.out.println("**************************************\nLista de panes ordenada por precio:");
 	listaPanes.forEach(pan -> System.out.println(pan));
     
 	//Lambda UnaryOperator. Método .replaceAll(UnaryOperator operator). En este caso, reemplazamos el precio por el precio con descuento.
 	//Lista de panes con descuento del 25%
 	listaPanes.replaceAll(pan -> {
 		pan.setPrecio(pan.getPrecio() * .75);
 		return pan;
 	});
 	
 	 System.out.println("**************************************\nLista de panes con 25% de descuento:");
  	listaPanes.forEach(pan -> System.out.println(pan));
 	
  	//Lambda Predicate. Método removeIf(Predicate).  En este caso, quitamos los panes que sí tienen stock.
  	listaPanes.removeIf(pan -> pan.getStock() > 0);
  	System.out.println("**************************************\nLista de panes sin stock: ");
  	listaPanes.forEach(pan -> System.out.println(pan));
  	
	}//main
}//principal
