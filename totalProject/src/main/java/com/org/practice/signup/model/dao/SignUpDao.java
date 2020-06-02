package com.org.practice.signup.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


public interface SignUpDao {

	
	public String checkId(SqlSessionTemplate session, String id);
}
