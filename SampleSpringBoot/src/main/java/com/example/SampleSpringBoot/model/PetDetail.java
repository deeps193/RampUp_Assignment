package com.example.SampleSpringBoot.model;
 
import java.io.Serializable;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity  
@Table
public class PetDetail  implements Serializable
{  
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private int id;

	@Column
	private String petname;

	@Column
	private int age;
	
	@Column
	private String placefrom;
	
	@Column
	private int cost;

	@Column(name = "petcount", nullable = false, columnDefinition = "int default 0") 
	private int petcount;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlacefrom() {
		return placefrom;
	}

	public void setPlacefrom(String placefrom) {
		this.placefrom = placefrom;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPetcount() {
		return petcount;
	}

	public void setPetcount(int petcount) {
		this.petcount = petcount;
	}
	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", petname=" + petname + ",age=" + age + ",placefrom=" + placefrom + ",  cost=" + cost + ", petcount=" + petcount + "]";
	}
	public PetDetail(int id, String petname, int age, String placefrom,int cost,int petcount) {
		super();
		this.id = id;
		this.petname = petname;
		this.age = age;
		this.placefrom = placefrom;
		this.cost = cost;
		this.petcount = petcount;
	}
	public PetDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
