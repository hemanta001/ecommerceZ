package com.support.night.user.service;

import com.support.night.user.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User save(User user);

    User update(Long id,User user);

    Map<String,String> delete(Long id);

    Map<String,Object> getById(Long id);

    List<User> findAll();

    List<User> findAllByFirstName(String firstName);

    List<User> findAllByFirstNameAndLastName(String firstName,String lastName);

}
