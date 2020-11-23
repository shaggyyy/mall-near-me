package com.MallNearMe.Services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.MallNearMe.DAO.CustomerDAO;
import com.MallNearMe.pojo.Customer;

public class CustomerService {
	
	public static void addCustomer(Customer customer)
	{
		Resource resource = new ClassPathResource("application-context.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		CustomerDAO customerDAO = (CustomerDAO)beanfactory.getBean("cust");
		customerDAO.insertCustomer(customer);
	}
}
