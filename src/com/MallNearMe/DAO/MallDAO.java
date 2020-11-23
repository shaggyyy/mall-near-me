package com.MallNearMe.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.MallNearMe.pojo.Mall;

public class MallDAO {

HibernateTemplate template;
	
	public MallDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public List<Mall> searchMall(String obj)
	{
		Session session = template.getSessionFactory().openSession();
		Criteria c = session.createCriteria(Mall.class);
		c.add(Restrictions.ilike("Locality", obj));
		return c.list();
	}
	
	
	
	
}
