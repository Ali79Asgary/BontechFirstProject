package com.example.demo.service;

import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.dao.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AdminUserService {

    private final AdminUserRepository adminUserRepository;

    @Autowired
    public AdminUserService(AdminUserRepository adminUserRepository) {
        this.adminUserRepository = adminUserRepository;
    }

    public List<AdminUser> getAdminUsers() {
        return adminUserRepository.findAll();
    }

    public AdminUser getAdminUserById(@PathVariable Long id) {
        return adminUserRepository.getById(id);
    }

    public AdminUser insertAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserRepository.save(adminUser);
    }

    public void deleteAdminUserById(@PathVariable Long id) {
        adminUserRepository.deleteById(id);
    }

    public AdminUser updateAdminUser(@RequestBody AdminUser newAdminUser, @PathVariable Long id) {
        return adminUserRepository.findById(id).map(adminUser -> {
            adminUser.setUsername(newAdminUser.getUsername());
            adminUser.setPassword(newAdminUser.getPassword());
            return adminUserRepository.save(adminUser);
        }).orElseGet(() -> {
            return adminUserRepository.save(newAdminUser);
        });
    }
}
