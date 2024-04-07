package com.campus.campus.user.repository;

import com.campus.campus.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository  extends JpaRepository<Member,String> {

    Member findByEmail(String email);


}
