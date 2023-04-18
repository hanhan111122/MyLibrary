package com.example.libapp;



public class HelperClass {

    String name, email, bookname, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return bookname;
    }

    public void setUsername(String username) {
        this.bookname = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HelperClass(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.bookname = username;
        this.password = password;
    }

    public HelperClass() {
    }
}