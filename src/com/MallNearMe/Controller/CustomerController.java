package com.MallNearMe.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.MallNearMe.Services.CustomerService;
import com.MallNearMe.pojo.Customer;

public class CustomerController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String name = request.getParameter("name");
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String password = request.getParameter("pass");
		String role = "user";
	
		CustomerService.addCustomer(new Customer(name,username,password,role,contact,email));
		ModelAndView model = new ModelAndView("login");
		
		return model;
	}
	
	

}
