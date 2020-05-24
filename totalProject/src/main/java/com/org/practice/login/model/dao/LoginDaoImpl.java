package com.org.practice.login.model.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.org.practice.login.model.vo.LoginMember;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Override
	public LoginMember memberSignIn(SqlSessionTemplate session, Map<String, String> map) {
		return session.selectOne("login.selectMember", map.get("id"));
	}
}
