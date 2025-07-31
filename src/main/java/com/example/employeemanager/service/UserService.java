package com.example.employeemanager.service;

import com.example.employeemanager.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.employeemanager.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}