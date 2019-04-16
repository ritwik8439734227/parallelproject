package com.cg.parallelproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.parallelproject.model.BankCustomer;

public interface ParallelprojectDao extends JpaRepository<BankCustomer, Integer> {

}
