package com.campus.campus.user.repository;

import com.campus.campus.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member,String> {

    Member findByEmail(String email);


}
