package com.example.demo.io.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int cost;
    private int MaxNumOfUses;

    @ManyToMany
    Set<SimpleUser> simpleUsers;

    public Service() {
    }

    public Service(String name, int cost, int maxNumOfUses) {
        this.name = name;
        this.cost = cost;
        MaxNumOfUses = maxNumOfUses;
    }

    public Service(Long id, String name, int cost, int maxNumOfUses) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        MaxNumOfUses = maxNumOfUses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxNumOfUses() {
        return MaxNumOfUses;
    }

    public void setMaxNumOfUses(int maxNumOfUses) {
        MaxNumOfUses = maxNumOfUses;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", MaxNumOfUses=" + MaxNumOfUses +
                '}';
    }
}
