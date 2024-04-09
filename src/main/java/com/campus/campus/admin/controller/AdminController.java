package com.campus.campus.admin.controller;

import com.campus.campus.config.MenuConfig;
import com.campus.campus.data.dto.DataDto;
import com.campus.campus.data.service.DataInfoService;
import com.campus.campus.data.service.DataSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final MenuConfig menuConfig;
    private final DataSaveService dataSaveService;
    private final DataInfoService dataInfoService;



    @GetMapping("/upload")
    public String upload(Model model){
        model.addAttribute("menus" , menuConfig.getAdminMenu());
        model.addAttribute("subMenu" , "시험지 등록");

        return "admin/upload";
    }

    @PostMapping("/uploadProc")
    public String uploadProc(Model model , DataDto form){
        dataSaveService.save(form);



        return "redirect:/admin/list?category="+form.getCategory();
    }

    @GetMapping("/list")
    public String dataList(Model model , @RequestParam(name = "category") String category){
        model.addAttribute("menus" , menuConfig.getAdminMenu());
        model.addAttribute("subMenu" , category);
        model.addAttribute("items" , dataInfoService.getAll());



        return "admin/list";
    }







}
