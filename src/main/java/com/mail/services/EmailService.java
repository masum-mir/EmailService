package com.mail.services;

import java.io.File;

public interface EmailService {
    void sendEmail(String to, String subject, String message);
    void sendEmail(String[] to, String subject, String message);
    void sendEmailWithHtml(String to, String subject, String htmlMessage);
    void sendEmail(String to, String subject, String message, File file);
    void sendEmail(String[] to, String subject, String message, File file);
}
