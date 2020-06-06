package com.org.practice.signup.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpDaoImpl implements SignUpDao{

	@Override
	public String checkId(SqlSessionTemplate session, String id) {
		System.out.println("=============================");
		System.out.println(id);
		String s = session.selectOne("signUp.checkId", id);
		System.out.println(s);
		return s;
//		return session.selectOne("signUp.checkId", id);
	}

		
		
		
}
