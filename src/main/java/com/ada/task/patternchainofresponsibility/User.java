package com.ada.task.patternchainofresponsibility;


import lombok.Getter;

@Getter
public class User {
    private String name;
    private String surname;
    private String password;
    private String email;
    private String phone;

    public User(String name, String surname, String password, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
}