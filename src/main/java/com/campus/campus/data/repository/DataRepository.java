package com.campus.campus.data.repository;

import com.campus.campus.data.entity._Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataRepository extends JpaRepository<_Data, Long> {

    List<_Data> findByCategoryAndType(String category , String Type);


}
