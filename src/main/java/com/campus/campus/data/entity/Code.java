package com.campus.campus.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Code {

    @Id
    private String testCode;

    @Column
    private String testName;

}
