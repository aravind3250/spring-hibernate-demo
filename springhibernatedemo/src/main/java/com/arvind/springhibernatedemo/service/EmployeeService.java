package com.arvind.springhibernatedemo.service;

import java.util.List;

import com.arvind.springhibernatedemo.model.EmployeeModel;

public interface EmployeeService {
	
	public List<EmployeeModel> get();
	
	public EmployeeModel get(int id);
	
	public boolean save(EmployeeModel employee);
	
	public boolean update(EmployeeModel employee);
	
	public boolean delete(int id);
}
