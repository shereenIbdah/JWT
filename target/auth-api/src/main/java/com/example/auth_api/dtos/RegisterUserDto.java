package com.example.auth_api.dtos;

import com.example.auth_api.entities.Role;

import java.util.List;

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    private List<Role> roles;

    // getters and setters here...

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}