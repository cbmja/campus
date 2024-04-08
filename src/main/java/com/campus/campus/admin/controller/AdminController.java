package com.campus.campus.admin.controller;

import com.campus.campus.config.MenuConfig;
import com.campus.campus.data.dto.DataDto;
import com.campus.campus.data.service.DataSaveService;
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
    private final DataSaveService dataSaveService;



    @GetMapping("/upload")
    public String upload(Model model){
        model.addAttribute("menus" , menuConfig.getAdminMenu());
        model.addAttribute("subMenu" , "시험지 등록");

        return "admin/upload";
    }

    @PostMapping("/uploadProc")
    public String uploadProc(Model model , DataDto form){
        dataSaveService.save(form);



        return "redirect:/admin/list";
    }

    @GetMapping("/list")
    public String dataList(Model model){
        model.addAttribute("menus" , menuConfig.getAdminMenu());
        model.addAttribute("subMenu" , "시험지 목록");



        return "admin/list";
    }



}
