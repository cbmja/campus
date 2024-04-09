package com.campus.campus.data.service;

import com.campus.campus.data.entity._Data;
import com.campus.campus.data.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataInfoService {

    private final DataRepository dataRepository;


    public List<_Data> findByCategory(String category , String type){
        return dataRepository.findByCategoryAndType(category ,type);
    }


}
