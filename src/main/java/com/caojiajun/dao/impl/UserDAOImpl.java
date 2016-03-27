package com.caojiajun.dao.impl;

import com.caojiajun.dao.UserDAO;
import com.caojiajun.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caojiajun on 2016/3/27.
 */
@Repository
public class UserDAOImpl implements UserDAO {
    private static List<User> users = new ArrayList<User>();
    static {
        users.add(new User(1, "zhangsan"));
        users.add(new User(2, "lisi"));
        users.add(new User(3, "wangwu"));
        users.add(new User(4, "zhaoliu"));
        users.add(new User(5, "bush"));
        users.add(new User(6, "obama"));
        users.add(new User(7, "putin"));
        users.add(new User(8, "haha"));
        users.add(new User(9, "小明"));
        users.add(new User(10, "小王"));
    }
    public boolean add(User user) {
        user.setId(users.size()+1);
        users.add(user);
        return true;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<User> getUsersLike(String name) {
        List<User> list = new ArrayList<User>();
        for(User user : users) {
            if(user.getName().contains(name)) {
                list.add(user);
            }
        }
        return list;
    }
}
