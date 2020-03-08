package com.spring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.SeniorDAO;
import com.spring.domain.Address;
import com.spring.domain.Role;
import com.spring.domain.Senior;
import com.spring.domain.User;
import com.spring.dto.AddressDto;
import com.spring.dto.SeniorDto;
import com.spring.dto.UserDto;

@Controller
//@SessionAttributes("senior")
public class UserController {

	@Autowired
	private SeniorDAO seniorDao;

	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) {
	 * 
	 * StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	 * 
	 * binder.registerCustomEditor(String.class, stringTrimmerEditor);
	 * 
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	 * binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,
	 * true)); }
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		/*
		 * ModelAndView model = new ModelAndView("index"); User user = new User();
		 * model.addObject(user);
		 */
		return "index";
	}
	/*
	 * @RequestMapping("/show") public String showIndex(Model model) {
	 * model.addAttribute("user", new Senior()); return "index"; }
	 */

	/*
	 * @RequestMapping("/saveUser") public ModelAndView
	 * saveUser(@RequestParam(required=false,name="first_name") String firstName,
	 * 
	 * @RequestParam(required=false,name="last_name") String lastName,
	 * 
	 * @RequestParam(required=false,name="password") String password,
	 * 
	 * @RequestParam(required=false,name="confirm_password") String cpassword,
	 * 
	 * @RequestParam(required=false,name="email") String email,
	 * 
	 * @RequestParam(required=false,name="mobile") String mobile,
	 * 
	 * @RequestParam(required=false,name="date_of_birth") String dateOfBirth,
	 * 
	 * @RequestParam(required=false,name="gender") String gender ) throws
	 * ParseException { Senior senior = new Senior();
	 * senior.setFirstName(firstName); senior.setLastName(lastName);
	 * if(password==cpassword) { senior.setPassword(cpassword); }
	 * senior.setEmail(email); senior.setMobile(mobile); SimpleDateFormat sdf = new
	 * SimpleDateFormat("dd/MM/yyyy");
	 * senior.setDateOfBirth(sdf.parse(dateOfBirth)); senior.setGender(gender);
	 * System.out.println("index"); Boolean res = seniorDao.saveSenior(senior);
	 * ModelAndView model = null; if(res) { System.out.println("address"); model =
	 * new ModelAndView("address"); } return model; }
	 */

	/*
	 * @RequestMapping("/saveUser")
	 * 
	 * public ModelAndView saveUser(@ModelAttribute("user") UserDto
	 * userDto,BindingResult bindingresult,ModelAndView model) {
	 * 
	 * if (bindingresult.hasErrors()) { System.out.println("index"); model = new
	 * ModelAndView("index"); } else { //System.out.println("address"); Address
	 * address=new Address(); model = new ModelAndView("address");
	 * model.addObject(address);
	 * 
	 * } return model; }
	 */

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(HttpServletRequest request, HttpSession session) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobileNo = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String date = request.getParameter("dob");
		String roleName = request.getParameter("role");
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setEmail(email);
		user.setMobile(mobileNo);
		user.setGender(gender);
		user.setDateOfBirth(new Date(date));
		Role role = new Role();
		role.setName(roleName);
		role.setDescription(roleName);
		session.setAttribute("user", user);
		session.setAttribute("role", role);
		return "address";
	}

}
