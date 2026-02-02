package com.xworkz.modules.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OTP {
    @Autowired
    private JavaMailSender emailSender;

    public String generateOtp() {
        return String.valueOf(100000 + new Random().nextInt(900000));
    }

    public void sendSimpleMessage(
            String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("chethanbabu1708@gmail.com");  // two step verified email
        message.setTo("chethanbabu1708@gmail.com");
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }

}
