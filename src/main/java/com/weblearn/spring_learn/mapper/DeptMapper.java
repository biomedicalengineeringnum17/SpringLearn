package com.weblearn.spring_learn.mapper;

import com.weblearn.spring_learn.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> list();
    
    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time)" +
            "values " +
            "(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept selectById(Integer id);


    @Update("update dept set name=#{dept.name}, update_time=#{dept.updateTime},create_time = #{dept.createTime}" +
            "where id = #{id}")
    void updateById(@Param("id") Integer id, @Param("dept") Dept dept);
}

