package com.campus.campus.board.controller;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.service.BoardDataInfoService;
import com.campus.campus.board.service.BoardDataSaveService;
import com.campus.campus.config.MenuConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public String list(Model model , @RequestParam(name = "code") String code ,  @PageableDefault(size = 2)Pageable pageable){

        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);
        model.addAttribute("boardDataList" , boardDataInfoService.getList(code ,pageable));


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

        boardDataSaveService.save(boardData);
        return "redirect:/board/list?code="+boardData.getCode();
    }


}
