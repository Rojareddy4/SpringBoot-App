package com.abc.banking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.banking.entities.Customer;
import com.abc.banking.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        
//       return customerRepository.save(customer);
    	
    	Customer newCustomer = customerRepository.save(customer);
    	return newCustomer;
    	
    }

   

    @Override
    public Customer getById(Long Id) {
        // Implement the logic to retrieve a customer by ID
        return customerRepository.findById(Id).orElse(null);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        // Implement the logic to delete a customer by ID
        customerRepository.deleteById(customerId);
    }

	
}


