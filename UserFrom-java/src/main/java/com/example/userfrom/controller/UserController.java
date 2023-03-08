package com.example.userfrom.controller;

import com.example.userfrom.entity.User;
import com.example.userfrom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.add(user);
        return "user added" ;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return  "user deleted";
    }

}
