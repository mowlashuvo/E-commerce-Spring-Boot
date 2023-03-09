package com.crackpot.eshop.service;


import com.crackpot.eshop.model.Role;
import com.crackpot.eshop.model.User;

public interface UserService {
    User saveUser(User users);
    Role saveRole(Role role);
    void addRoleToUser(String email, String roleName);
}
