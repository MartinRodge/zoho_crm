package com.zohocrm.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender emailSender1;
	
	@Override
	public void sendSimpleMessage(String to, String subject, String text) {


		
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
		emailSender1.send(message);
	}

}
