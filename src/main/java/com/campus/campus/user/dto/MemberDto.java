package com.campus.campus.user.dto;

import lombok.Data;

@Data
public class MemberDto {

    private String email; //아이디

    private String password; //비밀번호

    private String password2;

    private String subject; //실기종목

    private String regRoot; //회원가입 경로

    private String job; //직업

    private boolean agree; //약관동의여부

}
