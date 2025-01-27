package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteDAOJpaImpl implements ClienteDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public ClienteDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Cliente> findAll() {

        // create a query
        TypedQuery<Cliente> theQuery = entityManager.createQuery("from Cliente", Cliente.class);

        // execute query and get result list
        List<Cliente> clientes = theQuery.getResultList();

        // return the results
        return clientes;
    }

    @Override
    public Cliente findById(int theId) {

        // get employee
        Cliente elCliente = entityManager.find(Cliente.class, theId);

        // return employee
        return elCliente;
    }

    @Override
    public Cliente save(Cliente elCliente) {

        // save employee
        Cliente dbCliente = entityManager.merge(elCliente);

        // return the dbEmployee
        return dbCliente;
    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
        Cliente elCliente = entityManager.find(Cliente.class, theId);

        // remove employee
        entityManager.remove(elCliente);
    }
}











