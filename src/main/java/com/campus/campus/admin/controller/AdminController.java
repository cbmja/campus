package com.campus.campus.admin.controller;

import com.campus.campus.config.MenuConfig;
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

    private final MenuConfig menuConfig;

    private final TestDataSaveService testDataSaveService;
    private final TestDataInfoService testDataInfoService;


    @GetMapping("/upload")
    public String upload(Model model){
        model.addAttribute("menus" , menuConfig.getAdminMenu());


        return "admin/upload";
    }

    @PostMapping("/uploadProc")
    public String uploadProc(Model model ,TestDataDto form){
        //model.addAttribute("menus" , menuConfig.getAdminMenu());


        testDataSaveService.save(form);

        return "redirect:/admin/list";
    }

    @GetMapping("/list")
    public String dataList(Model model){
        model.addAttribute("menus" , menuConfig.getAdminMenu());



        model.addAttribute("list" , testDataInfoService.getList());

        return "admin/list";
    }



}
