package com.baiyun.mycommunity.controller;

import com.baiyun.mycommunity.bean.DiscussPost;
import com.baiyun.mycommunity.bean.User;
import com.baiyun.mycommunity.service.DiscussPostService;
import com.baiyun.mycommunity.service.UserService;
import com.baiyun.mycommunity.util.Pagebean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    DiscussPostService discussPostService;
    @Autowired
    UserService userService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public  String getIndexPage(Model model, Pagebean pagebean){
        //pagebean 接受分页封装参数对象
        //设置总的记录数
        pagebean.setTotalCount(discussPostService.findDiscussPostsCount(0));
        //设置访问路径
        pagebean.setPath("/index");
        List<DiscussPost> discussPosts = discussPostService.findDiscussPosts(0, pagebean.getIndex(), pagebean.getLimit());
        List<Map<String,Object>>resultlist=new ArrayList<>();
        if(discussPosts!=null&&discussPosts.size()>0){
            for (DiscussPost discussPost : discussPosts) {
                   Map<String,Object> map=new HashMap<>();
                   map.put("post",discussPost);
                    User user = userService.findByuid(discussPost.getUserId());
                if(user!=null){
                    map.put("user",user);
                }
                resultlist.add(map);
            }
        }
        model.addAttribute("discussPosts",resultlist);
        return "index";
    }
}
