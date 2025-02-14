package com.academia.spring_boot_mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.spring_boot_mongodb.collection.Person;
import com.academia.spring_boot_mongodb.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

@Autowired
private PersonRepository personRepository;


@Override public String save(Person person) {
personRepository.save(person);
return person.getPersonId(); }

@Override public List<Person> getPersonStartsWith(String name) {
return personRepository.findByFirstNameStartsWith(name);
}

@Override public void delete(String id) {
	personRepository.deleteById(id); 
	}

@Override
public List<Person> getAllPersons() {
    return personRepository.findAll();
}

}