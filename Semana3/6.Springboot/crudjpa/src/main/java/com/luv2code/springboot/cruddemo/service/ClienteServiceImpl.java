package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.ClienteRepository;
import com.luv2code.springboot.cruddemo.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository elClienteRepository) {
        clienteRepository = elClienteRepository;
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(int theId) {
        Optional<Cliente> result = clienteRepository.findById(theId);

        Cliente elCliente = null;

        if (result.isPresent()) {
            elCliente = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return elCliente;
    }

    @Override
    public Cliente save(Cliente elCliente) {
        return clienteRepository.save(elCliente);
    }

    @Override
    public void deleteById(int theId) {
        clienteRepository.deleteById(theId);
    }
}






