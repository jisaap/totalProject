package com.org.practice.signup.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.practice.signup.model.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	SignUpService service;
	


	@RequestMapping("/signUp.do")
	public String memberSignUp() {
		return "signUp";
		}
	
	
	
	@RequestMapping("/signUpMem")
	public String signUp() {
		
		
		
		
		return "home";
	}
	
	@RequestMapping("/checkId")
	@ResponseBody
	public String checkId(String id) {
		
		return service.checkId(id);
	}
	
}