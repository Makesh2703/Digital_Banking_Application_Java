package com.wecp.progressive.entity;
import java.util.Date;

import javax.persistence.*;

//@Entity
public class Transactions {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int transactionId;
    private int accountId;
    private double amount;
    private Date transactionDate;
    private String transactionType;

    // @ManyToOne
    // private Accounts accounts;
    
    public Transactions(){
        
    }

    public Transactions(int transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    
   

    // public Accounts getAccounts() {
    //     return accounts;
    // }
    // public void setAccounts(Accounts accounts) {
    //     this.accounts = accounts;
    // }
    

   
    
}