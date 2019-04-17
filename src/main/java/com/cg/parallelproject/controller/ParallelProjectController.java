package com.cg.parallelproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
int customerid;
	/**
	 * @param user
	 * @param password
	 * @return
	 */
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
			@RequestParam Integer balance, @RequestParam String username, @RequestParam String password) {
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

	@SuppressWarnings("unused")
	@PostMapping("/cust")
	public ModelAndView customerLogin(@RequestParam int id, @RequestParam String password) {
		ModelAndView modelandview;
		customerid=id;
		BankCustomer bank = parallelprojectservice.findById(id);
		String pass = bank.getPassword();
		if (bank == null) {
			modelandview = new ModelAndView("AccountNotFound");
		} else if (password.equals(pass)) {
			modelandview = new ModelAndView("menu");
		} else {
			modelandview = new ModelAndView("InvalidCredentials");
		}

		return modelandview;
	}

	@PostMapping("/deposit")
	public ModelAndView deposit(@RequestParam int id, @RequestParam int balance) {
		BankCustomer bank = parallelprojectservice.findById(customerid);
		int currentBalance = bank.getBalance();
		currentBalance = currentBalance + balance;
		bank.setBalance(currentBalance);
		parallelprojectservice.save(bank);
		ModelAndView modelAndView = new ModelAndView("UpdatedDeposit");
		modelAndView.addObject("customer", currentBalance);
		return modelAndView;

	}
	@PostMapping("/withdraw")
	public ModelAndView withdraw(@RequestParam int amount) {
		BankCustomer bank = parallelprojectservice.findById(customerid);
		int currentBalance = bank.getBalance();
		currentBalance = currentBalance -amount;
		bank.setBalance(currentBalance);
		parallelprojectservice.save(bank);
		ModelAndView modelAndView = new ModelAndView("updatedWithdraw");
		modelAndView.addObject("customer", currentBalance);
		return modelAndView;

	}
	@GetMapping("/showbalance")
		public ModelAndView showbalance() {
		BankCustomer bank = parallelprojectservice.findById(customerid);
		int balance=bank.getBalance();
		ModelAndView modelAndView = new ModelAndView("ShowBalance");
		modelAndView.addObject("balance", balance);
		return modelAndView;
	}
	@PostMapping("/fundtransfer")
	public ModelAndView fundTranfer(@RequestParam int RecieverId, @RequestParam int amount) {
		BankCustomer bank = parallelprojectservice.findById(customerid);
		BankCustomer bankApp = parallelprojectservice.findById(RecieverId);

		int senderBalance = bank.getBalance();
		int recieverBalance = bank.getBalance();

		if(senderBalance<amount) {
			ModelAndView modelAndView = new ModelAndView("InsufficientBalance");
			//modelAndView.addObject("sender", senderBalance);
			return modelAndView;
		}
		else {
		senderBalance = senderBalance - amount;
		recieverBalance = recieverBalance + amount;

		bank.setBalance(senderBalance);
		bankApp.setBalance(recieverBalance);

		parallelprojectservice.save(bank);
		parallelprojectservice.save(bankApp);

		ModelAndView modelAndView = new ModelAndView("SenderBalance");
		modelAndView.addObject("sender", senderBalance);
		return modelAndView;
	}}
	

}
