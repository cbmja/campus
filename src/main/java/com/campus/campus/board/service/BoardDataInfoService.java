package com.campus.campus.board.service;

import com.campus.campus.board.entity.BoardData;
import com.campus.campus.board.repository.BoardDataRepository;
import com.campus.campus.common.Search;
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


    public BoardData findById(Integer num){
        return boardDataRepository.findById(num).get();
    }


    public Page<BoardData> getList(String code , int page , Search search){
        Pageable pageable = PageRequest.of(page,4);

        String searchKw = search.getSearch().trim();


        //검색어 없는 경우
        if(searchKw.equals("") || searchKw.isEmpty()){
            return boardDataRepository.findByCodeOrderByCreateDateDesc(code , pageable);
        } else if (search.getType().equals("title")) {
        //제목 검색
            return boardDataRepository.findByCodeAndTitleLikeOrderByCreateDateDesc(code , "%"+searchKw+"%" , pageable);
        } else if (search.getType().equals("writer")) {
        //글쓴이 검색
            return boardDataRepository.findByCodeAndWriterLikeOrderByCreateDateDesc(code , "%"+searchKw+"%" , pageable);
        } else if (search.getType().equals("content")) {
        //내용 검색
            return boardDataRepository.findByCodeAndContentLikeOrderByCreateDateDesc(code , "%"+searchKw+"%" , pageable);
        } else if (search.getType().equals("all")) {
        //전체검색
            return boardDataRepository.findByCodeAndTitleLikeOrCodeAndWriterLikeOrCodeAndContentLikeOrderByCreateDateDesc(
                    code , "%"+searchKw+"%" ,code ,"%"+searchKw+"%" ,code ,"%"+searchKw+"%" ,pageable
            );
        } else {
            return boardDataRepository.findByCodeOrderByCreateDateDesc(code , pageable);
        }


    }

}
