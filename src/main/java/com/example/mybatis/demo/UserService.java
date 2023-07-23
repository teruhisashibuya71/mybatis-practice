package com.example.mybatis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper {

    @Autowired
    UserMapper userMapper;

    public boolean create(String name) {
        return userMapper.create(name);
    }

    public List<User> read() {
        return userMapper.read();
    }
    
    public boolean update(String name, int id) {
        return userMapper.update(name, id);
    }

    public boolean delete(int id) {
        return userMapper.delete(id);
    }
}
