package com.hcl.model;
 
public class Contact {
    private String name;
    private String email;
    private String country;
 
    public Contact() {
        super();
    }
 
    public Contact(String name, String email, String country) {
        super();
        this.setName(name);
        this.setEmail(email);
        this.setCountry(country);
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
 
   
 
}