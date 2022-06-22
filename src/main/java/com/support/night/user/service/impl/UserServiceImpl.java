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
        return null;
    }
}
