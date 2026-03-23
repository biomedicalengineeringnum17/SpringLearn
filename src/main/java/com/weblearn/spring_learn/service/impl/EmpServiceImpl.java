package com.weblearn.spring_learn.service.impl;

import com.weblearn.spring_learn.mapper.EmpMapper;
import com.weblearn.spring_learn.pojo.Emp;
import com.weblearn.spring_learn.pojo.PageBean;
import com.weblearn.spring_learn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer pageNum,Integer pageSize){
        int start = (pageNum - 1)*pageSize;
        List<Emp> list = empMapper.page(start,pageSize);
        long total = empMapper.count();
        PageBean pageBean = new PageBean(total,list);
        return pageBean;
    }

}
