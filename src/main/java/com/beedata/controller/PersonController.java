package com.beedata.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beedata.entity.Person;
import com.beedata.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@PostMapping("/add")
	public Person addPerson(@RequestBody Person person) {

		return personRepository.save(person);
	}

	@GetMapping("/all")
	public Iterable<Person> allPerson() {

		return personRepository.findAll();
	}

	@GetMapping("/{personById}")
	public Optional<Person> personById(@PathVariable("id") int id) {

		return personRepository.findById(id);
	}

	@PutMapping("/update")
	public Person updatePerson(@RequestBody Person person) {

		return personRepository.save(person);
	}

	@DeleteMapping("/{personId}")
	public void deleteCountry(@PathVariable("id") int id) {

		personRepository.deleteById(id);
	}
}
