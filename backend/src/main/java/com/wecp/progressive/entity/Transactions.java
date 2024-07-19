// // package com.wecp.progressive.entity;
// // import java.util.Date;

// // import javax.persistence.*;

// // //@Entity
// // public class Transactions {

// //     // @Id
// //     // @GeneratedValue(strategy = GenerationType.IDENTITY)
    
// //     private int transactionId;
// //     private int accountId;
// //     private double amount;
// //     private Date transactionDate;
// //     private String transactionType;

// //     // @ManyToOne
// //     // private Accounts accounts;
    
// //     public Transactions(){
        
// //     }

// //     public Transactions(int transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
// //         this.transactionId = transactionId;
// //         this.accountId = accountId;
// //         this.amount = amount;
// //         this.transactionDate = transactionDate;
// //         this.transactionType = transactionType;
// //     }

// //     public int getTransactionId() {
// //         return transactionId;
// //     }

// //     public void setTransactionId(int transactionId) {
// //         this.transactionId = transactionId;
// //     }

// //     public int getAccountId() {
// //         return accountId;
// //     }

// //     public void setAccountId(int accountId) {
// //         this.accountId = accountId;
// //     }

// //     public double getAmount() {
// //         return amount;
// //     }

// //     public void setAmount(double amount) {
// //         this.amount = amount;
// //     }

// //     public Date getTransactionDate() {
// //         return transactionDate;
// //     }

// //     public void setTransactionDate(Date transactionDate) {
// //         this.transactionDate = transactionDate;
// //     }

// //     public String getTransactionType() {
// //         return transactionType;
// //     }

// //     public void setTransactionType(String transactionType) {
// //         this.transactionType = transactionType;
// //     }
    
    
   

// //     // public Accounts getAccounts() {
// //     //     return accounts;
// //     // }
// //     // public void setAccounts(Accounts accounts) {
// //     //     this.accounts = accounts;
// //     // }
    

   
    
// // }

// package com.wecp.progressive.entity;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import java.util.Date;

// @Entity
// public class Transactions {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int transactionId;
//     private int accountId;
//     private double amount;
//     private String transactionType;
//     private Date transactionDate;

//     public Transactions() {
//         //
//     }

//     public Transactions(int transactionId, int accountId, double amount, Date timestamp, String transactionType) {
//         this.transactionId = transactionId;
//         this.accountId = accountId;
//         this.amount = amount;
//         this.transactionDate = timestamp;
//         this.transactionType = transactionType;
//     }

//     // Getters and setters
//     public int getTransactionId() {
//         return transactionId;
//     }

//     public void setTransactionId(int transactionId) {
//         this.transactionId = transactionId;
//     }

//     public int getAccountId() {
//         return accountId;
//     }

//     public void setAccountId(int accountId) {
//         this.accountId = accountId;
//     }

//     public double getAmount() {
//         return amount;
//     }

//     public void setAmount(double amount) {
//         this.amount = amount;
//     }

//     public Date getTransactionDate() {
//         return transactionDate;
//     }

//     public void setTransactionDate(Date transactionDate) {
//         this.transactionDate = transactionDate;
//     }

//     public String getTransactionType() {
//         return transactionType;
//     }

//     public void setTransactionType(String transactionType) {
//         this.transactionType = transactionType;
//     }
// }

package com.wecp.progressive.entity;
import javax.persistence.*;
import java.util.Date;
@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    @ManyToOne
    @JoinColumn(name = "accountId")
    private Accounts accounts;
    private double amount;
    private String transactionType;
    private Date transactionDate;

    public Transactions() {
        //
    }

    public Transactions(int transactionId, int accountId, double amount, Date timestamp, String transactionType) {
        this.transactionId = transactionId;
        this.accounts.setAccountId(accountId);
        this.amount = amount;
        this.transactionDate = timestamp;
        this.transactionType = transactionType;
    }

    // Getters and setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
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
}