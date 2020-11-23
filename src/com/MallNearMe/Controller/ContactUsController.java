package com.MallNearMe.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.MallNearMe.Services.ContactUsService;
import com.MallNearMe.pojo.ContactUs;

public class ContactUsController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String message = request.getParameter("message");
		
		ContactUsService.addContactUs(new ContactUs(username,email,contact,message));
		ModelAndView model = new ModelAndView("login");
		
		
		return model;
	}

}
