package com.academia.spring_boot_mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academia.spring_boot_mongodb.collection.Person;
import com.academia.spring_boot_mongodb.service.PersonService;

@RestController

@RequestMapping("/person")

public class PersonController {


@Autowired 
private PersonService personService;

@PostMapping 
public String save(@RequestBody Person person)

{

return personService.save(person);
}

@GetMapping("/all")  // <- Nueva ruta para obtener todas las personas
public List<Person> getAllPersons() {
    return personService.getAllPersons();
}

@GetMapping 
public List<Person> getPersonStartsWith(@RequestParam String name) {
return personService.getPersonStartsWith(name);

}


@DeleteMapping("/{id}") 
public void delete(@PathVariable String id) {
	personService.delete(id); 
	}

}



