package com.campus.campus.board.repository;

import com.campus.campus.board.entity.BoardData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, String> {

    //List<BoardData> findByCodeOrderByCreateDateDesc(String code , Pageable pageable);

    Page<BoardData> findByCodeOrderByCreateDateDesc(String code , Pageable pageable);
}
