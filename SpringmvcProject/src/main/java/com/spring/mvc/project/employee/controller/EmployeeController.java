package com.spring.mvc.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.project.employee.Employee;
import com.spring.mvc.project.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("registration")
	public String loginPage()
	{
		return "add";
		
	}
	
	@RequestMapping(value="insertEmployee", method = RequestMethod.POST)
	public String get(Employee emp, ModelMap map)
	{
		System.out.println("inside controller");
		int result=employeeService.create(emp);
		System.out.println(result);	
		map.addAttribute("result", result);
		return "success";
		
	}
	@RequestMapping("/createEmployee")
	public int createEmployee(@RequestBody Employee emp)
	{
		int result=employeeService.create(emp);
	
		return result;
		
	}
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee emp) 
	{
		employeeService.update(emp);
		System.out.println("updated");
	}
	
	@RequestMapping("getDetails")
	public List<Employee> getDetails()
	{
		List<Employee> list=employeeService.getDetails();
		//map.addAttribute("list", list);
		return list;
		
	}
	@RequestMapping("/getDetail/{id}")
	public Employee getDetails1(@PathVariable("id") int id)
	{
		Employee e=employeeService.getdetail(id);
		
		//map.addAttribute("list", list);
		return e;
		
	}

}
