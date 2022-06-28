package com.support.night.user.service.impl;

import com.support.night.user.entity.User;
import com.support.night.user.repository.UserRepository;
import com.support.night.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    public User update(Long id, User user) {
        user.setId(id);
        User user1 = this.userRepository.save(user);
        return user1;
    }

    @Override
    public Map<String, String> delete(Long id) {
        Optional<User> optionalUser=this.userRepository.findById(id);
        Map<String,String> messageMap=new HashMap<>();
        if(optionalUser.isPresent()){
            this.userRepository.delete(optionalUser.get());
            messageMap.put("message","successfully deleted");
        }
        else{
            messageMap.put("message","already deleted or id not found!! unable to delete");
        }
        return messageMap;
    }

    @Override
    public Map<String,Object> getById(Long id) {
        Map<String,Object> response=new HashMap<>();
        Optional<User> optionalUser=this.userRepository.findById(id);
        if(optionalUser.isPresent()){
            User user=optionalUser.get();
            response.put("data",user);
        }
        else{
            response.put("message","user not found under this id");
        }
      return response;
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
