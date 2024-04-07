package com.campus.campus.notice.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final MenuConfig menuConfig;

    @GetMapping()
    public String notice(Model model){
        model.addAttribute("menus" , menuConfig.getNoticeMenu());


        return "redirect:/notice/list";
    }

    @GetMapping("/upload")
    public String upload(Model model){
        model.addAttribute("menus" , menuConfig.getNoticeMenu());


        return "notice/upload";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("menus" , menuConfig.getNoticeMenu());


        return "notice/list";
    }

}
