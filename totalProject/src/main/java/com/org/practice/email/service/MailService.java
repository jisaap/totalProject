package com.org.practice.email.service;

public interface MailService {

	public boolean send(String subject, String text, String from, String to);
	
}
