package com.campus.campus.common;

import lombok.Data;

import java.util.List;

@Data
public class Criteria {

    private int page; //현재 페이지0000000000000000000
    private int pagePerNum = 15; //페이지당 게시글 수0000000000000000000
    private int startNum; //해당 페이지의 첫 게시물 번호0000000000000000000
    private int endNum; //해당 페이지의 마지막 게시물 번호0000000000000000000
    private int totalCnt; //총 게시물 수0000000000000000000
    private int totalPageCnt; //총 페이지 버튼 수0000000000000000000
    private int pageCnt = 5; //페이징 버튼 수0000000000000000000
    private boolean next; //다음 버튼0000000000000000000
    private boolean prev; //이전 버튼0000000000000000000

    //생성자. 현재 페이지에 따라 값 세팅해줌
    public Criteria (int page , List list){
       this.page = page;
       this.totalCnt = list.size();
       if(this.totalCnt <= this.pagePerNum){
           this.totalPageCnt = 1;
       }else{
           this.totalPageCnt = this.totalCnt % this.pagePerNum == 0 ? this.totalCnt / this.pagePerNum
                   : (this.totalCnt / this.pagePerNum)+1;
       }
       this.startNum = ((page -1)*pagePerNum) +1;
       if(this.totalPageCnt == this.page){
           this.endNum = this.totalCnt;
           this.next = false;
       }else {
           this.endNum = this.startNum + this.pagePerNum -1;
       }
       if(this.page == 1){
           this.prev = false;
       }

    }

}
