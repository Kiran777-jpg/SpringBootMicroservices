package com.example.WebMvc_App1.forms.entity;

public class User {
    private String name;
    private String email;
    private Long phno;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhno() {
        return this.phno;
    }

    public void setPhno() {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phno=" + phno +
                '}';
    }
}
