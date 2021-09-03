package com.example.demo.ui.controller;

import com.example.demo.io.entity.AdminUser;
import com.example.demo.service.SimpleUserService;
import com.example.demo.io.entity.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users/simple")
public class SimpleUserController {

    private final SimpleUserService simpleUserService;

    @Autowired
    public SimpleUserController(SimpleUserService simpleUserService) {
        this.simpleUserService = simpleUserService;
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SimpleUser> getSimpleUsers() {
        return simpleUserService.getSimpleUsers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleUser getSimpleUserById(@PathVariable Long id) {
        return simpleUserService.getSimpleUserById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSimpleUserById(@PathVariable Long id) {
        simpleUserService.deleteSimpleUserById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleUser insertSimpleUser(@RequestBody SimpleUser simpleUser) {
        return simpleUserService.insertSimpleUser(simpleUser);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SimpleUser updateSimpleUser(@RequestBody SimpleUser newSimpleUser, @PathVariable Long id) {
        return simpleUserService.updateSimpleUser(newSimpleUser, id);
    }
}
