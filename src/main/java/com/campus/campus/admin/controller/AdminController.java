package com.campus.campus.admin.controller;

import com.campus.campus.data.dto.TestDataDto;
import com.campus.campus.data.service.TestDataInfoService;
import com.campus.campus.data.service.TestDataSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {


    private final TestDataSaveService testDataSaveService;
    private final TestDataInfoService testDataInfoService;

    @GetMapping("/upload")
    public String upload(){

        return "admin/dataUpload";
    }

    @PostMapping("/uploadProc")
    public String uploadProc(TestDataDto form){

        testDataSaveService.save(form);

        return "redirect:/admin/dataList";
    }

    @GetMapping("/dataList")
    public String dataList(Model model){


        model.addAttribute("list" , testDataInfoService.getList());

        return "admin/dataList";
    }

}
