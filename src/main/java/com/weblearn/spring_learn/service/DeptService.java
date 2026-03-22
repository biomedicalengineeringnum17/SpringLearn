package com.weblearn.spring_learn.service;

import com.weblearn.spring_learn.mapper.DeptMapper;
import com.weblearn.spring_learn.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    List<Dept> deptlist();
}
