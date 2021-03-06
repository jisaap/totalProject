package com.org.practice.email.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.practice.email.service.MailService;

@Controller
public class MailController {

	
	@Autowired
	MailService mailService;
	
	@RequestMapping("checkEmail")
	@ResponseBody
	public Map<String, Boolean> checkEmail(String email, HttpServletRequest request) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		HttpSession session = request.getSession(true);
		String subject ="인증 메일 발송 문구";
//		메일 인증번호 생성
		String ckMail = checkEmail();
		StringBuilder sb = new StringBuilder();
		sb.append("메일 인증 번호는 " + ckMail + "입니다.");
		map.put("answer", mailService.send(subject, sb.toString(), "lgwan840@gmail.com", email)?true:false);
		map.put(ckMail,true);
		//메일 인증 어떤 식으로 할지 정하기
		return map;
	}
	
	
	
	
	
	public void forSendEmail(String userEmail, String title, String msg,  HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String subject = title;
		StringBuilder sb = new StringBuilder();
		sb.append(msg);
		mailService.send(subject, sb.toString(), "lgwan840@gmail.com", userEmail);
	}
	
	
	public String checkEmail() {
		int ran = new Random().nextInt(900000) + 100000;
		return String.valueOf(ran);
	}
	
}
