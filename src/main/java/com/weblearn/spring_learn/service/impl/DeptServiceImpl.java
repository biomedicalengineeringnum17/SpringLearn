package com.weblearn.spring_learn.service.impl;

import com.weblearn.spring_learn.mapper.DeptMapper;
import com.weblearn.spring_learn.pojo.Dept;
import com.weblearn.spring_learn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    public List<Dept> deptlist() {
        return deptMapper.list();
    }


}
