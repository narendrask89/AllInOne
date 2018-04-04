package com.nandulabs.all;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello world";
	}
}
