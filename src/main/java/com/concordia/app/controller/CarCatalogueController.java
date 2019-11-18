package com.concordia.app.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.ICarCatalogue;
import com.concordia.app.vo.CarCatalogue;

@Controller
public class CarCatalogueController {
	
	@Autowired
	private ICarCatalogue CarCatalogueDAO ;
	
	@RequestMapping("/carCatalogueSearch")
	public ModelAndView searchCarCatalogue(HttpServletRequest request) {
		

		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();
		
		
		ModelAndView modelAndView = new ModelAndView("CarView");
		
		modelAndView.addObject("list", list);
		
		return modelAndView;
		
		
	}
	
	@RequestMapping("/handleReservation")
	public ModelAndView reservation(HttpServletRequest request) {
		
		int cid= 1;
		
		CarCatalogue carCatalogue= CarCatalogueDAO.findById(cid); 
		
		ModelAndView modelAndView = new ModelAndView("CarView");
		
		modelAndView.addObject("carCatalogue", carCatalogue);
		
		return modelAndView;
		
		
	}
	
	@RequestMapping("/handleRental")
	public ModelAndView rental(HttpServletRequest request) {
		
		int cid= 1;
		
		CarCatalogue carCatalogue= CarCatalogueDAO.findById(cid); 
		
		ModelAndView modelAndView = new ModelAndView("CarView");
		
		modelAndView.addObject("carCatalogue", carCatalogue);
		
		return modelAndView;
		
		
	}

}