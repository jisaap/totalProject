package com.org.practice.login.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.org.practice.login.model.vo.LoginMember;

public interface LoginDao {

	
	public LoginMember memberSignIn(SqlSessionTemplate session, String id);
}
