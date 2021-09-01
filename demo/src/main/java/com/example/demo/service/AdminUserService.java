package com.example.demo.service;

import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.dao.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
