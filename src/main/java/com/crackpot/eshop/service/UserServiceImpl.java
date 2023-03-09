package com.crackpot.eshop.service;

import com.crackpot.eshop.model.Role;
import com.crackpot.eshop.model.User;
import com.crackpot.eshop.reprository.RoleRepository;
import com.crackpot.eshop.reprository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;
    @Autowired
    RoleRepository roleRepo;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        return userRepo.save(users);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String email, String roleName) {
        User users = userRepo.findUserByEmail(email).get();
        Role role = roleRepo.findByName(roleName);
        users.getRoles().add(role);
    }

}
