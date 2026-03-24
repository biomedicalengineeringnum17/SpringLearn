package com.weblearn.spring_learn.controller;

import com.weblearn.spring_learn.pojo.PageBean;
import com.weblearn.spring_learn.pojo.Result;
import com.weblearn.spring_learn.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @GetMapping("/pageHelperSelect")
    public Result pageHelperSelect(@RequestParam(defaultValue = "1") Integer pageNum,
                                   @RequestParam(defaultValue = "5") Integer pageSize) {
        log.info("员工信息分页查询");
        PageBean pageBean = empService.pageHelperSelect(pageNum, pageSize);
        return Result.success(pageBean);

    }


    @GetMapping("/pageHelperSelectWithFilter")
    public Result pageHelperSelectWithFilter(@RequestParam(defaultValue = "1") Integer pageNum,
                                             @RequestParam(defaultValue = "5") Integer pageSize,
                                             @RequestParam(defaultValue = "张") String name,
                                             @RequestParam(defaultValue = "1") Integer gender,
                                             @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime startTime,
                                             @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime endTime){
        log.info("有条件的借助PageHelper分页查询");
        PageBean pageBean = empService.pageHelperSelectWithFilter(pageNum,pageSize,name,gender,startTime,endTime);
        return Result.success(pageBean);

    }

}
