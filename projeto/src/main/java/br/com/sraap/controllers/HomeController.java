package br.com.sraap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/publico/login")
	public String login() {
		return "publico/login";
	}
	
	@RequestMapping("/")
	public String index() {
		return "publico/index";
	}
	
	@RequestMapping("/privado/home")
	public String home() {
		return "privado/home";
	}
}
