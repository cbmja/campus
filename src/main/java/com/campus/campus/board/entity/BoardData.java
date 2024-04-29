package com.campus.campus.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class BoardData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num; //번호
    @Column
    private String title; //제목
    @Column
    private String content; //내용
    @Column
    private String writer; //작성자 아이디
    @Column
    private String code; //게시판 코드
    @Column
    private LocalDateTime createDate; //작성일
    @Column
    private LocalDateTime modifyDate; //수정일

}
