package com.concordia.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.concordia.app.dao.ClientDAO;
import com.concordia.app.dao.ICarCatalogue;
import com.concordia.app.dao.IClient;
import com.concordia.app.dao.TransactionDAO;
import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.Client;
import com.concordia.app.vo.login;
import com.concordia.app.vo.trans;

@Controller

public class CarCatalogueController {

	@Autowired
	private ICarCatalogue CarCatalogueDAO;
	
	@Autowired
	private IClient ClientDAO;
	
	
	@Autowired
	CarCatalogue car = new CarCatalogue();
	
	

	@RequestMapping("/carCatalogueSearch")
	public ModelAndView searchCarCatalogue(HttpServletRequest request) {

		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("CarView");

		modelAndView.addObject("list", list);

		return modelAndView;

	}

	
	
	@RequestMapping("Yes/{lnValue}")
	public ModelAndView Yes(@PathVariable String lnValue) {

		//System.out.println(licenceNum);
		
		CarCatalogueDAO.updateRented(lnValue);
		
		System.out.println("Notavilable");
		
		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("CarView");

		modelAndView.addObject("list", list);

		return modelAndView;

	}
	
	
	@RequestMapping("No/{lnValue}")
	public ModelAndView No(@PathVariable String lnValue ) {

		System.out.println(lnValue);
		
		String licenceNum=lnValue;
		CarCatalogueDAO.updateAvailable(licenceNum);
		
		System.out.println("Available");
		
		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("CarView");

		modelAndView.addObject("list", list);

		return modelAndView;

	}

	
	
	
	@RequestMapping("/addCar")
	public ModelAndView addCar(HttpServletRequest request) {

		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("AddVehicleView");

		modelAndView.addObject("list", list);

		return modelAndView;

	}

	@RequestMapping(value = "/addCarProcess", method = RequestMethod.POST)
	public ModelAndView addCarProcess(@RequestParam("carId") int id, @RequestParam("type") String type,
			@RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("year") String year,
			@RequestParam("color") String color, @RequestParam("licenseNum") String licenseNum,
			@RequestParam("status") String status) {

		String message = "";

		/*
		 * System.out.println(id); System.out.println(type); System.out.println(make);
		 * System.out.println(model); System.out.println(year);
		 * System.out.println(color); System.out.println(licenseNum);
		 */

		car.setCarId(id);
		car.setType(type);
		car.setMake(make);
		car.setModel(model);
		car.setYear(year);
		car.setColor(color);
		car.setLicenceNum(licenseNum);
		car.setStatus(status);

		System.out.println(car);

		CarCatalogue list = CarCatalogueDAO.add(car);

		System.out.println(list);
		message = "Record successfully added";

		System.out.println(message);
		
		List<CarCatalogue> list1 = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("CarViewAdmin");

		modelAndView.addObject("list", list1);

		modelAndView.addObject("message", message);
		return modelAndView;

	}

	@RequestMapping("/handleReservation")
	public ModelAndView reservation(HttpServletRequest request) {

		int cid = 1;

		CarCatalogue carCatalogue = CarCatalogueDAO.findById(cid);

		ModelAndView modelAndView = new ModelAndView("CarView");

		modelAndView.addObject("carCatalogue", carCatalogue);

		return modelAndView;	

	}

	@RequestMapping("/handleRental")
	public ModelAndView rental(HttpServletRequest request) {

		int cid = 1;

		CarCatalogue carCatalogue = CarCatalogueDAO.findById(cid);

		ModelAndView modelAndView = new ModelAndView("CarView");

		modelAndView.addObject("carCatalogue", carCatalogue);

		return modelAndView;

	}

	@RequestMapping("/vehicle")
	public ModelAndView searchvehicle(HttpServletRequest request) {

		List<CarCatalogue> list = CarCatalogueDAO.findCarCatalogue();
	
		ModelAndView modelAndView = new ModelAndView("CarViewAdmin");

		modelAndView.addObject("list", list);

		return modelAndView;
	}

	@RequestMapping(value = "/updatecar/{id}", method = RequestMethod.GET)
	public ModelAndView updatevehicle(@PathVariable int id) {
		System.out.println(id);

		CarCatalogue carCatalogue = CarCatalogueDAO.findById(id);
		ModelAndView modelAndView = new ModelAndView("UpdateVehicleView");
		modelAndView.addObject("carCatalogue", carCatalogue);
		return modelAndView;
	}

	@RequestMapping(value="/updateCarProcess",method= RequestMethod.POST)
	public  ModelAndView updatevehicleprocess( @ModelAttribute("carCatalogue") CarCatalogue carCatalogue,
			BindingResult bindingResult,HttpServletRequest request) {
 		  
	//CarCatalogue carCatalogue1= CarCatalogueDAO.findById(carCatalogue.getCarId());
	CarCatalogueDAO.update(carCatalogue);

	List<CarCatalogue> list1 = CarCatalogueDAO.findCarCatalogue();

	ModelAndView modelAndView = new ModelAndView("CarViewAdmin");

	modelAndView.addObject("list", list1);
	modelAndView.addObject("carCatalogue", carCatalogue);
	return modelAndView;

} 
	
	
	@RequestMapping(value = "/updatecarview/{id}", method = RequestMethod.GET)
	public ModelAndView updatecarview(@PathVariable int id) {
		System.out.println(id);

		CarCatalogue carCatalogue = CarCatalogueDAO.findById(id);
		System.out.println(carCatalogue);
		ModelAndView modelAndView = new ModelAndView("carDetailedView");
		modelAndView.addObject("carCatalogue", carCatalogue);
		return modelAndView;
	}

	
	
	@RequestMapping(value = "/reserveCar/{id}", method = RequestMethod.GET)
	public ModelAndView reserveCar(@PathVariable int id) {
		System.out.println(id);
		trans tran=new trans();
		CarCatalogue carCatalogue = CarCatalogueDAO.findById(id);
		List<String>  col = new ArrayList<String>();
		List<Client> list1 = ClientDAO.getAllClientDetails();
		for(Client si : list1 ){
			   col.add(si.getClientDL());
			}
		
	//	System.out.println(carCatalogue);
		System.out.println(list1);
		System.out.println(col);
		ModelAndView modelAndView = new ModelAndView("reserveView");
		modelAndView.addObject("carCatalogue", carCatalogue);
		modelAndView.addObject("list1", list1);
		modelAndView.addObject("tran", tran);
		return modelAndView;
	}
	
	
	
	@RequestMapping(value = "/Deletecar/{id}", method = RequestMethod.GET)
	public ModelAndView deletevehicle(@PathVariable int id) {
		// CarCatalogue
		System.out.println(id);
		String message = "";
		CarCatalogueDAO.delete(id);
		message = "Record successfully deleted";
		System.out.println(message);

		List<CarCatalogue> ls = CarCatalogueDAO.findCarCatalogue();

		ModelAndView modelAndView = new ModelAndView("CarViewAdmin");
		modelAndView.addObject("ls", ls);
		return modelAndView;

	}
	
}
