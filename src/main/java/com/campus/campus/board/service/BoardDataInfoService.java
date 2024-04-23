package com.campus.campus.board.service;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.repository.BoardDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardDataInfoService {

    private final BoardDataRepository boardDataRepository;

    public Page<BoardData> getList(String code , int page){
        Pageable pageable = PageRequest.of(page,4);
        return boardDataRepository.findByCodeOrderByCreateDateDesc(code , pageable);
    }

}
