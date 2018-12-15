package com.andrushenko.service;

import com.andrushenko.model.User;

public interface UserService {
    User getByEmailPassword(String email, String password);

    User getByEmail(String email);
}

