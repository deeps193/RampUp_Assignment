package com.example.SampleSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleSpringBoot.model.PetDetail;

//repository that extends CrudRepository 
@Repository
public interface PetDetailRepository extends CrudRepository<PetDetail, Integer>  
{
	
}