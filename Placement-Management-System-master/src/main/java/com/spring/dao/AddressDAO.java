package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Address;


@Repository
@Transactional
public class AddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Boolean saveAddress(Address addressIns) {
		Session session = this.sessionFactory.getCurrentSession();
		if(session.save(addressIns) != null) {
			return true;
		}
		else {
			return false;
		}
	}

}
