package com.org.app.form.login.dto;

public class LoginDetails {

    private Long id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public LoginDetails(){

    }

    public LoginDetails(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
