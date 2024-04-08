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


    @GetMapping("/notice/list")
    public String notice(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/QnA/list")
    public String QnA(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/question/list")
    public String question(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/free/list")
    public String free(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
    //쿼리다르게

        return "board/list";
    }

}
