package com.campus.campus.pTest.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pTest")
public class PTestController {

    private final MenuConfig menuConfig;

    @GetMapping("/list")
    public String list(Model model){

        model.addAttribute("menus" , menuConfig.getPTestMenu());

        return "pTest/list";
    }

}
