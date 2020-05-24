package com.org.practice.checkEntry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.practice.checkEntry.model.service.CheckEntryService;

@Controller
public class CheckEntryController {

	@Autowired
	private CheckEntryService service;
	
	
	@RequestMapping("/checkEntry.do")
	@ResponseBody
	public String checkName(@RequestParam String name) {
		return service.checkName(name);
	}

	
	
	@RequestMapping("/joinHome.do")
	public String joinHome() {
	return "home";
	
	}
	
}
