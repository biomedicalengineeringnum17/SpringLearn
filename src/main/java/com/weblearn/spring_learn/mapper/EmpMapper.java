package com.weblearn.spring_learn.mapper;

import com.weblearn.spring_learn.pojo.Emp;
import com.weblearn.spring_learn.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select * from emp limit #{start},#{pageSize}")
    List<Emp> page(int start, Integer pageSize);

    @Select("select count(*) from emp")
    long count();
}
