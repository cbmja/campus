package com.campus.campus.user.service;

import com.campus.campus.user.dto.MemberDto;
import com.campus.campus.user.entity.Member;
import com.campus.campus.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberSaveService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;


    //비밀번호 해쉬화 ok
    //비밀번호 확인 검증 ok
    //null check
    //이메일 중복확인 세모
    public void save(MemberDto form){

        if(memberRepository.findByEmail(form.getEmail()) != null){
            System.out.println("////////////////////이미 가입된 이메일");
            return;
        }


        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(passwordEncoder.encode(form.getPassword()));
        member.setSubject(form.getSubject());
        member.setRegRoot(form.getRegRoot());
        member.setJob(form.getJob());
        memberRepository.save(member);
    }


}
