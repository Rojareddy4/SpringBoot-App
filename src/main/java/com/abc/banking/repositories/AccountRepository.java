package com.abc.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.banking.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	
	
	
}
