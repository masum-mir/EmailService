package com.mail.controllers;

import com.mail.entity.EmailRequest;
import com.mail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController {


    @Autowired
    private EmailService emailService;

    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
//        emailService.send
        return null;
    }

}
