package com.cg.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	
	
	
}
