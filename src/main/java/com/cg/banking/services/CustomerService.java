package com.cg.banking.services;

import java.util.List;

import com.cg.banking.entities.Customer;

public interface CustomerService {
	
	


	    // Create a new customer
	
	    Customer createCustomer(Customer customer);

	   
	    // Retrieve a customer by ID
	    
	    Customer getById(Long Id);



	    // Delete a customer by ID
	    
	    void deleteCustomer(Long Id);
	}


