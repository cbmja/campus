package com.campus.campus.data.controller;

import com.campus.campus.config.MenuConfig;
import jakarta.servlet.ServletException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/data")
public class DataController {

    private final MenuConfig menuConfig;

    @GetMapping("/list")
    public String dataList(Model model , @RequestParam(name = "category") String category){
        model.addAttribute("menus" , menuConfig.getDataMenu());
        model.addAttribute("subMenu" , category);



        return "data/list";
    }



/*

    @GetMapping("/test/list")
    public String testList(Model model) throws ServletException, IOException {
        model.addAttribute("menus" , menuConfig.getDataMenu());
        model.addAttribute("subMenu" , "시험지");

        
        getFileName(model , "C:\\kspoData\\1.orgPdf");


        //model.addAttribute("list" , testDataInfoService.getList());

        return "data/testDataList";
    }

    @GetMapping("/answer/list")
    public String answerList(Model model){
        model.addAttribute("menus" , menuConfig.getDataMenu());
        model.addAttribute("subMenu" , "답안지");



        return "data/answerDataList";
    }



    //path 안에 있는 모든 파일명 model에 넣어줌
    private void getFileName(Model model, String path){
        // 파일 목록을 가져올 디렉토리 설정
        File dir = new File(path);

        // 디렉토리에서 파일 목록을 가져옴
        List<String> fileList = Arrays.stream(dir.listFiles())
                .map(File::getName)
                .collect(Collectors.toList());

        // 모델에 파일 목록을 추가
        model.addAttribute("list", fileList);
    }
*/


}
