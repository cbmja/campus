package com.campus.campus.answer.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

    private final MenuConfig menuConfig;


    @GetMapping
    private String answer(Model model){
        model.addAttribute("menus" , menuConfig.getAnswerMenu());

        return "redirect:/answer/list";
    }

    @GetMapping("/list")
    private String list(Model model){
        model.addAttribute("menus" , menuConfig.getAnswerMenu());

        return "answer/list";
    }

}
