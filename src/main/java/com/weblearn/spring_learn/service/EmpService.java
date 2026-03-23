package com.weblearn.spring_learn.service;

import com.weblearn.spring_learn.pojo.PageBean;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    PageBean page(Integer pageNum, Integer pageSize);
}
