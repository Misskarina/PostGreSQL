package com.briz.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="practice")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int id;
	String productname;
	String Producttype;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducttype() {
		return Producttype;
	}
	public void setProducttype(String producttype) {
		Producttype = producttype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	};
	
	
	
	

}
