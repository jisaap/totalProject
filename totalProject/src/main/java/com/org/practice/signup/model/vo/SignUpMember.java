package com.org.practice.signup.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpMember {

	
	private String memNumber;
	private String memId;
	private String memPw;
	private String memName;
	private String memPhone;
	private String memAddr;
	
}
