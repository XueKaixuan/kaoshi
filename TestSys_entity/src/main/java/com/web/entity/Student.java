package com.web.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {
    private Long sid;
    private String sname;
    private String saccount;
    private String spwd;
    private String idcard;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String address;

    private GradeBean gb = new GradeBean();


}
