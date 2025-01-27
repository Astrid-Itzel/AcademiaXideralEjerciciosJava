package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Cliente;

import java.util.List;

public interface ClienteDAO {

    List<Cliente> findAll();

    Cliente findById(int theId);

    Cliente save(Cliente theEmployee);

    void deleteById(int theId);
}










