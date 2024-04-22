package com.campus.campus.board.service;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.repository.BoardDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardDataInfoService {

    private final BoardDataRepository boardDataRepository;

    public List<BoardData> getList(String code , Pageable pageable){

        return boardDataRepository.findByCodeOrderByCreateDateDesc(code , pageable);
    }

}
