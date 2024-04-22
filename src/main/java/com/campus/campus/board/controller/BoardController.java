package com.campus.campus.board.controller;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.service.BoardDataInfoService;
import com.campus.campus.board.service.BoardDataSaveService;
import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final MenuConfig menuConfig;

    private final BoardDataSaveService boardDataSaveService;
    private final BoardDataInfoService boardDataInfoService;


    @GetMapping("/list")
    public String list(Model model , @RequestParam(name = "code") String code){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);
        model.addAttribute("boardDataList" , boardDataInfoService.getList(code));


        return "board/list";
    }


    @GetMapping("/create")
    public String create(Model model , @RequestParam(name = "code" , required = false) String code){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);

        return "board/upload";
    }

    @PostMapping("/create")
    public String createProc(Model model , @ModelAttribute BoardData boardData){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , boardData.getCode());
        System.out.println(boardData);


        boardDataSaveService.save(boardData);
        model.addAttribute("boardDataList" , boardDataInfoService.getList(boardData.getCode()));

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
