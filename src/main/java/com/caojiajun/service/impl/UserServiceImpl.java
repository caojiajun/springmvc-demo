package com.caojiajun.service.impl;

import com.caojiajun.dao.UserDAO;
import com.caojiajun.model.User;
import com.caojiajun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caojiajun on 2016/3/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public boolean add(User user) {
        return userDAO.add(user);
    }

    public List<User> getUsers() {
        return userDAO.getUsers();
    }
    public List<User> getUsersLike(String name) {
        return userDAO.getUsersLike(name);
    }
}
