package com.MallNearMe.Services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.MallNearMe.DAO.ContactUsDAO;
import com.MallNearMe.pojo.ContactUs;

public class ContactUsService {
	
	public static void addContactUs(ContactUs contactUs)
	{
		Resource resource = new ClassPathResource("application-context.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		ContactUsDAO contactUsDAO = (ContactUsDAO)beanfactory.getBean("Contact");
		contactUsDAO.insertContactUs(contactUs);
	}

}
