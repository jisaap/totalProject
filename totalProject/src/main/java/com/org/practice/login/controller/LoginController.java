package com.org.practice.login.controller;

import java.util.HashMap;
import java.util.Map;

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
		result.put("msg", "¼º°ø");
		return result;
	}
	
	@RequestMapping("/signIn.do")
	@ResponseBody
	public HashMap<String, LoginMember> memberSignin(@RequestParam Map map) {
		System.out.println(map);
		LoginMember info = service.memberSignIn(map);
		HashMap<String, LoginMember> result = new HashMap<String, LoginMember>();
		result.put("info", info);
		System.out.println(info);
		return result;
	}
}
