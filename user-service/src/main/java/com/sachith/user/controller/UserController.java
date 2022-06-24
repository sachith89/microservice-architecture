package com.sachith.user.controller;

import com.sachith.user.dto.UserDepartmentResponse;
import com.sachith.user.entiry.UserEntity;
import com.sachith.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/")
    public UserEntity saveUser(@RequestBody UserEntity user){
        log.info("User Controller - saveUser");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserDepartmentResponse getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("User Controller - getUserWithDepartment");
        return userService.getUserWithDepartment(userId);
    }
}
