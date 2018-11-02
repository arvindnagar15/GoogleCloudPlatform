package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeBO {
	
	private Logger logger = LoggerFactory.getLogger(EmployeeBO.class);
	
	@Autowired
	private Employee employee;
	
	public String getEmployee() {
		String s = employee.getName()+" : Email : "+employee.getEmail()+" : Address : "+employee.getAddress();
		logger.debug("s : "+s);
		logger.info("s : "+s);
		System.out.println("s : "+s);
		return s;
	}
}
