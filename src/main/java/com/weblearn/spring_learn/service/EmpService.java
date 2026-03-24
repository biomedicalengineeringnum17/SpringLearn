package com.weblearn.spring_learn.service;

import com.weblearn.spring_learn.pojo.PageBean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public interface EmpService {
    PageBean page(Integer pageNum, Integer pageSize);

    PageBean pageHelperSelect(Integer pageNum, Integer pageSize);

    PageBean pageHelperSelectWithFilter(Integer pageNum,Integer pageSize,String name, Integer gender, LocalDateTime startTime, LocalDateTime endTime);
}

