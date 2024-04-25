package com.campus.campus.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Member {

    @Id
    @Email
    private String email; //아이디

    @Column
    private String password; //비밀번호

    @Column
    private String subject; //실기종목

    @Column
    private String regRoot; //회원가입 경로

    @Column
    private String job; //직업
    
    @Column
    private String role; //권한



}
