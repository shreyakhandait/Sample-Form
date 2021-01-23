package com.org.app.form.login.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {
    @GeneratedValue
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;
    private String password;

    public Login(){

    }
    public Login(String username, String password){
        this.id=id;
        this.username=username;
        this.password=password;

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
}

