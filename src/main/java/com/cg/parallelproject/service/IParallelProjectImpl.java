package com.cg.parallelproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.parallelproject.dao.ParallelprojectDao;
import com.cg.parallelproject.model.BankCustomer;
@Service
public class IParallelProjectImpl implements IParallelProjectService{

	@Autowired
	private ParallelprojectDao parallelProjectDao;
	@Override
	public void save(BankCustomer bankcustomer) {
		parallelProjectDao.save(bankcustomer);
	}
	@Override
	public List<BankCustomer> findAll() {
		
		return parallelProjectDao.findAll();
	}
	@Override
	public BankCustomer findById(int id) {
		BankCustomer bankCustomer=parallelProjectDao.findById(id).get();
		return bankCustomer;
	}

}
