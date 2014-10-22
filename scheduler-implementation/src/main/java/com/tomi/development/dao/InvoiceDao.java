package com.tomi.development.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tomi.development.model.Invoice;

@Repository
public class InvoiceDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public String save(Invoice invoice) {
		return (String) sessionFactory.getCurrentSession().save(invoice);
	}
	
	public void update(Invoice invoice) {
		sessionFactory.getCurrentSession().merge(invoice);
	}
}
