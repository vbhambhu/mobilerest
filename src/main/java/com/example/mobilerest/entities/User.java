package com.example.mobilerest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(unique=true)
    @NotEmpty(message = "The username field must not be empty.")
    @Size(min = 4, max = 30, message = "The username field must be between 4 and 30 characters.")
    private String username;

    @NotEmpty(message = "The password field must not be empty.")
    @Size(min = 5, max = 150, message = "The password field must be between 5 and 50 characters.")
    private String password;

    private String email;

    private String nickName;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
