package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HiController {

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHelloByNameGet(@RequestParam String fname,ModelMap map) {
		map.addAttribute("fname", fname+" GET STYLE");
		return "hello";
	}
	
	@RequestMapping(value = "/hi",method = RequestMethod.POST)
	public String sayHelloByNamePost(@RequestParam String fname,ModelMap map) {
		map.addAttribute("fname", fname+" POST STYLE");
		return "hello";
	}
}
