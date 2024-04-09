package com.campus.campus.board.controller;

import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final MenuConfig menuConfig;


    @GetMapping("/list")
    public String dataList(Model model , @RequestParam(name = "code") String code){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);




        return "board/list";
    }

/*

    @GetMapping("/notice/list")
    public String notice(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("subMenu" , "공지사항");

    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/QnA/list")
    public String QnA(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("subMenu" , "문의사항");

    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/question/list")
    public String question(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("subMenu" , "질문 게시판");

    //쿼리다르게

        return "board/list";
    }
    @GetMapping("/free/list")
    public String free(Model model){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("subMenu" , "자유 게시판");

    //쿼리다르게

        return "board/list";
    }
*/

}
