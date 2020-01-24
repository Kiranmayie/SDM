package com.concordia.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.ClientDAO;
import com.concordia.app.dao.IClient;
import com.concordia.app.dao.Ilogin;
import com.concordia.app.vo.clerkLogin;
import com.concordia.app.vo.login;

@Controller
public class loginController {

	@Autowired

	private Ilogin loginDAO;
	
	@Autowired
	private IClient ClientDAO;
	
	@Autowired
	private HttpSession httpSession;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new login());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@RequestParam("userName") String us, @RequestParam("Password") String password,
			HttpSession session) {
		ModelAndView mav = null;
		System.out.println(us);
		clerkLogin user = loginDAO.loginclerkUser(us);
		
		loginDAO.settingClerkFlag(us);
		
		
		System.out.println(user);
		
		session.setAttribute("us", user.getUserName());
		mav = new ModelAndView("clientdashboard");
		mav.addObject("us", user);

		return mav;
	}
	
	@RequestMapping(value = "clerklogout/{userName}", method = RequestMethod.GET)
	public ModelAndView clerkLogout(@PathVariable String userName) {
		ModelAndView mav = null;	
		ClientDAO.updateClerkAddFlagFalse(userName);
		ClientDAO.updateClerkUpdateFlagFalse(userName);
		ClientDAO.updateClerkDeleteFlagFalse(userName);
		   mav = new ModelAndView("login"); 
		   mav.addObject("message", "Logged out successfully");
		 
		return mav;
	}

	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public ModelAndView showadminLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("AdminLogin");

		mav.addObject("login", new login());
		return mav;
	}

	@RequestMapping(value = "/adminloginProcess", method = RequestMethod.POST)
	public ModelAndView adminloginProcess(@RequestParam("userName") String us,
			@RequestParam("Password") String password, HttpSession session) {

		ModelAndView mav = null;
			
		if (loginDAO.findAdminUsers()!=null) {
			mav = new ModelAndView("AdminLogin");
			mav.addObject("message", "User already logged in");

		} else {
			System.out.println(us);
			login user = loginDAO.loginUser(us);
			user.setFlag(true);
			System.out.println(user.isFlag());
			loginDAO.updateFlag(user);
			System.out.println(user.isFlag());
			mav = new ModelAndView("admindashboard");
			mav.addObject("us", user);

		}

		return mav;
	}
	@RequestMapping(value = "adminlogout/{userName}", method = RequestMethod.GET)
	public ModelAndView showLogout(@PathVariable String userName) {
		ModelAndView mav = null;		
		   loginDAO.updateFlag(userName); 
		   mav = new ModelAndView("AdminLogin"); 
		   mav.addObject("message", "Logged out successfully");
		 
		return mav;
	}

}
