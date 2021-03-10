package com.hcl.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Salesman")
public class Salesman {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "salesman_id") 
	private int salesman_id;
	
	@Column(name = "salesman_name")
	private String salesman_name;
	
	@Column(name = "salesman_mobno")
	private String salesman_mobno;
	
	@Column(name = "salesman_email")
	private String salesman_email;
	
	@Column(name = "salesman_username")
	private String salesman_username;
	
	@Column(name = "salesman_password")
	private String salesman_password;
	
	@Column(name = "salesman_address")
	private String salesman_address;
	
	
	public Salesman() {
        setSalesman_id(salesman_id);
        setSalesman_name(salesman_name);
        setSalesman_mobno(salesman_mobno);
        setSalesman_email(salesman_email);
        setSalesman_username(salesman_username);
        setSalesman_password(salesman_password);
        setSalesman_address(salesman_address);

 

    }
	 public Salesman(int salesman_id,String salesman_name, String salesman_email, String salesman_username, String salesman_password,String salesman_address) {
	        super();
	        this.salesman_id = salesman_id;
	        this.salesman_name = salesman_name;
	        
	        this.salesman_email = salesman_email;
	        this.salesman_username = salesman_username;
	        this.salesman_password = salesman_password;
	        this.salesman_address = salesman_address;
	    }
	   
	
	public int getSalesman_id() {
		return salesman_id ;
	}
	
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	
	public String getSalesman_name() {
		return salesman_name;
	}
	
	public void setSalesman_name(String salesman_name) {
		this.salesman_name = salesman_name;
	}
	

	public String getSalesman_mobno() {
		return salesman_mobno;
	}
	
	public void setSalesman_mobno(String salesman_mobno) {
		this.salesman_mobno = salesman_mobno;
	}
	public String getSalesman_email() {
		return salesman_email;
	}
	
	public void setSalesman_email(String salesman_email) {
		this.salesman_email = salesman_email;
	}
	
	public String getSalesman_username() {
		return salesman_username;
	}
	
	public void setSalesman_username(String salesman_username) {
		this.salesman_username = salesman_username;
	}
	
	public String getSalesman_password() {
		return salesman_password;
	}
	
	public void setSalesman_password(String salesman_password) {
		this.salesman_password = salesman_password;
	}
	
	public String getSalesman_address() {
		return salesman_address;
	}
	public void setSalesman_address(String salesman_address) {
		this.salesman_address = salesman_address;
	}
	
	
	  @Override
    public String toString() {
        return "Salesman [salesman_id=" + salesman_id + ", salesman_name=" + salesman_name + ", salesman_email=" + salesman_email + ", salesman_username=" + salesman_username
                + ",salesman_password=" + salesman_password + ",salesman_address=" + salesman_address + "]";
    } 
}

