package com.example.userfrom.service;

import com.example.userfrom.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public void add(User user);
    public void delete(Long id);
}
