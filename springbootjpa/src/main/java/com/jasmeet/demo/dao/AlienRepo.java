package com.jasmeet.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jasmeet.demo.model.Alien;

//✔need to specify the modelObject & type of primary key 
//💡 CRUDrepository has already declared methods for CRUD functions
public interface AlienRepo extends CrudRepository<Alien,Integer>
{
	// no need to define CRUD methods
	//🎇 spring data rest has already implemented CRUD
}
