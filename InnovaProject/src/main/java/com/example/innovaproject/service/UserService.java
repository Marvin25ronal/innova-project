package com.example.innovaproject.service;

import com.example.innovaproject.dto.UserDto;
import com.example.innovaproject.models.User;

public interface UserService {
    User create(UserDto user);
    User read(String id);
    User update(UserDto user);
    void delete(String id);

}
