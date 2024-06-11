package com.mail.services.impl;

import com.mail.services.EmailService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String to, String subject, String message) {
        SimpleMailMessage  simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        simpleMailMessage.setFrom("masummir773@gmail.com");
        mailSender.send(simpleMailMessage);
    }

    @Override
    public void sendEmail(String[] to, String subject, String message) {
        SimpleMailMessage  simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        simpleMailMessage.setFrom("masummir773@gmail.com");
        mailSender.send(simpleMailMessage);
    }

    @Override
    public void sendEmailWithHtml(String to, String subject, String htmlMessage) {
        MimeMessage simpleMimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(simpleMimeMessage, true, "UTF-8");
helper.setTo(to);
helper.setSubject(subject);
helper.setText(htmlMessage, true);
helper.setFrom("masummir773@gmail.com");
mailSender.send(simpleMimeMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void sendEmail(String to, String subject, String message, File filePath) {
        MimeMessage simpleMimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(simpleMimeMessage, true, "UTF-8");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(message);
            helper.setFrom("masummir773@gmail.com");

            FileSystemResource file = new FileSystemResource(filePath);
            if(file.exists()) {
                helper.addAttachment(file.getFilename(), file);
            } else {
                throw new RuntimeException("Attachment file not found");
            }

            mailSender.send(simpleMimeMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendEmail(String[] to, String subject, String message, File file) {

    }
}
