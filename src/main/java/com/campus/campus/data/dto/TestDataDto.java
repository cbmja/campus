package com.campus.campus.data.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class TestDataDto {


    private String ImpYear; //시험 년도

    private String category; //시험명

    private MultipartFile testFile;

}
