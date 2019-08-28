package com.onyx.api;

import com.onyx.base.User;
import com.onyx.service.UserService;
import com.onyx.util.MyStringUtil;


/**
 * @author zk
 * @Description:
 * @date 2019-08-28 12:23
 */
public class UserServiceImpl implements UserService {


    @Override
    public void save(User user) {
        /**
         * 成功引用util的包内容
         */
        MyStringUtil.size("123");

        /**
         * ListUtil此类  这个导包就导入不进来
         */
        //ListUtil.size();

        System.out.println(user);
    }


    @Override
    public void login() {
        System.out.println("UserServiceImpl login method");
    }

}
