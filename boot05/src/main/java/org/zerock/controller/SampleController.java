package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller, RequestMapping, GetMapping, PostMapping
@Controller
public class SampleController {

	@GetMapping("/sample1")
	public void sample1(Model model) {
		
		model.addAttribute("greeting", "Hello World");
		
	}
	
	
}
