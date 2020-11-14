package com.baiyun.mycommunity.service;

import com.baiyun.mycommunity.bean.User;
import com.baiyun.mycommunity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    //根据id查询用户信息
    public User findByuid(int id){
        return userMapper.selectByuid(id);
    }
}
