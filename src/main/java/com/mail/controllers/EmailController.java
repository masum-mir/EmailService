package com.mail.controllers;

import com.mail.entity.EmailRequest;
import com.mail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequstMapping("/api/v1/email")
public class EmailController {


    @Autowired
    private EmailService emailService;

    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
        emailService.send
    }

}
