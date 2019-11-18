package com.concordia.app;

//package com.concordia.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.IReservation;
import com.concordia.app.vo.transaction;

@Controller
public class ReservationController {

	@Autowired
	private IReservation ReservationDAO;
	
	@RequestMapping("/reservationSearch")
	public ModelAndView searchReservation(HttpServletRequest request) {
	
		int cid= Integer.parseInt(request.getParameter("reservationId"));
		transaction trans = ReservationDAO.findById(cid);
		ModelAndView modelAndView = new ModelAndView("ReservationView");
		modelAndView.addObject("reservation", trans);
		
		return modelAndView;
	
	}
}
