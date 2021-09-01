package com.example.demo.io.entity;

import javax.persistence.*;

@Entity
public class SimpleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(
//            name = "simple_user_sequence",
//            sequenceName = "simple_user_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "simple_user_sequence"
//    )
    private Long id;
    private String username;
    private String password;
    private String credit;

    public SimpleUser() {
    }

    public SimpleUser(String username, String password, String credit) {
        this.username = username;
        this.password = password;
        this.credit = credit;
    }

    public SimpleUser(Long id, String username, String password, String credit) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.credit = credit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
}
