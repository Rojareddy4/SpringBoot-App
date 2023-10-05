package com.cg.banking.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

	@Getter
	@Setter
	@Entity
	@Table(name = "account_tbl")
	public class Account {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "acc_id")
		private int accId;

		@Column (name = "acc_no")
		private long accNo;

		@Column(name = "balance")
		private double currentBalance;

		@ManyToOne
		@JoinColumn(name="cust_id")
		@JsonIgnore
		private Customer customer;

		@OneToMany(mappedBy="account" ,cascade = CascadeType.ALL)
		private List<Transaction> transaction;
	    
	    
	    
	    public Customer getCustomer() {
	    	return customer;
	    }
	    public void setCustomer(Customer customer) {
	    	this.customer = customer;
	    }
	}


