package com.gateway.project.usersservice;

import com.gateway.project.usersservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(1L, "Aymane Eddamane", "aymane@gmail.com"),
                new User(2L, "Edd Not", "eddamane@gmail.com")
        );
    }
}
