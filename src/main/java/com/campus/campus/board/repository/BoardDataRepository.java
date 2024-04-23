package com.campus.campus.board.repository;

import com.campus.campus.board.entity.BoardData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, String> {

    //List<BoardData> findByCodeOrderByCreateDateDesc(String code , Pageable pageable);

    Page<BoardData> findByCodeOrderByCreateDateDesc(String code , Pageable pageable);

    //제목
    Page<BoardData> findByCodeAndTitleLikeOrderByCreateDateDesc(String code , String title , Pageable pageable);


    //글쓴이
    Page<BoardData> findByCodeAndWriterLikeOrderByCreateDateDesc(String code , String writer , Pageable pageable);
    //내용
    Page<BoardData> findByCodeAndContentLikeOrderByCreateDateDesc(String code , String content , Pageable pageable);

    //전체
    Page<BoardData> findByCodeAndTitleLikeOrCodeAndWriterLikeOrCodeAndContentLikeOrderByCreateDateDesc(
            String code , String title ,String code1 , String id ,String code2 ,String content , Pageable pageable);

}

