package com.org.app.form.signup.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Signup {
    @GeneratedValue
    @Id
    private Long id;

    @Column(nullable = false)
    private String firstName, lastName,emailId,username;

    private String password;

    public Signup(){

    }

    public Signup(String firstName, String lastName, String password, String emailId, String username){
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.emailId=emailId;
        this.username=username;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
