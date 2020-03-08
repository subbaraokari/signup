package com.spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Role;

@Repository
@Transactional
public class RoleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Role getRoleByName(String roleName) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(Role.class);
		cr.add(Restrictions.eq("name", roleName));
		Role roleObj = (Role) cr.uniqueResult();
		return roleObj;
	}
	public boolean saveRole(Role role) {
		Session session=this.sessionFactory.getCurrentSession();
		if(session.save(role)!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
