package com.example.demo.config;

import com.example.demo.io.dao.AdminUserRepository;
import com.example.demo.io.dao.ServiceRepository;
import com.example.demo.io.dao.SimpleUserRepository;
import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.entity.Service;
import com.example.demo.io.entity.SimpleUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AllConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(
//            AdminUserRepository adminUserRepository,
//            SimpleUserRepository simpleUserRepository,
//            ServiceRepository serviceRepository) {
//        return args -> {
//            AdminUser firstAdmin = new AdminUser("first", "first");
//            AdminUser secondAdmin = new AdminUser("second", "second");
//            adminUserRepository.saveAll(
//                    List.of(firstAdmin, secondAdmin)
//            );
//
//            SimpleUser firstUser = new SimpleUser("first", "first", "1");
//            SimpleUser secondUser = new SimpleUser("second", "second", "2");
//            simpleUserRepository.saveAll(
//                    List.of(firstUser, secondUser)
//            );
//
//            Service firstService = new Service("first", 10, 20);
//            Service secondService = new Service("second", 20, 40);
//            serviceRepository.saveAll(
//                    List.of(firstService, secondService)
//            );
//        };
//    }
}
