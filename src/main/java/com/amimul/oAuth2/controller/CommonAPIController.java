package com.amimul.oAuth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;
import java.security.Principal;
import java.util.Set;

@RestController
public class CommonAPIController {
    @GetMapping("/")
    public String homePage(){
        return "Hello people to our home";
    }
    @GetMapping("/common")
    public String commonPage(){
        return "Hello common people";
    }

    @GetMapping("/secured")
    public String securedPage(){
        return "Hello Secured people";
    }

    @GetMapping("/user")
    public Principal getUserDetails(Principal principal){
        System.out.println(principal.getName());
        return principal;
    }
}
