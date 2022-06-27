package com.support.night.user.controller;


import com.support.night.user.entity.User;
import com.support.night.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(produces = "application/json")
    public List<User> findAll(){
        List<User> userList=userService.findAll();
        return userList;
    }

    @GetMapping(value = "findByFirstName",produces = "application/json")
    public List<User> findAllByFirstName(@RequestParam(value = "firstName") String firstName){
        List<User> userList=userService.findAllByFirstName(firstName);
        return userList;
    }

    @GetMapping(value = "findByFirstNameAndLastName",produces = "application/json")
    public List<User> findByFirstNameAndLastName(@RequestParam(value = "firstName") String firstName,@RequestParam(value = "lastName") String lastName){
        List<User> userList=userService.findAllByFirstNameAndLastName(firstName,lastName);
        return userList;
    }
}
