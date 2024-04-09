package com.campus.campus.data.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class DataDto {

    private Long num;

    private String ImpYear; //시험 년도

    private String category; //시험명

    private String type;

    private MultipartFile testFile;

    private String form;

    private String fileName;

    private String filePath;

}
