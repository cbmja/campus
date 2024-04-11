package com.campus.campus.data.entity;

import jakarta.persistence.*;

@Entity
@lombok.Data
public class _Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num; //번호

    @Column
    private String ImpYear; //시험 년도

    @Column
    private String category; //시험명

    @Column
    private String type; //정답 / 문제

    @Column
    private String fileName; //저장된 pdf file명

    @Column
    private String filePath; //저장 경로
    
    @Column
    private String form; //형태 A형 B형
    
    @Column
    private Long downloadCnt = 0L; //다운로드 횟수


}
