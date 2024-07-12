package com.webappbasic.springboot.webappbasic.hello;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean isValidUser() {return true;}
}
