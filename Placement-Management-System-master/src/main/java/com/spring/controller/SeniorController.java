package com.spring.controller ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.AddressDAO;
import com.spring.dao.RoleDAO;
import com.spring.dao.SeniorDAO;
import com.spring.dao.UserDAO;
import com.spring.domain.Address;
import com.spring.domain.Company;
import com.spring.domain.Role;
import com.spring.domain.Senior;
import com.spring.domain.User;

@Controller
public class SeniorController {
	@Autowired
	UserDAO userDao;
	@Autowired
	RoleDAO roleDao;
	@Autowired
	AddressDAO addressDao;
	@Autowired
	SeniorDAO seniorDao;
	/*
	 * @InitBinder public void initBinder(WebDataBinder dataBinder) {
	 * StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	 * dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); }
	 */
	
	@RequestMapping(value="/saveSenior",method = RequestMethod.POST)
	public String saveSenior(HttpServletRequest request,HttpSession session,Model model) {
		String designation=request.getParameter("designation");
		Integer yearOfPassing=Integer.parseInt(request.getParameter("yearOfPassing"));
		String department=request.getParameter("department");
		String cname=request.getParameter("cname");
		String createdBy=request.getParameter("createdBy");
		String description=request.getParameter("description");
		Senior senior=new Senior();
		senior.setDesignation(designation);
		senior.setYearOfPassing(yearOfPassing);
		senior.setDepartment(department);
		Company company=new Company();
		company.setName(cname);
		company.setCreatedBy(createdBy);
		company.setDescription(description);	
		User user=(User) session.getAttribute("user");
		Role role=(Role) session.getAttribute("role");
		Address address=(Address) session.getAttribute("address");
		user.setAddress(address);
		Role role1=roleDao.getRoleByName(role.getName());
		user.setRole(role1);
		role1.add(user);
		address.add(user);
		userDao.saveUser(user);
		addressDao.saveAddress(address);
		senior.setCompany(company);
		seniorDao.saveSenior(senior);
		model.addAttribute("user",user.getFirstName()+"\t"+user.getLastName());
		
		return "seniorHome";
	}
}