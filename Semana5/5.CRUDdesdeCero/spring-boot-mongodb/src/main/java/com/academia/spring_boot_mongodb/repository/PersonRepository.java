package com.academia.spring_boot_mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.academia.spring_boot_mongodb.collection.Person;

@Repository

public interface PersonRepository extends MongoRepository<Person, String> {
	
// Método de búsqueda personalizado
List<Person> findByFirstNameStartsWith(String name);

}
