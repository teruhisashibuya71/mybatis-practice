package com.example.mybatis.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // @Autowired
    // UserMapper userMapper;

    @Autowired
    UserService userService;

    //RequestBodyなので post時は 【row】を選択すればOK
    //パラメータが単一でない場合は json形式で投げれば良いはず
    @PostMapping("")
    public boolean create(@RequestBody String name) {
        return userService.create(name);
    }

    @GetMapping("")
    public List<User> read() {
        return userService.read();
        //return userMapper.read();
    }

    @PatchMapping("/{id}")
    //@PostMapping("/{id}")
    public boolean update(@PathVariable int id, @RequestBody String name) {
        return userService.update(name, id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return userService.delete(id);
    }
    
}
