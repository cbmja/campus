package com.campus.campus.data.service;

import com.campus.campus.data.dto.TestDataDto;
import com.campus.campus.data.entity.TestData;
import com.campus.campus.data.repository.TestDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestDataInfoService {

    private final TestDataRepository testDataRepository;


    public List<TestDataDto> getList(){
        List<TestData> list = testDataRepository.findAll();
        List<TestDataDto> dtoList = new ArrayList<>();
        for(TestData t : list){
            TestDataDto dto = new TestDataDto();
            dto.setCategory(t.getCategory());
            dto.setImpYear(t.getImpYear());

            dtoList.add(dto);
        }

        return dtoList;
    }

}
