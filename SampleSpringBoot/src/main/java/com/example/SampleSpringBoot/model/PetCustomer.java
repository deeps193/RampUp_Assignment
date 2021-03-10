package com.example.SampleSpringBoot.model;
 
import java.io.Serializable;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity  
@Table
public class PetCustomer  implements Serializable
{  
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private int id;

	@Column
	private String name;

	@Column
	private String email;

	@Column
	private String address;

	@Column
	private int phone;
	
	@Column
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", name=" + name + ",address=" + address + ",email=" + email + ",  phone=" + phone + ", password=" + password + "]";
	}
	public PetCustomer(int id, String name, String address, String email,int phone,String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public PetCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
