package com.campus.campus.data.controller;

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

    @GetMapping("/testDataList")
    public String tDataList(Model model){
        model.addAttribute("list" , testDataInfoService.getList());

        return "data/testDataList";
    }


}
