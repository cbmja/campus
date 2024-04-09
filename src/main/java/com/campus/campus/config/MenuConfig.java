package com.campus.campus.config;


import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class MenuConfig {


    private  Map<String, String> adminMenu = new HashMap<>();
    private  Map<String, String> boardMenu = new HashMap<>();
    private  Map<String, String> dataMenu = new HashMap<>();
    private  Map<String, String> pTestMenu = new HashMap<>();
   {

       adminMenu.put("1급전문스포츠지도사","/admin/list?category=1급전문스포츠지도사");
       adminMenu.put("2급전문스포츠지도사","/admin/list?category=2급전문스포츠지도사");
       adminMenu.put("1급생활스포츠지도사","/admin/list?category=1급생활스포츠지도사");
       adminMenu.put("2급생활스포츠지도사","/admin/list?category=2급생활스포츠지도사");
       adminMenu.put("건강운동관리사","/admin/list?category=건강운동관리사");
       adminMenu.put("노인스포츠지도사","/admin/list?category=노인스포츠지도사");
       adminMenu.put("유소년스포츠지도사","/admin/list?category=유소년스포츠지도사");
       adminMenu.put("1급장애인스포츠지도사","/admin/list?category=1급장애인스포츠지도사");
       adminMenu.put("2급장애인스포츠지도사","/admin/list?category=2급장애인스포츠지도사");

       boardMenu.put("공지사항","/board/list?category=공지사항");
       boardMenu.put("문의사항","/board/list?category=문의사항");
       boardMenu.put("질문 게시판","/board/list?category=질문 게시판");
       boardMenu.put("자유 게시판","/board/list?category=자유 게시판");


       dataMenu.put("시험지","/data/list?category=시험지");
       dataMenu.put("답안지","/data/list?category=답안지");

       pTestMenu.put("목록으로","/pTest/list");

    }

}