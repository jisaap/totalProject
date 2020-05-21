package com.org.practice.checkEntry.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

public interface CheckEntryDao {

	
	public int checkName(SqlSessionTemplate session, String name);
}
