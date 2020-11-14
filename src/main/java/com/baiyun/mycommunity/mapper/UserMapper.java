package com.baiyun.mycommunity.mapper;

import com.baiyun.mycommunity.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //主键查询用户
    User selectByuid(int uid);
    //根据邮箱查询用户
    User selectByemail(String email);
    //根据用户名查询用户
    User selectByName(String username);
    //插入用户信息
    int insertUser(User user);
    //修改用户状态
    int updateUserStaus(@Param("id") int id, @Param("status") int status);
    //修改用户头像
    int updateUserHeader(@Param("id")int id,@Param("headerUrl")String headerUrl);
    //修改密码
    int  updateUserPwd(@Param("id")int id,@Param("password") String pwd);

}
