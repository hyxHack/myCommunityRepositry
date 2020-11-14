package com.baiyun.mycommunity.service;

import com.baiyun.mycommunity.bean.DiscussPost;
import com.baiyun.mycommunity.mapper.DiscussPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    DiscussPostMapper discussPostMapper;
    //分页查询帖子
    public List<DiscussPost> findDiscussPosts( int userId,  int index,  int limit){
        return discussPostMapper.selectDiscussPosts(userId,index,limit);
    }
    //查询总的记录数
    public int findDiscussPostsCount(int userId){
        return discussPostMapper.selectDiscussPostsCount(userId);
    }
}
