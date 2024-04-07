package com.campus.campus.data.service;

import com.campus.campus.data.dto.TestDataDto;
import com.campus.campus.data.entity.TestData;
import com.campus.campus.data.repository.TestDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
@RequiredArgsConstructor
public class TestDataSaveService {

    private final TestDataRepository testDataRepository;


    public void save(TestDataDto form){

        //파일 처리 시작
        MultipartFile testFile = form.getTestFile();

        String fileName = form.getImpYear()+"_"+form.getCategory()+".pdf";
        String filePath = "C:\\spoData\\test\\"+fileName;

        File uploadFile = new File(filePath);
        
        //저장 실패 처리 / 중복 파일 있을 경우 등등
        try{
            testFile.transferTo(uploadFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //파일 처리 끝

        TestData testData = new TestData();
        testData.setImpYear(form.getImpYear());
        testData.setCategory(form.getCategory());
        testData.setFileName(fileName);
        testData.setFilePath(filePath);

        testDataRepository.save(testData);
    }


}
