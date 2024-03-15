package com.briz.Customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
	@Autowired
	CustomerRepository crepo;
	@RequestMapping("/testing")
	public String test()
	{
		return"The program tested";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Customer c=new Customer();
		c.setProductname("Tshirt");
		c.setProducttype("clothes");
		c.setPrice(499);
		crepo.save(c);
		return "data saved";
	}
	
	@RequestMapping("/saveall")
	public String saveall()
	{
		Customer c1=new Customer();
		c1.setProductname("Washing Machine");
		c1.setProducttype("Electric Appliance");
		c1.setPrice(15000);
		
		Customer c2=new Customer();
		c2.setProductname("Wheat Flour");
		c2.setProducttype("Grocery item");
		c2.setPrice(500);
		
		Customer c3=new Customer();
		c3.setProductname("Mixer Grinder");
		c3.setProducttype("Electric Appliance");
		c3.setPrice(1500);
		
		Customer c4=new Customer();
		c4.setProductname("Laptop");
		c4.setProducttype("Electric Appliance");
		c4.setPrice(250000);
		
		Customer c5=new Customer();
		c5.setProductname("Soap");
		c5.setProducttype("Acceriories");
		c5.setPrice(300);
		
		List<Customer> list=Arrays.asList(c1,c2,c3,c4,c5);
		crepo.saveAll(list);
		return "saved all data";
		
	}
	@RequestMapping ("/hi/{id}")
	public Customer byid(@PathVariable int id)
	{
		return crepo.findById(id);
	}
	
	@RequestMapping ("/hello/{Productname}")
	public Customer byname(@PathVariable String Productname)
	{
		return crepo.findByProductname(Productname);
	}
	

}
