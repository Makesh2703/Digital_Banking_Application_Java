package com.wecp.progressive.entity;

import javax.persistence.*;

@Entity
public class Accounts implements Comparable<Accounts> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    @ManyToOne
    @JoinColumn(name = "customerId") // name refers to the column name in the Accounts table
    private Customers customer;

    private double balance;

    public Accounts() {
        // constrcutor
    }


    public Accounts(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customer.setCustomerId(customerId);
        this.balance=balance;
    }

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Accounts otherAccounts) {
        // Implement comparison logic based on account balance
        return Double.compare(this.getBalance(), otherAccounts.getBalance());
    }
}