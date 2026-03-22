package com.weblearn.spring_learn.controller;

import com.weblearn.spring_learn.pojo.Dept;
import com.weblearn.spring_learn.pojo.Result;
import com.weblearn.spring_learn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@RestController(value = "/dept")
public class DeptController {
    private Integer id;
    private String name;
    private String createTime;
    private String updateTime;

    @Autowired
    private DeptService deptService;


    //@RequestMapping(value = "/depts", method= RequestMethod.GET)用一个注解代替@RequestMapping
    @GetMapping("/depts")
    public Result deptlist() {
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.deptlist();
        return Result.success(deptList);
    }
}
