package com.example.demo.ui.controller;

import com.example.demo.io.entity.AdminUser;
import com.example.demo.io.entity.Service;
import com.example.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/services/service")
public class ServiceController {

    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Service> getService() {
        return serviceService.getService();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Service getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteServiceById(@PathVariable Long id) {
        serviceService.deleteServiceById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Service insertService(@RequestBody Service service) {
        return serviceService.insertService(service);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Service updateService(@RequestBody Service newService, @PathVariable Long id) {
        return serviceService.updateService(newService, id);
    }
}
