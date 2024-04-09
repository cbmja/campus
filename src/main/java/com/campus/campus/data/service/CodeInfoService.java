package com.campus.campus.data.service;

import com.campus.campus.data.entity.Code;
import com.campus.campus.data.repository.CodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeInfoService {

    private final CodeRepository codeRepository;

    public String getName(String testCode){

        Code code = codeRepository.findById(testCode).get();

        return code.getTestName();
    }


}
