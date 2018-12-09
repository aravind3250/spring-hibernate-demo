package com.arvind.springhibernatedemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arvind.springhibernatedemo.dao.EmployeeDAO;
import com.arvind.springhibernatedemo.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<EmployeeModel> get() {
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public EmployeeModel get(int id) {
		return employeeDAO.get(id);
	}

	@Transactional
	@Override
	public boolean save(EmployeeModel employee) {
		return employeeDAO.save(employee);
	}

	@Transactional
	@Override
	public boolean update(EmployeeModel employee) {
		return employeeDAO.update(employee);
	}

	@Transactional
	@Override
	public boolean delete(int id) {
		return employeeDAO.delete(id);

	}

}
