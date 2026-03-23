package com.weblearn.spring_learn.controller;

import com.weblearn.spring_learn.pojo.PageBean;
import com.weblearn.spring_learn.pojo.Result;
import com.weblearn.spring_learn.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;


    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer pageNum,
                       @RequestParam(defaultValue = "5") Integer pageSize){
        log.info("员工信息分页查询");
        PageBean pageBean = empService.page(pageNum,pageSize);
        return Result.success(pageBean);
    }

}
