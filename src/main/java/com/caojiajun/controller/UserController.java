
package com.caojiajun.controller;

import com.caojiajun.model.User;
import com.caojiajun.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by caojiajun on 2016/3/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/json/list", method = RequestMethod.GET)
    @ResponseBody
    public String getUsersOfJson() {
        List<User> users = userService.getUsers();
        return toJson(users);
    }

    @RequestMapping(value = "/json/users/like", method = RequestMethod.GET)
    @ResponseBody
    public String userNameLike(String key) {
        try {
            key = new String(key.getBytes("iso8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<User> users = userService.getUsersLike(key);
        return toJson(users);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser(String name) {
        User user = new User();
        user.setName(name);
        userService.add(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "list";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String input() {
        return "input";
    }

    public String toJson(List<User> users) {
        JSONArray res = new JSONArray();
        for(User user : users) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", user.getId());
            jsonObject.put("name", user.getName());
            res.add(jsonObject);
        }
        return res.toString();
    }
}
