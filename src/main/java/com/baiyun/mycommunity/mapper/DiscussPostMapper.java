package com.baiyun.mycommunity.mapper;

import com.baiyun.mycommunity.bean.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //分页查询帖子
     List<DiscussPost> selectDiscussPosts(@Param("userId") int userId,@Param("index") int index,@Param("limit") int limit);
    //查询总的记录数
     int selectDiscussPostsCount(@Param("userId")int userId);

}
