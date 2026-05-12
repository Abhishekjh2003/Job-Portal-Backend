package com.jobportalbackend.HireHub.service;

import com.jobportalbackend.HireHub.entity.User;

public interface UserService {

    User registerUser(User user);

    User findByEmail(String email);
    
    String loginUser(User user);
}