package com.realworld.project.application.port.in.mail;

import com.realworld.project.domain.AuthMail;
import jakarta.mail.MessagingException;

import java.io.UnsupportedEncodingException;

public interface GetMailUseCase {
    AuthMail emailAuth(String email) throws MessagingException, UnsupportedEncodingException;
}
