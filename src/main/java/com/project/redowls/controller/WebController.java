package com.project.redowls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	
	@GetMapping("/")
	public String index(Model model) throws Exception {
		model.addAttribute("greeting", "Hello Thymeleaf!");
		return "work-gid/voice";
	}
	
	@GetMapping("/main")
	public String main(Model model) throws Exception {
		model.addAttribute("greeting", "Hello Thymeleaf!");
		return "work-gid/main";
	}

	@GetMapping("/login")
	public String login(Model model) throws Exception {
		model.addAttribute("greeting", "Hello Thymeleaf!");
		return "work-gid/login";
	}
	
	@GetMapping("/join")
	public String join(Model model) throws Exception {
		model.addAttribute("greeting", "Hello Thymeleaf!");
		return "work-gid/join";
	}
	

}
