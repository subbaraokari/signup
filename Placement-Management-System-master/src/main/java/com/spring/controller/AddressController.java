package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.domain.Address;

//@SessionAttributes({ "user" })
@Controller
public class AddressController {
	
	/*
	 * @InitBinder public void initBinder(WebDataBinder dataBinder) {
	 * 
	 * StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	 * 
	 * dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); }
	 */
	
	@RequestMapping(value = "/saveAddress",method = RequestMethod.POST)
	public String saveAddress(HttpServletRequest request,HttpSession session) {
		String street_name=request.getParameter("street_name");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		Address address=new Address();
		address.setStreet_name(street_name);
		address.setCity(city);
		address.setState(state);
		address.setCountry(country);
		session.setAttribute("address", address);
		return "senior";
	}
}

