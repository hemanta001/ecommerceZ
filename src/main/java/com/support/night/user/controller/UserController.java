package com.support.night.user.controller;


import com.support.night.user.entity.User;
import com.support.night.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes = "application/json",produces = "application/json")
    public User save(@RequestBody User user){
      User user1=userService.save(user);
      return user1;
    }
}
