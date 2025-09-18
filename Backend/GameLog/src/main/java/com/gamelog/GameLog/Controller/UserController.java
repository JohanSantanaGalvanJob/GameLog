/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Controller;

import com.gamelog.GameLog.Entity.User;
import com.gamelog.GameLog.Service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johan
 */

@RestController
//http://localhost:8080/api/users
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping
    public User save(@RequestBody User pUser){
        return userService.save(pUser);
    }
    
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    
    @GetMapping("/{pUserId}")
    public User findById(@PathVariable Integer pUserId){
        return userService.findById(pUserId);
    }
    
    @DeleteMapping("/{pUserId}")
    public void deleteById(@PathVariable Integer pUserId){
        userService.deleteById(pUserId);
    }
    
    @PutMapping
    public User updateUser(@RequestBody User pUser){
        User lUserDb = userService.findById(pUser.getUserId());
        lUserDb.setName(pUser.getName());
        lUserDb.setEmail(pUser.getEmail());
        return userService.update(lUserDb);
    }
    
}
