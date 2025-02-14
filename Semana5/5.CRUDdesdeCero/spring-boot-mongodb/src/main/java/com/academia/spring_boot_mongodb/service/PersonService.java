package com.academia.spring_boot_mongodb.service;

import java.util.List;

import com.academia.spring_boot_mongodb.collection.Person;

public interface PersonService {

	String save(Person person);
	
	List<Person> getPersonStartsWith(String name);
	
	void delete(String id);

	List<Person> getAllPersons();
	
}
