package com.example.innovaproject.service;

import com.example.innovaproject.models.User;

public interface UserService {
    User create(User user);
    User read(String id);
    User update(User user);
    void delete(String id);

}
