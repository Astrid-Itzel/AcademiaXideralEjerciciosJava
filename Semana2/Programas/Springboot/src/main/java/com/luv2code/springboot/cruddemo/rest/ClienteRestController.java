package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Cliente;
import com.luv2code.springboot.cruddemo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    private ClienteService clienteService;

    @Autowired
    public ClienteRestController(ClienteService elClienteService) {
        clienteService = elClienteService;
    }

    // expose "/clientes" and return a list of clientes
    @GetMapping("/clientes")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    // add mapping for GET /clientes/{clienteId}

    @GetMapping("/clientes/{clienteId}")
    public Cliente getCliente(@PathVariable int clienteId) {

        Cliente theCliente = clienteService.findById(clienteId);

        if (theCliente == null) {
            throw new RuntimeException("Cliente id not found - " + clienteId);
        }

        return theCliente;
    }

    // add mapping for POST /clientes - add new cliente

    @PostMapping("/clientes")
    public Cliente addCliente(@RequestBody Cliente theCliente) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theCliente.setId(0);

        Cliente dbCliente = clienteService.save(theCliente);

        return dbCliente;
    }

    // add mapping for PUT /clientes - update existing cliente

    @PutMapping("/clientes")
    public Cliente updateCliente(@RequestBody Cliente theCliente) {

        Cliente dbCliente = clienteService.save(theCliente);

        return dbCliente;
    }

    // add mapping for DELETE /clientes/{clienteId} - delete cliente

    @DeleteMapping("/clientes/{clienteId}")
    public String deleteCliente(@PathVariable int clienteId) {

        Cliente tempCliente = clienteService.findById(clienteId);

        // throw exception if null

        if (tempCliente == null) {
            throw new RuntimeException("Cliente id not found - " + clienteId);
        }

        clienteService.deleteById(clienteId);

        return "Deleted cliente id - " + clienteId;
    }

}














