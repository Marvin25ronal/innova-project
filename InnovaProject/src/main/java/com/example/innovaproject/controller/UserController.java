package com.example.innovaproject.controller;

import com.example.innovaproject.dto.UserDto;
import com.example.innovaproject.models.User;
import com.example.innovaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<User> read( @PathVariable String id) {
        return ResponseEntity.ok(userService.read(id));
    }

    @PostMapping("/update")
    public ResponseEntity<User> update(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(String id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
