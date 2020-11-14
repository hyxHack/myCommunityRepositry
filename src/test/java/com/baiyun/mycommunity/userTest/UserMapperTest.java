package com.baiyun.mycommunity.userTest;

import com.baiyun.mycommunity.bean.User;
import com.baiyun.mycommunity.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        User user = userMapper.selectByuid(22);
        System.out.println(user);
//        User hyx = userMapper.selectByName("hyx");
////        System.out.println(hyx);
//        User user = userMapper.selectByemail("nowcoder22@sina.com");
//        System.out.println(user);
    }
    @Test
    public void insert(){
        User user=new User();
        user.setEmail("hyx@qq.com");
        user.setHeaderUrl("ddddd.png");
        user.setActivationCode("dasdsasdada");
        user.setPassword("ddd");
        user.setCreateTime(new Date());
        user.setSalt("ihyx");
        user.setStatus(0);
        user.setUsername("ihyx");
        int iinsert= userMapper.insertUser(user);
        System.out.println("受影响的行数"+iinsert);
    }
    @Test
    public void update(){
//        userMapper.updateUserHeader(23,"haha.png");
  //      userMapper.updateUserPwd(23,"123456");
       userMapper.updateUserStaus(23,1);
    }
}
