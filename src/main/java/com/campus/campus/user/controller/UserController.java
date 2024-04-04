package com.campus.campus.user.controller;

import com.campus.campus.user.dto.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/join")
    public String join(){

        return"/user/join";
    }

    @PostMapping("/join")
    public String joinProcess(MemberDto form){
        System.out.println(form+"/////////////////////////////");
        return"/index";
    }

    @GetMapping("/login")
    public String login(){

        return"/user/login";
    }










}
