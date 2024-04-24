package com.campus.campus.user.controller;

import com.campus.campus.user.dto.MemberDto;
import com.campus.campus.user.service.MemberSaveService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final MemberSaveService memberSaveService;


    @GetMapping("/join")
    public String join(MemberDto form){

        return"/user/join";
    }

    @PostMapping("/join")
    public String joinProcess(Model model , MemberDto form){

        if(!form.getPassword().equals(form.getPassword2())){
            model.addAttribute("PasswordConfirmErrMsg" , "비밀번호 확인이 다릅니다.");

        }memberSaveService.save(form);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){

        return"/user/login";
    }



}
