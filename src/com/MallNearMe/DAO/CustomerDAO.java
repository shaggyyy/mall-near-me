package com.MallNearMe.DAO;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.MallNearMe.pojo.Customer;

public class CustomerDAO {
	
	HibernateTemplate template;
	
	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void insertCustomer(Object obj)
	{
		if(obj instanceof Customer)
		{
			Customer customer = (Customer) obj;
			template.save(customer);
		}
	}
	
	
	

}
