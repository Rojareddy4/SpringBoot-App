package com.abc.banking.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
	@Table(name = "trans_tbl")
	public class Transaction {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "trans_id")
		private long tranID;

		@Column(name = "trans_date")
		private LocalDate tranDate;

		@Column(name = "source_acc")
		private long sourceAcc;

		@Column(name = "target_acc")
		private long targetAcc;

		@Column(name = "amount")
		private double amount;

		@ManyToOne
		@JoinColumn(name="acc_id")
		@JsonIgnore
		private Account account;
	
	
	
}




