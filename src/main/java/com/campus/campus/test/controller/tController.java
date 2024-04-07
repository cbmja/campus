package com.campus.campus.test.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class tController {

    private final MenuConfig menuConfig;


    @GetMapping
    public String test(Model model){
        model.addAttribute("menus" , menuConfig.getTestMenu());


        return "redirect:/test/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("menus" , menuConfig.getTestMenu());


        return "test/list";
    }

    @GetMapping("/take")
    public String take(Model model){
        model.addAttribute("menus" , menuConfig.getTestMenu());


        return "test/take";
    }
}
