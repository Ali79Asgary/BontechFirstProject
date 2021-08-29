package com.example.demo.users.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users/simple")
public class SimpleUserController {

    private final SimpleUserService simpleUserService;

    @Autowired
    public SimpleUserController(SimpleUserService simpleUserService) {
        this.simpleUserService = simpleUserService;
    }

    @GetMapping
    public List<SimpleUser> getSimpleUsers() {
        return simpleUserService.getSimpleUsers();
    }
}
