package com.example.SampleSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SampleSpringBoot.model.PetCustomer;
import com.example.SampleSpringBoot.service.PetCustomerService;

@RestController  
@RequestMapping("/rest/petCustomer")
public class PetCustomerController   
{  
	
	@Autowired  
	PetCustomerService petCustomerService; 
	
	
	  
	@GetMapping("/petCustomer")  
	private List<PetCustomer> getAllPetCustomer()   
	{  
	return petCustomerService.getAllPetCustomer();  
	}  
	 
	@GetMapping("/petCustomer/{id}")  
	private PetCustomer getPetCustomer(@PathVariable("id") int id)   
	{  
	return petCustomerService.getPetCustomerById(id);  
	}  

	@DeleteMapping("/petCustomer/{id}")  
	private void deletePetCustomer(@PathVariable("id") int id)   
	{  
		petCustomerService.delete(id);  
	}  

	@PostMapping("/petCustomer")  
	private int savePetCustomer(@RequestBody PetCustomer petCustomer)   
	{  
		petCustomerService.saveOrUpdate(petCustomer);  
	return petCustomer.getId();  
	}  
  
	@PutMapping("/petCustomer")  
	private PetCustomer update(@RequestBody PetCustomer petCustomer)   
	{  
		petCustomerService.saveOrUpdate(petCustomer);  
	return petCustomer;  
	}  
	}  
