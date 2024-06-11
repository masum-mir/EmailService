package com.mail.MailService;

import com.mail.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    EmailService emailService;

    @Test
    void emailSend() {

        emailService.sendEmail("masummir.lm@gmail.com","testing", "Success");
        System.out.println("sending message");
    }

    @Test
    void sendEmailWithHtml() {
        String msg = "<h1 style=color:red;>Welcome html message</h1>";
        emailService.sendEmailWithHtml("masummir.lm@gmail.com","testing", msg);
        System.out.println("sending message");
    }

    @Test
    void sendEmail() {
        emailService.sendEmail("masummir.lm@gmail.com","testing", "file send", new File("F:\\tt.PNG"));
        System.out.println("sending message");
    }
}
