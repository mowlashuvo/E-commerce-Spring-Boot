package com.crackpot.eshop;

import com.crackpot.eshop.model.Role;
import com.crackpot.eshop.model.User;
import com.crackpot.eshop.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class OnlineGroceryShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineGroceryShopApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {

//            Role userRole = new Role(1, "ROLE_USER");
//            Role managerRole = new Role(2, "ROLE_MANAGER");
//            Role adminRole = new Role(3, "ROLE_ADMIN");
//            Role superAdminRole = new Role(4, "ROLE_SUPER_ADMIN");
//
//            userService.saveRole(userRole);
//            userService.saveRole(managerRole);
//            userService.saveRole(adminRole);
//            userService.saveRole(superAdminRole);
//
//            List<Role> roles = new ArrayList<>();
//            roles.add(userRole);
//            roles.add(managerRole);
//            roles.add(adminRole);
//            roles.add(superAdminRole);
//
//            User user = new User();
//            user.setFirstName("mowla");
//            user.setLastName("shuvo");
//            user.setEmail("mowlashuvo2@gmail.com");
//            user.setPassword("shuvo33788");
//            user.setRoles(roles);
//
//            userService.saveUser(new User(user));

//            userService.addRoleToUser("mowlashuvo2@gmail.com", "ROLE_USER");
//            userService.addRoleToUser("mowlashuvo2@gmail.com", "ROLE_MANAGER");
//            userService.addRoleToUser("mowlashuvo2@gmail.com", "ROLE_ADMIN");
//            userService.addRoleToUser("mowlashuvo2@gmail.com", "ROLE_SUPER_ADMIN");

        };
    }

}
