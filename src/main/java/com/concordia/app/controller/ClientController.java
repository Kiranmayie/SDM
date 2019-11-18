package com.concordia.app.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.IClient;
import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.client;

@Controller
public class ClientController {

	@Autowired
	private IClient ClientDAO;
	
	@RequestMapping("/client")
	public ModelAndView searchCarCatalogue(HttpServletRequest request) {
		

		List<client> list1 = ClientDAO.getAllClientDetails();
		System.out.println(list1);
		
		ModelAndView modelAndView = new ModelAndView("ClientView");
		
		modelAndView.addObject("list1", list1);
		
		return modelAndView;
		
		
	}
	
	@RequestMapping("/client/delete")
	public ModelAndView deleteCarCatalogue(HttpServletRequest request) {
		String clientDL="B-1234-123456-12";

		 client list1c = ClientDAO.delete(clientDL);
		 List<client> list1 = ClientDAO.getAllClientDetails();
		
		ModelAndView modelAndView = new ModelAndView("ClientView");
		
		modelAndView.addObject("list1", list1);
		
		return modelAndView;
		
		
	}
	
	
	
	
	@RequestMapping(value = "add/user", method = RequestMethod.POST)
	public String addUser(@RequestParam(value = "firstName", required = true) String firstName,
			@RequestParam(value = "lastName", required = true) String lastName,
			@RequestParam(value = "phoneNum", required = true) String phoneNum,
			@RequestParam(value = "expDate", required = true) Date expDate, 
			@RequestParam(value = "clientDL", required = true) String clientDL,ModelMap userModel) {
		client userDetail = new client();
		userDetail.setFirstName(firstName);
		userDetail.setLastName(lastName);
		userDetail.setPhoneNum(phoneNum);
		userDetail.setExpDate(expDate);
		userDetail.setClientDL(clientDL);
		int resp = ClientDAO.add(userDetail);
		if (resp > 0) {
			userModel.addAttribute("msg", "User with id : " + resp + " added successfully.");
			userModel.addAttribute("userDetail", ClientDAO.getAllClientDetails());
			return "users";
		} else {
			userModel.addAttribute("msg", "User addition failed.");
			return "add";
		}
	}
	
	

}
