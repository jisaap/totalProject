package com.org.practice.checkEntry.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CheckEntryDaoImpl implements CheckEntryDao {
	
	
	@Override
	public int checkName(SqlSessionTemplate session, String name) {
		return session.insert("checkEntry.checkName", name);
	}

	
	
	
	
}
