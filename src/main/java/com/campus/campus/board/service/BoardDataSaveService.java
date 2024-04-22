package com.campus.campus.board.service;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.repository.BoardDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BoardDataSaveService {

    private final BoardDataRepository boardDataRepository;

    public void save(BoardData boardData){
        boardData.setCreateDate(LocalDateTime.now());
        boardDataRepository.save(boardData);
    }

}
