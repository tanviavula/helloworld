package com.lwl.hw.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = { "/", "/hello" }, method = RequestMethod.GET)
	public String greetings() {
		return "Welcome to spring boot version: 1.5..22";
	}
}
