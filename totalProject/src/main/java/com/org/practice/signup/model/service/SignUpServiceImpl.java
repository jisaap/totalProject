package com.org.practice.signup.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.practice.signup.model.dao.SignUpDao;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private SqlSessionTemplate session;

	@Autowired 
	private SignUpDao dao;
	
	
	
	
}
