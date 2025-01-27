package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.ClienteDAO;
import com.luv2code.springboot.cruddemo.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO clienteDAO;

    @Autowired
    public ClienteServiceImpl(ClienteDAO elClienteDAO) {
        clienteDAO = elClienteDAO;
    }

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente findById(int theId) {
        return clienteDAO.findById(theId);
    }

    @Transactional
    @Override
    public Cliente save(Cliente elCliente) {
        return clienteDAO.save(elCliente);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        clienteDAO.deleteById(theId);
    }
}






