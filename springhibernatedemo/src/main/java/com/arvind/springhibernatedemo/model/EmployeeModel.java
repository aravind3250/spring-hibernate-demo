package com.arvind.springhibernatedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "empid")
	private String empId;
	@Column
	private String email;
	@Column
	private String designation;
	@Column(name = "skillset")
	private String skillSet;
	@Column
	private String gender;
	@Column
	private String password;
	@Column
	private String salary;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getDesignation() {
		return designation;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public String getGender() {
		return gender;
	}

	public String getPassword() {
		return password;
	}

	public String getSalary() {
		return salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	
	
}
