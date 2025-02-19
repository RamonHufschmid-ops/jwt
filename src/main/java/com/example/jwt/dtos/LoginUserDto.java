package com.example.jwt.dtos;

public class LoginUserDto {

    private String password;

    private String email;

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
       return this.password;
    }
}
