package com.org.practice.login.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.practice.login.model.service.LoginService;
import com.org.practice.login.model.vo.LoginMember;

@Controller
public class LoginController {

	
	@Autowired
	private LoginService service;
	
	
	@RequestMapping("/test.do")
	public @ResponseBody HashMap<String, Object> test() {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("msg", "안녕");
		return result;
	}
	
	@RequestMapping("/signIn.do")
	public @ResponseBody HashMap<String, LoginMember> memberSignin(@RequestParam String id) {
		LoginMember info = service.memberSignIn(id);
		HashMap<String, LoginMember> result = new HashMap<String, LoginMember>();
		result.put("info", info);
		System.out.println(info);
		return result;
	}
}
