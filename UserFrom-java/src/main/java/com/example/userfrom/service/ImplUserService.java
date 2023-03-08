package com.example.userfrom.service;


import com.example.userfrom.dao.DAOUser;
import com.example.userfrom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplUserService implements UserService {

    @Autowired
    private DAOUser daoUser;

    @Override
    public void add(User user) {
      daoUser.save(user);
    }

    @Override
    public void delete(Long id) {
       if(daoUser.findUserById(id) != null){
           daoUser.deleteById(id);
       }
    }
}
