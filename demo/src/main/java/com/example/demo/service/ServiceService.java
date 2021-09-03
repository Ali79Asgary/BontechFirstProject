package com.example.demo.service;

import com.example.demo.io.dao.ServiceRepository;
import com.example.demo.io.entity.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<com.example.demo.io.entity.Service> getService() {
        return serviceRepository.findAll();
    }

    public com.example.demo.io.entity.Service getServiceById(@PathVariable Long id) {
        return serviceRepository.getById(id);
    }

    public com.example.demo.io.entity.Service insertService(@RequestBody com.example.demo.io.entity.Service service) {
        return serviceRepository.save(service);
    }

    public void deleteServiceById(@PathVariable Long id) {
        serviceRepository.deleteById(id);
    }

    public com.example.demo.io.entity.Service updateService(
            @RequestBody com.example.demo.io.entity.Service newService,
            @PathVariable Long id) {
        return serviceRepository.findById(id).map(service -> {
            service.setName(newService.getName());
            service.setCost(newService.getCost());
            service.setMaxNumOfUses(newService.getMaxNumOfUses());
            return serviceRepository.save(service);
        }).orElseGet(() -> {
            return serviceRepository.save(newService);
        });
    }
}
