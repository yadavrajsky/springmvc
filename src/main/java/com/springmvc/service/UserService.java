package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDAO;
import com.springmvc.model.User;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public int saveUser(User user) {
        return this.userDAO.saveUser(user);
    }
}
