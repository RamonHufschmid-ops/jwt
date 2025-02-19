package com.example.jwt.responses;

public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public long getExpirationTime() {
        return this.expiresIn;
    }

}
