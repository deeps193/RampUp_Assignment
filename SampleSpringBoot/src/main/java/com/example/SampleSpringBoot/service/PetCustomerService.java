package com.example.SampleSpringBoot.service;  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SampleSpringBoot.model.PetCustomer;

import com.example.SampleSpringBoot.repository.PetCustomerRepository;
 


@Service  
public class PetCustomerService   
{  
@Autowired  
PetCustomerRepository petCustomerRepository;  

public List<PetCustomer> getAllPetCustomer()   
{  
List<PetCustomer> petCustomer = new ArrayList<PetCustomer>();  
petCustomerRepository.findAll().forEach(petCustomer1 -> petCustomer.add(petCustomer1));  
return petCustomer;  
}  

public PetCustomer getPetCustomerById(int id)   
{  
return petCustomerRepository.findById(id).get();  
}  

public void saveOrUpdate(PetCustomer petCustomer)   
{  
	petCustomerRepository.save(petCustomer);  
}  
 
public void delete(int id)   
{  
	petCustomerRepository.deleteById(id);  
}  

public void update(PetCustomer petCustomer, int id)   
{  
	petCustomerRepository.save(petCustomer);  
}  
}  
 