package com.campus.campus.board.controller;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.service.BoardDataInfoService;
import com.campus.campus.board.service.BoardDataSaveService;
import com.campus.campus.common.Search;
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
    public String list(Model model , @RequestParam(name = "code") String code , @RequestParam(value = "page" , defaultValue = "0")int page
    , Search search){

        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);
        model.addAttribute("paging" , boardDataInfoService.getList(code ,page , search));
        model.addAttribute("search" , search);

        return "board/list";
    }


    @GetMapping("/create")
    public String create(Model model , @RequestParam(name = "code" , required = false) String code , @ModelAttribute BoardData boardData){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);
        model.addAttribute("mode","create");

        return "board/upload";
    }

    @PostMapping("/create")
    public String createProc(Model model , @ModelAttribute BoardData boardData , @RequestParam(name = "mode" , required = false) String mode){

        if(mode.equals("edit")){
            BoardData boardData1 = boardDataInfoService.findById(boardData.getNum());
            boardData1.setContent(boardData.getContent());
            boardData1.setTitle((boardData.getTitle()));
            boardDataSaveService.save(boardData1 , mode);
        }else {
            boardDataSaveService.save(boardData , mode);
        }



        return "redirect:/board/list?code="+boardData.getCode();
    }

    @GetMapping("/edit")
    public String create(Model model , @RequestParam(name = "code" , required = false) String code , @RequestParam(name = "num" , required = false) Integer num){
        model.addAttribute("menus" , menuConfig.getBoardMenu());
        model.addAttribute("code" , code);
        model.addAttribute("boardData" , boardDataInfoService.findById(num));
        model.addAttribute("mode","edit");

        return "board/upload";
    }


}
