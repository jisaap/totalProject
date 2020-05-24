package com.org.practice.login.model.service;

import java.util.Map;

import com.org.practice.login.model.vo.LoginMember;

public interface LoginService {

	
	public LoginMember memberSignIn(Map<String, String> map);
}
