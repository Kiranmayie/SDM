package com.concordia.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.ITransaction;
import com.concordia.app.vo.transaction;

@Controller
public class TransactionController {
	
	@Autowired
	private ITransaction TransactionDAO ;
	
	@RequestMapping("/transactionhistory")
	public ModelAndView searchtransaction(HttpServletRequest request) {
		

		List<transaction> list = TransactionDAO.getAllTransactions();
		
		
		ModelAndView modelAndView = new ModelAndView("TransactionView");
		
		modelAndView.addObject("list", list);
		
		return modelAndView;
		
		
	}