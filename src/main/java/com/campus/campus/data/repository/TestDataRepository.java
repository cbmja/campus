package com.campus.campus.data.repository;

import com.campus.campus.data.entity.TestData;
import com.campus.campus.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDataRepository extends JpaRepository<TestData,Long> {
}
