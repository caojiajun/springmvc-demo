package com.caojiajun.service;

import com.caojiajun.model.User;

import java.util.List;

/**
 * Created by caojiajun on 2016/3/27.
 */
public interface UserService {
    public boolean add(User user);
    public List<User> getUsers();
    public List<User> getUsersLike(String name);
}
