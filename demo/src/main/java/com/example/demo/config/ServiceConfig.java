package com.example.demo.config;

import com.example.demo.io.dao.ServiceRepository;
import com.example.demo.io.entity.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceConfig {

    @Bean
    CommandLineRunner commandLineRunner(ServiceRepository serviceRepository) {
        return args -> {
            Service firstService = new Service("first", 10, 20);
            Service secondService = new Service("second", 20, 40);
            serviceRepository.saveAll(
                    List.of(firstService, secondService)
            );
        };
    }
}
