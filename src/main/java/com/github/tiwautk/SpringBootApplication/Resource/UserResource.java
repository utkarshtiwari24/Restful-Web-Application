package com.github.tiwautk.SpringBootApplication.Resource;

import com.github.tiwautk.SpringBootApplication.model.User;
import com.github.tiwautk.SpringBootApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("users/addNew")
    public void saveNewUser(@RequestBody User newUser) {
        userService.saveUser(newUser);
    }
}