package com.org.practice.email.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.org.practice.email.service.MailService;

@Controller
public class MailController {

	
	@Autowired
	MailService mailService;
	

	
	public void forSendEmail(String userEmail, String title, String msg,  HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String subject = title;
		StringBuilder sb = new StringBuilder();
		sb.append(msg);
		mailService.send(subject, sb.toString(), "lgwan840@gmail.com", userEmail);
	}
	
}
