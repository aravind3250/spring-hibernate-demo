package com.arvind.springhibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arvind.springhibernatedemo.model.EmployeeModel;
import com.arvind.springhibernatedemo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("employee", new EmployeeModel());
		return mav;
	}
	
	@RequestMapping(value = "/saveEmployee")
	public ModelAndView save(@ModelAttribute("employee") EmployeeModel employee) {
		ModelAndView mav = new ModelAndView("list-employee");
		try {
			if(employeeService.save(employee)) {
				mav.addObject("msg", "Data saved");
			}else {
				mav.addObject("msg", "Data not saved");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
