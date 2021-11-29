package com.github.tiwautk.SpringBootApplication.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.tiwautk.SpringBootApplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
