package com.baiyun.mycommunity.discusspost;

import com.baiyun.mycommunity.bean.DiscussPost;
import com.baiyun.mycommunity.mapper.DiscussPostMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DiscussPostMapperTest {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void test(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(103, 0, 10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }
        int cout = discussPostMapper.selectDiscussPostsCount(0);
        System.out.println(cout);
    }
}
