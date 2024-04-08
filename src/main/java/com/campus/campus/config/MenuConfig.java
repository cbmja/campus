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

        adminMenu.put("시험지 등록","/admin/upload");
        adminMenu.put("시험지 목록","/admin/list");

       boardMenu.put("공지사항","/board/notice/list");
       boardMenu.put("문의사항","/board/QnA/list");
       boardMenu.put("질문 게시판","/board/question/list");
       boardMenu.put("자유 게시판","/board/free/list");

       dataMenu.put("시험지","/data/test/list");
       dataMenu.put("답안지","/data/answer/list");

       pTestMenu.put("목록으로","/pTest/list");

    }

}