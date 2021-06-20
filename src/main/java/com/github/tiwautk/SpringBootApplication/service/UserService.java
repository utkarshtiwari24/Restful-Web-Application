package com.github.tiwautk.SpringBootApplication.service;

import com.github.tiwautk.SpringBootApplication.exception.CustomizedUserException;
import com.github.tiwautk.SpringBootApplication.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Utkarsh", 1, "Senior Analyst"));
        users.add(new User("Shivam",2,"Software Development Engineer 2"));
        users.add(new User("Ankur",3,"Lead Engineer"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(Integer id) {
        try {
            User user = users.stream().filter(userid -> userid.getId() != null && userid.getId() == id).collect(Collectors.toList()).get(0);
            return user;
        } catch(Exception e) {
            throw new CustomizedUserException("User not found for the given ID.");
        }
    }

    public void saveUser(User newUser){
        users.add(newUser);
    }

}
