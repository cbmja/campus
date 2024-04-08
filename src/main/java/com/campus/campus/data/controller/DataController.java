package com.campus.campus.data.controller;

import com.campus.campus.config.MenuConfig;
import com.campus.campus.data.service.TestDataInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/data")
public class DataController {

    private final TestDataInfoService testDataInfoService;
    private final MenuConfig menuConfig;

    @GetMapping("/test/list")
    public String testList(Model model){
        model.addAttribute("menus" , menuConfig.getDataMenu());
        model.addAttribute("list" , testDataInfoService.getList());

        return "data/testDataList";
    }

    @GetMapping("/answer/list")
    public String answerList(Model model){
        model.addAttribute("menus" , menuConfig.getDataMenu());


        return "data/answerDataList";
    }


}
