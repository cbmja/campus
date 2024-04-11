package com.campus.campus.data.service;

import com.campus.campus.data.dto.DataDto;
import com.campus.campus.data.entity._Data;
import com.campus.campus.data.repository.DataRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
@RequiredArgsConstructor
public class DataSaveService {

    private final DataRepository dataRepository;

    public void save(DataDto form){

        _Data data = new _Data();
        data.setImpYear(form.getImpYear());
        data.setCategory(form.getCategory());
        data.setType(form.getType());
        data.setForm(form.getForm());
        data.setFileName(form.getImpYear()+"_"+form.getCategory()+"_"+data.getForm()+".pdf");
        data.setFilePath("C:\\campus_______________\\campus\\src\\main\\resources\\static\\data\\"+data.getType()+"\\");

        //파일 저장 경로 문제 : C:\DATA\test\파일명
        //정답: C:\DATA\answer\파일명
        //파일 처리 시작
        MultipartFile File = form.getTestFile();

        String fileName = data.getFileName();
        String filePath = data.getFilePath()+fileName;

        File uploadFile = new File(filePath);

        //저장 실패 처리 / 중복 파일 있을 경우 등등
        try{
            File.transferTo(uploadFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        data.setFilePath("/data/"+data.getType()+"/"+data.getFileName());

        //파일 처리 끝
        dataRepository.save(data);
    }


}
