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

import com.example.SampleSpringBoot.model.PetDetail;
import com.example.SampleSpringBoot.service.PetDetailService;

@RestController 
@RequestMapping("/rest/petDetail")
public class PetDetailController   
{  
	
	@Autowired  
	PetDetailService petDetailService;  
	  
	@GetMapping("/petDetail")  
	private List<PetDetail> getAllPetDetail()   
	{  
	return petDetailService.getAllPetDetail();  
	}  
	 
	@GetMapping("/petDetail/{id}")  
	private PetDetail getPetDetail(@PathVariable("id") int id)   
	{  
	return petDetailService.getPetDetailById(id);  
	}  

	@DeleteMapping("/petDetail/{id}")  
	private void deletePetDetail(@PathVariable("id") int id)   
	{  
		petDetailService.delete(id);  
	}  

	@PostMapping("/petDetail")  
	private int savePetDetail(@RequestBody PetDetail books)   
	{  
		petDetailService.saveOrUpdate(books);  
	return books.getId();  
	}  
  
	@PutMapping("/petDetail")  
	private PetDetail update(@RequestBody PetDetail petDetail)   
	{  
		petDetailService.saveOrUpdate(petDetail);  
	return petDetail;  
	}  
	}  
