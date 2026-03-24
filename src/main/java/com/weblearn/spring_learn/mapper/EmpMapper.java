package com.weblearn.spring_learn.mapper;

import com.weblearn.spring_learn.pojo.Emp;
import com.weblearn.spring_learn.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select * from emp limit #{start},#{pageSize}")
    List<Emp> page(int start, Integer pageSize);

    @Select("select count(*) from emp")
    long count();


//  pageHelper插件继承来实现分页查询
    @Select("select * from emp ")
    public List<Emp> pageHelperList();

    List<Emp> pageHelperListWithFilter(@Param("name") String name, @Param("gender") Integer gender, @Param("startTime") LocalDateTime startTime, @Param("endTime") LocalDateTime endTime);
}
