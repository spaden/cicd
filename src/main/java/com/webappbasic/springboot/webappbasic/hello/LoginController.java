package com.webappbasic.springboot.webappbasic.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @Autowired
    private AuthenticationService authService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginMessage() {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String redirect() {
        if(authService.isValidUser()) {
            return "welcome";
        }
        return "";
    }

}
