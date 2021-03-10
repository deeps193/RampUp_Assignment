package com.example.SampleSpringBoot.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleSpringBoot.model.PetCustomer;

//repository that extends CrudRepository 
@Repository
public interface PetCustomerRepository extends CrudRepository<PetCustomer, Integer>  
{

	
	
}