package com.hcl.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Product")

public class Product{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    
	@Column(name = "product_id") 
	private int product_id;
	
	@Column(name = "product_customer_id")
	private Long product_customer_id;
	 
	@Column(name = "product_items")
	private String  product_items;
	
	@Column(name = "product_number")
	private Long product_number;
	
	@Column(name = "product_type")
	private String  product_type;
	
	@Column(name = "product_description")
	private String  product_description;
	
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	public Long Product_customer_id() {
		return product_customer_id;
	}

	public void Product_customer_id(Long product_customer_id) {
		this.product_customer_id = product_customer_id;
	}
	
	public String getProduct_items() {
		return product_items;
	}

	public void setProduct_items(String product_items) {
		this.product_items = product_items;
	}

	public Long getProduct_number() {
		return product_number;
	}

	public void setProduct_number(Long product_number) {
		this.product_number = product_number;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

       
}
