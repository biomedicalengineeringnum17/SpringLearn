package com.weblearn.spring_learn.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weblearn.spring_learn.mapper.DeptMapper;
import com.weblearn.spring_learn.mapper.EmpMapper;
import com.weblearn.spring_learn.pojo.Dept;
import com.weblearn.spring_learn.pojo.Emp;
import com.weblearn.spring_learn.pojo.PageBean;
import com.weblearn.spring_learn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;


    @Override
    public List<Dept> deptlist() {
        return deptMapper.list();
    }
    
    @Override
    public void deleteDept(Integer id) {
        deptMapper.delete(id);
    }

    @Override
    public void insertDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public Dept selectById(Integer id){
        Dept dept = deptMapper.selectById(id);
        return dept;
    }
    @Override
    public void updateById(Integer id,Dept dept){
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.updateById(id,dept);
    }
}

