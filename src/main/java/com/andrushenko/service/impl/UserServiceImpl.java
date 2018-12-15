package com.andrushenko.service.impl;

import com.andrushenko.dao.UserDao;
import com.andrushenko.model.User;
import com.andrushenko.service.UserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {
    @Inject
    private UserDao userDAO;

    @Override
    public User getByEmailPassword(String email, String password) {
        return userDAO.getByEmailPassword(email, password);
    }

    @Override
    public User getByEmail(String email) {
        return userDAO.getByEmail(email);
    }
}
