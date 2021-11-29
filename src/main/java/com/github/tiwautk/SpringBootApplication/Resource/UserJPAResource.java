package com.github.tiwautk.SpringBootApplication.Resource;

import com.github.tiwautk.SpringBootApplication.model.User;
import com.github.tiwautk.SpringBootApplication.service.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserJPAResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/jpa/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userRepository.findById(id).get();
    }

    @PostMapping("/jpa/users/addNew")
    public void saveNewUser(@RequestBody User newUser) {
    	userRepository.save(newUser);
    }
}