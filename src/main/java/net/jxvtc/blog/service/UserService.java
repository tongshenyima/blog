package net.jxvtc.blog.service;

import net.jxvtc.blog.po.User;

public interface UserService {

    User checkUser(String username,String password) ;

    }
