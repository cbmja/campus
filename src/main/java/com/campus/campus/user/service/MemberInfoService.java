package com.campus.campus.user.service;

import com.campus.campus.user.entity.Member;
import com.campus.campus.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberInfoService {

    private final MemberRepository memberRepository;


    public Member findByEmail(String email){

        return memberRepository.findByEmail(email);
    }

}
