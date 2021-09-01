package com.example.demo.config;

import com.example.demo.io.dao.SimpleUserRepository;
import com.example.demo.io.entity.SimpleUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SimpleUserConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(SimpleUserRepository simpleUserRepository) {
//        return args -> {
//            SimpleUser firstUser = new SimpleUser("first", "first", "1");
//            SimpleUser secondUser = new SimpleUser("second", "second", "2");
//            simpleUserRepository.saveAll(
//                    List.of(firstUser, secondUser)
//            );
//        };
//    }
}
