package com.beedata.repository;

import org.springframework.data.repository.CrudRepository;

import com.beedata.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}