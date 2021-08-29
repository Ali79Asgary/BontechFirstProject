package com.example.demo.users.admin;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserService {
    public List<AdminUser> getAdminUsers() {
        return List.of(
                new AdminUser(
                        1L,
                        "admin",
                        "1234"
                )
        );
    }
}
