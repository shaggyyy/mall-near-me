package com.MallNearMe.DAO;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.MallNearMe.pojo.ContactUs;

public class ContactUsDAO {
	
HibernateTemplate template;
	

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void insertContactUs(Object obj)
	{
		if(obj instanceof ContactUs)
		{
			ContactUs contactus = (ContactUs) obj;
			template.save(contactus);
		}
	}

}
