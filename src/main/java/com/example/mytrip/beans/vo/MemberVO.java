package com.example.mytrip.beans.vo;

//        id varchar2(30) PRIMARY KEY,
//        pw varchar2(30),
//        name varchar2(30),
//        tel varchar2(20) UNIQUE,
//        joinDate Date

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String joinDate;
}
