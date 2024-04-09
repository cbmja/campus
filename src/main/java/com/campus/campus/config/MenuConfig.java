package com.campus.campus.config;


import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Getter
public class MenuConfig {


    private  Map<String, List<String>> adminMenu = new LinkedHashMap<>();
    private  Map<String, List<String>> boardMenu = new LinkedHashMap<>();
    private  Map<String, List<String>> dataMenu = new LinkedHashMap<>();
    private  Map<String, List<String>> pTestMenu = new LinkedHashMap<>();
   {

       adminMenu.put("1a", Arrays.asList("1급전문스포츠지도사" , "/admin/list?code=1a"));
       adminMenu.put("2a", Arrays.asList("2급전문스포츠지도사" , "/admin/list?code=2a"));
       adminMenu.put("1b", Arrays.asList("1급생활스포츠지도사" , "/admin/list?code=1b"));
       adminMenu.put("2b", Arrays.asList("2급생활스포츠지도사" , "/admin/list?code=2b"));
       adminMenu.put("c", Arrays.asList("건강운동관리사" , "/admin/list?code=c"));
       adminMenu.put("d", Arrays.asList("노인스포츠지도사" , "/admin/list?code=d"));
       adminMenu.put("e", Arrays.asList("유소년스포츠지도사" , "/admin/list?code=e"));
       adminMenu.put("1f", Arrays.asList("1급장애인스포츠지도사" , "/admin/list?code=1f"));
       adminMenu.put("2f", Arrays.asList("2급장애인스포츠지도사" , "/admin/list?code=2f"));


       boardMenu.put("notice",Arrays.asList("공지사항" , "/board/list?code=notice"));
       boardMenu.put("qna",Arrays.asList("문의사항" , "/board/list?code=qna"));
       boardMenu.put("question",Arrays.asList("질문 게시판" , "/board/list?code=question"));
       boardMenu.put("free",Arrays.asList("자유 게시판" , "/board/list?code=free"));


       dataMenu.put("test",Arrays.asList("시험지" , "/data/list?code=test"));
       dataMenu.put("answer",Arrays.asList("답안지" , "/data/list?code=answer"));

       pTestMenu.put("list",Arrays.asList("목록으로" , "/pTest/list"));


    }

}