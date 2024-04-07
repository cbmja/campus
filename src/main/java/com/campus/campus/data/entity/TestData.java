package com.campus.campus.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TestData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num; //번호

    @Column
    private String ImpYear; //시험 년도

    @Column
    private String category; //시험명

    @Column
    private String fileName; //저장된 pdf file명

    @Column
    private String filePath; //저장 경로


}
