package com.org.practice.signup.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpDaoImpl implements SignUpDao{

	@Override
	public String checkId(SqlSessionTemplate session, String id) {
		return session.selectOne("checkId", id);
	}

		
		
		
}
