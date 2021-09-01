package com.example.demo.config;

import com.example.demo.io.dao.AdminUserRepository;
import com.example.demo.io.dao.SimpleUserRepository;
import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.entity.SimpleUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AdminUserConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(AdminUserRepository adminUserRepository, SimpleUserRepository simpleUserRepository) {
//        return args -> {
//            AdminUser firstAdmin = new AdminUser("first", "first");
//            AdminUser secondAdmin = new AdminUser("second", "second");
//            adminUserRepository.saveAll(
//                    List.of(firstAdmin, secondAdmin)
//            );
//        };
//    }
}
