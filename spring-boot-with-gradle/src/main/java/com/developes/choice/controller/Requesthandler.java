/**
 * 
 */
package com.developes.choice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Scorpio
 *
 */
@RestController
public class Requesthandler {

	@RequestMapping(name="hello", method=RequestMethod.GET)
	public String helloFiends(@RequestParam String name) {
		return "Hello "+name;
	}
}
