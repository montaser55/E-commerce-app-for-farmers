package com.example.faiza.retrofitapply;

public class User {
    private String mobileno;
    private String password;

    public User(String mobileno, String password) {
        this.mobileno = mobileno;
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
