package com.support.night.user.service;

import com.support.night.user.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    List<User> findAllByFirstName(String firstName);

    List<User> findAllByFirstNameAndLastName(String firstName,String lastName);

}
