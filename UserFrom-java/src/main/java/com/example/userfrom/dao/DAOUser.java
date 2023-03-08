package com.example.userfrom.dao;

import com.example.userfrom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOUser extends JpaRepository<User, Long> {
    User findUserById(Long id);
}
