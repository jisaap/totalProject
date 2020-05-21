package com.org.practice.checkEntry.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.practice.checkEntry.model.dao.CheckEntryDao;

@Service
public class CheckEntryServiceImpl implements CheckEntryService {

	@Autowired
	private CheckEntryDao dao;
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public String checkName(String name) {
		int result =  dao.checkName(session, name);
		String msg = "";
		if(result == 0) msg = "접속 실패";
		else msg = "접속 성공";
		return msg;
	}
	
	
	
}
