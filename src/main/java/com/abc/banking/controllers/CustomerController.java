package com.abc.banking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.banking.entities.Customer;
import com.abc.banking.repositories.CustomerRepository;
import com.abc.banking.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	

	
@PostMapping("/create")
public ResponseEntity<Customer> saveCustomerC(@RequestBody Customer customer){
	Customer cust = customerService.createCustomer(customer);
	ResponseEntity<Customer> responseEntity = new ResponseEntity<>(cust, HttpStatus.CREATED);
	return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getById(@PathVariable Long customerId) {
	    Customer customer = customerService.getById(customerId);
	   
	    return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	    
//	    if (customer.isPresent()) {
//	        return ResponseEntity.ok(customer.get());
//	    } else {
//	        return ResponseEntity.notFound().build();
//	    }
	}
	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteCustomer(@PathVariable Long Id) {
//	    Optional<Customer> customer = customerRepository.findById(Id);
//	    if (customer.isPresent()) {
//	        customerRepository.deleteById(Id);
//	        return ResponseEntity.noContent().build();
//	    } else {
//	        return ResponseEntity.notFound().build();
//	    }
//	}

}
