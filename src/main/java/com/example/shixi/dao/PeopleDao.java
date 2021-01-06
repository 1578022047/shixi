package com.example.shixi.dao;

import com.example.shixi.bean.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PeopleDao {
    @Select("select * from people")
    public List<People> findAllPeople();
}
