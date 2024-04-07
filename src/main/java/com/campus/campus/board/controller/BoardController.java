package com.campus.campus.board.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final MenuConfig menuConfig;


    @GetMapping
    public String board(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());

        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());

        return "board/list";
    }

}
