package com.techacademy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.entity.User;
import com.techacademy.repository.UserRepository;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    //全件を検索して返す
    public List<User> getUserList(){
        //リポジトリのFindAllメソッドを呼び出す
        return userRepository.findAll();
    }
    
    //Userの登録
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
