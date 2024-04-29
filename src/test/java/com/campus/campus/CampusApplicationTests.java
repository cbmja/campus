package com.campus.campus;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.service.BoardDataSaveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class CampusApplicationTests {

	@Autowired
	public BoardDataSaveService boardDataSaveService;

	@Test
	void contextLoads() {

		for(int i=1; i<=100; i++){
			BoardData boardData = new BoardData();
			boardData.setCode("question");
			boardData.setTitle("질문 게시판 제목 : "+i);
			boardData.setContent("질문 게시판 내용 : "+i);
			boardData.setWriter("질문 게시판 작성자"+i);
			boardData.setCreateDate(LocalDateTime.now());
			boardDataSaveService.save(boardData , "d");
		}

		for(int i=1; i<=100; i++){
			BoardData boardData = new BoardData();
			boardData.setCode("free");
			boardData.setTitle("자유게시판 제목 : "+i);
			boardData.setContent("자유게시판 내용 : "+i);
			boardData.setWriter("자유게시판 작성자"+i);
			boardData.setCreateDate(LocalDateTime.now());
			boardDataSaveService.save(boardData,"d");
		}

	}

}
