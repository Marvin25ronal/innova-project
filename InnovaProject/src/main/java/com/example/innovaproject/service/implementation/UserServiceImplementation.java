package com.example.innovaproject.service.implementation;

import com.example.innovaproject.models.User;
import com.example.innovaproject.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Override
    public User create(User user) {
        User newUser = new User();
        newUser.setId("1");
        newUser.setName("John Doe");
        return newUser;
    }

    @Override
    public User read(String id) {
        User newUser = new User();
        newUser.setId("1");
        newUser.setName("John Doe");
        return newUser;
    }

    @Override
    public User update(User user) {
        User newUser = new User();
        newUser.setId("1");
        newUser.setName("John Doe2");
        return newUser;
    }

    @Override
    public void delete(String id) {
        System.out.println("User deleted");
    }
}
