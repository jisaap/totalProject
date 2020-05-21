package com.org.practice.login.model.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginMember {

	private String memNumber;
	private String memId;
	private String memPw;
	private String memName;
	private String memPhone;
	private String memAddr;
	
	
}
