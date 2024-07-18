package com.wecp.progressive.entity;

import javax.persistence.*;

@Entity
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private Integer customerId;
    private Double balance;

    public Accounts(Integer customerId, Double balance) {
        this.customerId = customerId;
        this.balance = balance;
    }
    public Accounts(){

    }
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public Integer getCustomer_id() {
        return customerId;
    }
    public void setCustomer_id(Integer customerId) {
        this.customerId = customerId;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    

}