package com.campus.campus.QnA;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/QnA")
@RequiredArgsConstructor
public class QnAController {

    private final MenuConfig menuConfig;


    @GetMapping
    public String QnA(Model model){
        model.addAttribute("menus" , menuConfig.getQnAMenu());

        return "redirect:/QnA/list";
    }

    @GetMapping("/upload")
    public String upload(Model model){
        model.addAttribute("menus" , menuConfig.getQnAMenu());

        return "QnA/upload";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("menus" , menuConfig.getQnAMenu());

        return "QnA/list";
    }


}
