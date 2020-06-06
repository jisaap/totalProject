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
	public String memberSignUp(String id) {
		return "signUp";
		}
	
	
	
	@RequestMapping("/signUpMem")
	public String signUp() {
		
		
		
		
		return "home";
	}
	
	@RequestMapping("/checkId.do")
	@ResponseBody
	public String checkId(String id) {
		String msg = "";
		if(id != "") {
			msg = service.checkId(id);
			if(msg != null)msg = "중복된 아이디 입니다.";
			else msg = "사용가능한 아이디 입니다.";
		}else {
			msg = "아이디를 입력해 주세요.";
		}
		
		return msg;
	}
	
}
