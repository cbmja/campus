package com.campus.campus.user.common;

import lombok.Getter;

@Getter
public enum Authority {

        ADMIN("AUTHORITY_AMIN"),
        USER("AUTHORITY_USER");
        
        Authority(String value){
            this.value = value;
        }
    private String value;

}
