package com.caojiajun.model;

import java.io.Serializable;

/**
 * Created by caojiajun on 2016/3/27.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}