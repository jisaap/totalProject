package com.org.practice.login.model.service;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.practice.login.model.dao.LoginDao;
import com.org.practice.login.model.vo.LoginMember;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private LoginDao dao;
	
	@Override
	public LoginMember memberSignIn(Map<String, String> map) {

		return dao.memberSignIn(session, map);
	}
	
	
	
}
