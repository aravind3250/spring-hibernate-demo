package com.arvind.springhibernatedemo.dao;

import java.util.List;

import com.arvind.springhibernatedemo.model.EmployeeModel;

public interface EmployeeDAO {
	public List<EmployeeModel> get();
	
	public EmployeeModel get(int id);
	
	public boolean save(EmployeeModel employee);
	
	public boolean update(EmployeeModel employee);
	
	public boolean delete(int id);
}
