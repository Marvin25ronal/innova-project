package com.example.innovaproject.service.implementation;

import com.example.innovaproject.dto.UserDto;
import com.example.innovaproject.exception.UserNotFoundException;
import com.example.innovaproject.models.User;
import com.example.innovaproject.repository.UserRepository;
import com.example.innovaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User create(UserDto user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setName(user.getName());
        return userRepository.save(newUser);
    }

    @Override
    public User read(String id) {
        return userRepository.findById( id).orElseThrow(() -> new UserNotFoundException());
    }

    @Override
    public User update(UserDto user) {

        return null;
    }

    @Override
    public void delete(String id) {
        System.out.println("User deleted");
    }
}
