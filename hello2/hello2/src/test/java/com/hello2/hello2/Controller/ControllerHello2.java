package com.hello2.hello2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")

public class ControllerHello2 {
	
	@GetMapping
	public String hello2() {
		return "Hello Word\n Meu objetivo é ficar menos perdida";
	}
	

}
