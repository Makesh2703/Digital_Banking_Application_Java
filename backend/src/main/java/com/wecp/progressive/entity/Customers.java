package com.wecp.progressive.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer customerId;
    private String name;
    private String email;
    private String username;
    private String password;
    private String role;

    @OneToMany
    @JsonIgnore
    private List<Accounts> accounts;

    public Customers(){

    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
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
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public List<Accounts> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
    
    
    
}