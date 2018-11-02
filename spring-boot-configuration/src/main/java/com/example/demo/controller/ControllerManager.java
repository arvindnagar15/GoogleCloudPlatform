/**
 * 
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.EmployeeBO;

/**
 * @author Scorpio
 *
 */
@RestController
public class ControllerManager {
	private Logger logger = LoggerFactory.getLogger(ControllerManager.class);
	@Autowired
	private EmployeeBO employeeBO;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello() {
		logger.debug("This is sayHello ()");
		logger.info("This is sayHello ()");
		logger.trace("This is sayHello ()");
		logger.error("This is sayHello ()");
		logger.warn("This is sayHello ()");
		return employeeBO.getEmployee();
	}
}
