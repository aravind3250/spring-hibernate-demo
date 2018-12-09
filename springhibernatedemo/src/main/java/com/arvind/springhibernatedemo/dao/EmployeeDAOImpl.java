package com.arvind.springhibernatedemo.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arvind.springhibernatedemo.model.EmployeeModel;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	/**
	 * fetch the list 
	 * */
	@Override
	public List<EmployeeModel> get() {
		List<EmployeeModel> list = null;
		try {
			Query<EmployeeModel> query = sessionFactory.getCurrentSession().createQuery("from EmployeeModel");
			list = query.getResultList();
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * fetch the single employee record
	 * */
	@Override
	public EmployeeModel get(int id) {
		EmployeeModel employee = null;
		try {
			Query<EmployeeModel> query = sessionFactory.getCurrentSession().createQuery("from EmployeeModel where id = :id");
			query.setParameter("id", id);
			employee = query.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return employee;
	}

	/**
	 * Saves the employee object
	 * */
	@Override
	public boolean save(EmployeeModel employee) {
		boolean flag = false;
		try {
			sessionFactory.getCurrentSession().save(employee);
			flag = true;
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * Update the employee object
	 * */
	@Override
	public boolean update(EmployeeModel employee) {
		boolean flag = false;
		try {
			sessionFactory.getCurrentSession().update(employee);
			flag = true;
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * delete the employee object based on id
	 * */
	@Override
	public boolean delete(int id) {
		boolean flag = false;
		EmployeeModel employee = null;
		try {
			employee = sessionFactory.getCurrentSession().get(EmployeeModel.class, id);
			sessionFactory.getCurrentSession().delete(employee);
			flag = true;
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
