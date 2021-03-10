package com.example.SampleSpringBoot.service;  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SampleSpringBoot.model.PetDetail;
import com.example.SampleSpringBoot.repository.PetDetailRepository;  


@Service  
public class PetDetailService   
{  
@Autowired  
PetDetailRepository petDetailRepository;  

public List<PetDetail> getAllPetDetail()   
{  
List<PetDetail> petDetail = new ArrayList<PetDetail>();  
petDetailRepository.findAll().forEach(petDetail1 -> petDetail.add(petDetail1));  
return petDetail;  
}  

public PetDetail getPetDetailById(int id)   
{  
return petDetailRepository.findById(id).get();  
}  

public void saveOrUpdate(PetDetail petDetail)   
{  
	petDetailRepository.save(petDetail);  
}  
 
public void delete(int id)   
{  
	petDetailRepository.deleteById(id);  
}  

public void update(PetDetail petDetail, int id)   
{  
	petDetailRepository.save(petDetail);  
}  
}  
 