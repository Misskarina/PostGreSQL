package com.briz.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	
	Customer findById(int id);

	Customer findByProductname(String productname);

	
}
