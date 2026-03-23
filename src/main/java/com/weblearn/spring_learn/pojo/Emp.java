package com.weblearn.spring_learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private  Integer id;
    private String name;
    private String password;
    private Integer gender;
    private String image;
    private Integer job;
    private LocalDateTime entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
