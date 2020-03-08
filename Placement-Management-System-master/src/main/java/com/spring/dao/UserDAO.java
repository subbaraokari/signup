package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.User;


@Repository
@Transactional
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Boolean saveUser(User userIns) {
		Session session = this.sessionFactory.getCurrentSession();
		if(session.save(userIns) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
