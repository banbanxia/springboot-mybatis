package com.example.demo.Controller;

/**
 * Created by LinyuZhang on 2017/7/14.
 */
import com.example.demo.Bean.User;
import com.example.demo.Dao.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwei on 2016/9/2.
 */
@RestController
//@RequestMapping({"/home"})
public class UserController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/user")
    @ResponseBody
    public String user(){
        User user = userMapper.findUserByName("777");

        return user.getName()+"-----"+user.getAge();
    }

}
