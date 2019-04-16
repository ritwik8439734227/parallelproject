package com.cg.parallelproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;



@Entity
@Table(name = "bankcustomers")
public class BankCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")

	@SequenceGenerator(name = "seq", sequenceName = "seq_account_id", allocationSize = 1)
	private int accountId;
	private String name;
	
	private double contact;
	private int balance;
	private String username;
	private String password;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BankCustomer [accountId=" + accountId + ", name=" + name + ", contact=" + contact + ", balance="
				+ balance + ", username=" + username + ", password=" + password + "]";
	}

}
