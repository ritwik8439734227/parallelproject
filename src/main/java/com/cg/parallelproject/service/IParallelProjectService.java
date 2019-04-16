package com.cg.parallelproject.service;

import java.util.List;

import com.cg.parallelproject.model.BankCustomer;



public interface IParallelProjectService {

	
	public  void save( BankCustomer bankcustomer );

	public List<BankCustomer> findAll();
	public BankCustomer findById(int id);
	
}
