package com.weblearn.spring_learn.service;

import com.weblearn.spring_learn.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    List<Dept> deptlist();
    void deleteDept(Integer id);
    void insertDept(Dept dept);

    Dept selectById(Integer id);

    void updateById(Integer id, Dept dept);
}

