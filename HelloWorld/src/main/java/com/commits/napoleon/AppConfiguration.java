package com.commits.napoleon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
