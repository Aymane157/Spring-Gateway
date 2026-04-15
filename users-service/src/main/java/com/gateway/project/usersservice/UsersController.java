package com.gateway.project.usersservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    // Define the data structure
    public record User(Long id, String name, String email) {}

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(1L, "Alice Martin", "alice@example.com"),
                new User(2L, "Bob Dupont", "bob@example.com"),
                new User(3L, "Clara Petit", "clara@example.com")
        );
    }
}
