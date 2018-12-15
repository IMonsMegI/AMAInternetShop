package com.andrushenko.dao;

import com.andrushenko.model.User;

public interface UserDao {

    User getByEmailPassword(String email, String password);

    User getByEmail(String email);
}
