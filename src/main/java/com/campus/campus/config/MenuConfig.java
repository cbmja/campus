package com.campus.campus.config;


import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class MenuConfig {


    private  Map<String, String> adminMenu = new HashMap<>();
    private  Map<String, String> noticeMenu = new HashMap<>();
    private  Map<String, String> QnAMenu = new HashMap<>();
    private  Map<String, String> testMenu = new HashMap<>();
    private  Map<String, String> answerMenu = new HashMap<>();
    private  Map<String, String> boardMenu = new HashMap<>();
    {

        adminMenu.put("시험지 등록","/admin/upload");
        adminMenu.put("시험지 목록","/admin/list");

        noticeMenu.put("공지 등록","/notice/upload");
        noticeMenu.put("공지 목록","/notice/list");

        QnAMenu.put("QnA 등록","/QnA/upload");
        QnAMenu.put("QnA 목록","/QnA/list");

        testMenu.put("시험지 목록","/test/list");
        testMenu.put("시험 응시","/test/take");

        answerMenu.put("답안지 목록","/answer/list");

        boardMenu.put("질문 게시판","/board/question");
        boardMenu.put("자유 게시판","/board/free");

    }

}