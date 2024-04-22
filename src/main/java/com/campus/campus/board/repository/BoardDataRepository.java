package com.campus.campus.board.repository;

import com.campus.campus.board.entity.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, String> {

    List<BoardData> findByCode(String code);

}
