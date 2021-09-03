package com.example.demo.ui.controller;

import com.example.demo.service.AdminUserService;
import com.example.demo.io.entity.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdminUser> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminUser getAdminUserById(@PathVariable Long id) {
        return adminUserService.getAdminUserById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAdminUserById(@PathVariable Long id) {
        adminUserService.deleteAdminUserById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminUser insertAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserService.insertAdminUser(adminUser);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AdminUser updateAdminUser(@RequestBody AdminUser newAdminUser, @PathVariable Long id) {
        return adminUserService.updateAdminUser(newAdminUser, id);
    }
}
