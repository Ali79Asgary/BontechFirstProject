package com.example.demo.service;

import com.example.demo.io.entity.SimpleUser;
import com.example.demo.io.dao.SimpleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleUserService {

    private final SimpleUserRepository simpleUserRepository;

    @Autowired
    public SimpleUserService(SimpleUserRepository simpleUserRepository) {
        this.simpleUserRepository = simpleUserRepository;
    }

    public List<SimpleUser> getSimpleUsers() {
        return simpleUserRepository.findAll();
    }
}
