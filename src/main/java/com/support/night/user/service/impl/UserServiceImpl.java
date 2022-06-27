package com.support.night.user.service.impl;

import com.support.night.user.entity.User;
import com.support.night.user.repository.UserRepository;
import com.support.night.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        User user1 = this.userRepository.save(user);
        return user1;
    }

    @Override
    public List<User> findAll() {
        List<User> userList=this.userRepository.findAll();
        return userList;
    }

    @Override
    public List<User> findAllByFirstName(String firstName) {
        List<User> userList=this.userRepository.findAllByFirstName(firstName);
        return userList;
    }

    @Override
    public List<User> findAllByFirstNameAndLastName(String firstName, String lastName) {
        List<User> userList=this.userRepository.findAllByFirstNameAndLastName(firstName,lastName);
        return userList;
    }
}
