package com.example.mybatis.demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    @Insert("insert into users (name) values (#{name})")
    public boolean create(String name);

    @Select("select * from users")
    public List<User> read();

    @Update("update users set name = #{name} where id = #{id}")
    public boolean update(String name, int id);

    @Delete("delete from users where id = #{id}")
    public boolean delete(int id);
    
}
