package com.cg.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entities.Customer;


	
	public interface CustomerRepository extends JpaRepository<Customer, Long> {
		
		
		
	}



