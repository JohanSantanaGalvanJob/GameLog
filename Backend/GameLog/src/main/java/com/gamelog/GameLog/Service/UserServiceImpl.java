/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.User;
import com.gamelog.GameLog.Exception.ResourceNotFoundException;
import com.gamelog.GameLog.Repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User pUser) {
        return userRepository.save(pUser);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer pUserId) {
        User lUser = userRepository.findById(pUserId).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("User with ID "+pUserId+" not found");
                });
        return lUser;
    }

    @Override
    public void deleteById(Integer pUserId) {
        userRepository.deleteById(pUserId);
    }

    @Override
    public User update(User pUser) {
        return userRepository.save(pUser);
    }

}
