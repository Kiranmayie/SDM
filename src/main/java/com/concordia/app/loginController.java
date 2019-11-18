package com.concordia.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.Ilogin;
import com.concordia.app.vo.login;


@Controller
public class loginController {

	@Autowired
	
	private Ilogin loginDAO;
	
	@Autowired 
	private HttpSession httpSession;
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new login());
	    return mav;
	  }
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(@RequestParam("userName") String us, @RequestParam("Password") String password) {
		  
//		  String userName=(String) request.getAttribute("userName");
				  System.out.println(us);
	    ModelAndView mav = null;
	    login user = loginDAO.loginUser(us);
	    System.out.println(user);
	    System.out.println(us);
	    if (null != user) {
	    mav = new ModelAndView("clientdashboard");
	    mav.addObject("userName", user.getUserName());
	    } else {
	    mav = new ModelAndView("CarView");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	
	
}
