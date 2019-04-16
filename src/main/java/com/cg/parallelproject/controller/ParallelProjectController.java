package com.cg.parallelproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.parallelproject.model.BankCustomer;
import com.cg.parallelproject.service.IParallelProjectService;

@Controller
@RequestMapping("/account")
public class ParallelProjectController {
	@Autowired
	IParallelProjectService parallelprojectservice;

	@PostMapping("/admin")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("newaccount");
		} else {
			modelAndView = new ModelAndView("admin");
		}
		return modelAndView;
	}

	@PostMapping("/createAccount")
	public ModelAndView createAccount(@RequestParam String name, @RequestParam double contact,
			@RequestParam Integer balance, @RequestParam String username,@RequestParam String password) {
		BankCustomer bankcustomer = new BankCustomer();
		bankcustomer.setName(name);
		bankcustomer.setContact(contact);
		bankcustomer.setBalance(balance);
		bankcustomer.setUsername(username);
		bankcustomer.setPassword(password);
		parallelprojectservice.save(bankcustomer);
		List<BankCustomer> BankHoldersList = parallelprojectservice.findAll();
		ModelAndView modelAndView = new ModelAndView("customerdetail");
		modelAndView.addObject("CUSTOMERLIST", BankHoldersList);
		return modelAndView;
	}
	
	

	@PostMapping("/customerlogin")
	public ModelAndView customerLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("menu");
		} else {
			modelAndView = new ModelAndView("customer");
		}
		return modelAndView;
	}
	
}



