package com.concordia.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.ICarCatalogue;
import com.concordia.app.vo.CarCatalogue;

@Controller
public class CarCatalogueController {
	
	@Autowired
	private ICarCatalogue CarCatalogueDAO ;
	
	@RequestMapping(value="/carCatalogueSearch")
	public String searchCarCatalogue(HttpServletRequest request,Model model) {
		
		int cid= Integer.parseInt(request.getParameter("id"));
		
		CarCatalogue carCatalogue= CarCatalogueDAO.findById(cid); 
		System.out.println(carCatalogue.getCarId());
		System.out.println(carCatalogue.getColor());
		
		List<CarCatalogue>  listOfCatalogs = CarCatalogueDAO.findCarCatalogue();
		
		//ModelAndView modelAndView = new ModelAndView("CarView");
		
		//modelAndView.addObject("car", carCatalogue);
	    model.addAttribute("carCatalogue", carCatalogue);
//		model.addAttribute("id",carCatalogue.getCarId());
//		model.addAttribute("status",carCatalogue.getStatus());
//		
		model.addAttribute("list",listOfCatalogs);
		
		return "CarView";
		
		
	}

}
