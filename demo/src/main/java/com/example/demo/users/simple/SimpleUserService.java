package com.example.demo.users.simple;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleUserService {
    public List<SimpleUser> getSimpleUsers() {
        return List.of(
                new SimpleUser(
                        1L,
                        "alineo",
                        "1234",
                        "10"
                )
        );
    }
}
