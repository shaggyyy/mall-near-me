package com.MallNearMe.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.MallNearMe.DAO.MallDAO;
import com.MallNearMe.pojo.Mall;

public class SearchMall implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String locality = request.getParameter("locality");
		Resource resource = new ClassPathResource("application-context.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		MallDAO mallDAO = (MallDAO)beanfactory.getBean("Mall");
		List<Mall> malls = mallDAO.searchMall(locality);
		return new ModelAndView("Mallhome","Mall",malls);
	}

}
