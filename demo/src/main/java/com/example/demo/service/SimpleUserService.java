package com.example.demo.service;

import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.entity.SimpleUser;
import com.example.demo.io.dao.SimpleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    public SimpleUser getSimpleUserById(@PathVariable Long id) {
        return simpleUserRepository.getById(id);
    }

    public SimpleUser insertSimpleUser(@RequestBody SimpleUser simpleUser) {
        return simpleUserRepository.save(simpleUser);
    }

    public void deleteSimpleUserById(@PathVariable Long id) {
        simpleUserRepository.deleteById(id);
    }

    public SimpleUser updateSimpleUser(@RequestBody SimpleUser newSimpleUser, @PathVariable Long id) {
        return simpleUserRepository.findById(id).map(simpleUser -> {
            simpleUser.setUsername(newSimpleUser.getUsername());
            simpleUser.setPassword(newSimpleUser.getPassword());
            return simpleUserRepository.save(simpleUser);
        }).orElseGet(() -> {
            return simpleUserRepository.save(newSimpleUser);
        });
    }
}
