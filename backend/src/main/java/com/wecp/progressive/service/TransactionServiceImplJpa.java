// // // // // package com.wecp.progressive.service;

// // // // // import java.sql.SQLException;
// // // // // import java.util.List;

// // // // // import javax.transaction.Transaction;

// // // // // import org.springframework.beans.factory.annotation.Autowired;
// // // // // import org.springframework.stereotype.Service;

// // // // // import com.wecp.progressive.entity.Transactions;
// // // // // import com.wecp.progressive.repository.TransactionRepository;

// // // // // @Service
// // // // // public class TransactionServiceImplJpa implements TransactionService{
// // // // //     @Autowired
// // // // //     private TransactionRepository transactionRepository;

// // // // //     @Override
// // // // //     public List<Transactions> getAllTransactions() {
// // // // //         // TODO Auto-generated method stub
// // // // //         // throw new UnsupportedOperationException("Unimplemented method 'getAllTransactions'");
// // // // //        // return transactionRepository.findAll();
// // // // //        return null;
// // // // //     }

// // // // //     @Override
// // // // //     public Transactions getTransactionById(int transactionId) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
// // // // //     }

// // // // //     @Override
// // // // //     public int addTransaction(Transactions transaction) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
// // // // //     }

// // // // //     @Override
// // // // //     public void updateTransaction(Transactions transaction) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         throw new UnsupportedOperationException("Unimplemented method 'updateTransaction'");
// // // // //     }

// // // // //     @Override
// // // // //     public void deleteTransaction(int transactionId) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
// // // // //     }

// // // // //     @Override
// // // // //     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
// // // // //     }
// // // // // }


// // // // package com.wecp.progressive.service;

// // // // import com.wecp.progressive.entity.Transactions;
// // // // import org.springframework.stereotype.Service;

// // // // import java.sql.SQLException;
// // // // import java.util.List;

// // // // @Service
// // // // public class TransactionServiceImplJpa implements TransactionService {

// // // //     @Override
// // // //     public List<Transactions> getAllTransactions() throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public Transactions getTransactionById(int transactionId) throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public int addTransaction(Transactions transaction) throws SQLException {
// // // //         return 0;
// // // //     }

// // // //     @Override
// // // //     public void updateTransaction(Transactions transaction) throws SQLException {

// // // //     }

// // // //     @Override
// // // //     public void deleteTransaction(int transactionId) throws SQLException {

// // // //     }

// // // //     @Override
// // // //     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
// // // //         // TODO Auto-generated method stub
// // // //         throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
// // // //     }
// // // // }


// // // package com.wecp.progressive.service;

// // // import com.wecp.progressive.entity.Transactions;
// // // import com.wecp.progressive.repository.AccountRepository;
// // // import com.wecp.progressive.repository.TransactionRepository;

// // // import org.springframework.beans.factory.annotation.Autowired;
// // // import org.springframework.stereotype.Service;

// // // import java.sql.SQLException;
// // // import java.util.List;

// // // @Service
// // // public class TransactionServiceImplJpa implements TransactionService {
// // //     private TransactionRepository transactionRepository;
// // //     private AccountRepository accountRepository;
    
// // //     @Autowired
// // //     public TransactionServiceImplJpa(TransactionRepository transactionRepository,AccountRepository accountRepository) {
// // //         this.transactionRepository = transactionRepository;
// // //         this.accountRepository = accountRepository;
// // //     }
// // //     @Override
// // //     public List<Transactions> getAllTransactions() throws SQLException {
// // //         return null;
// // //     }

// // //     @Override
// // //     public Transactions getTransactionById(int transactionId) throws SQLException {
// // //         return null;
// // //     }

// // //     @Override
// // //     public int addTransaction(Transactions transaction) throws SQLException {
// // //         return 0;
// // //     }

// // //     @Override
// // //     public void updateTransaction(Transactions transaction) throws SQLException {

// // //     }

// // //     @Override
// // //     public void deleteTransaction(int transactionId) throws SQLException {

// // //     }

// // //     @Override
// // //     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
// // //         return null;
// // //     }
// // // }

// // package com.wecp.progressive.service;

// // import com.wecp.progressive.entity.Accounts;
// // import com.wecp.progressive.entity.Transactions;
// // import com.wecp.progressive.repository.AccountRepository;
// // import com.wecp.progressive.repository.TransactionRepository;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Service;

// // import java.sql.SQLException;
// // import java.util.List;

// // @Service
// // public class TransactionServiceImplJpa implements TransactionService {
// //     private TransactionRepository transactionRepository;
// //     private AccountRepository accountRepository;
// //     @Autowired
// //     public TransactionServiceImplJpa(TransactionRepository transactionRepository,AccountRepository accountRepository) {
// //         this.transactionRepository = transactionRepository;
// //         this.accountRepository = accountRepository;
// //     }
// //     @Override
// //     public List<Transactions> getAllTransactions() throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public Transactions getTransactionById(int transactionId) throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public int addTransaction(Transactions transaction) throws SQLException {
// //         return 0;
// //     }

// //     @Override
// //     public void updateTransaction(Transactions transaction) throws SQLException {

// //     }

// //     @Override
// //     public void deleteTransaction(int transactionId) throws SQLException {

// //     }

// //     @Override
// //     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
// //         return null;
// //     }
// // }

// package com.wecp.progressive.service;


// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.repository.AccountRepository;
// import com.wecp.progressive.repository.TransactionRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.List;

// @Service
// public class TransactionServiceImplJpa implements TransactionService {

//     private TransactionRepository transactionRepository;
//     private AccountRepository accountRepository;
//     @Autowired
//     public TransactionServiceImplJpa(TransactionRepository transactionRepository, AccountRepository accountRepository) {
//         this.transactionRepository = transactionRepository;
//         this.accountRepository = accountRepository;
//     }

//     @Override
//     public List<Transactions> getAllTransactions() {
//         return transactionRepository.findAll();
//     }

//     @Override
//     public Transactions getTransactionById(int transactionId) {
//         return transactionRepository.findById(transactionId).orElse(null);
//     }

//     @Override
//     public int addTransaction(Transactions transaction) throws SQLException {
//         Accounts account = accountRepository.findByAccountId(transaction.getAccounts().getAccountId());
//         double balance = account.getBalance();
//         if (transaction.getTransactionType().equalsIgnoreCase("credit")) {
//             balance = balance + transaction.getAmount();
//         }
//         else {
//             balance = balance - transaction.getAmount();
//         }
//         account.setBalance(balance);
//         accountRepository.save(account);
//         return transactionRepository.save(transaction).getTransactionId();
//     }

//     @Override
//     public void updateTransaction(Transactions transaction) {
//         transactionRepository.save(transaction);
//     }

//     @Override
//     public void deleteTransaction(int transactionId) {
//         transactionRepository.deleteById(transactionId);
//     }

//     @Override
//     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
//         List<Accounts> accountsList = accountRepository.getAccountsByCustomerCustomerId(customerId);
//         List<Transactions> allTransactions = new ArrayList<>();
//         for (Accounts account : accountsList) {
//             List<Transactions> transactionsForAccount = transactionRepository.findByAccountsAccountId(account.getAccountId());
//             allTransactions.addAll(transactionsForAccount);
//         }
//         return allTransactions;
//     }
// }

package com.wecp.progressive.service;


import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.exception.OutOfBalanceException;
import com.wecp.progressive.exception.WithdrawalLimitException;
import com.wecp.progressive.repository.AccountRepository;
import com.wecp.progressive.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImplJpa implements TransactionService {

    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;
    @Autowired
    public TransactionServiceImplJpa(TransactionRepository transactionRepository,AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Transactions> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transactions getTransactionById(int transactionId) {
        return transactionRepository.findById(transactionId).orElse(null);
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        Accounts account = accountRepository.findByAccountId(transaction.getAccounts().getAccountId());
        double balance = account.getBalance();
        if (transaction.getAmount() > 30000 && transaction.getTransactionType().equalsIgnoreCase("debit")) {
            throw new WithdrawalLimitException("Exceeded the withdrawal limit.");
        }
        if (balance < transaction.getAmount() && transaction.getTransactionType().equalsIgnoreCase("debit")) {
            throw new OutOfBalanceException("Transaction amount exceeds the total balance available in the account.");
        }
        if (transaction.getTransactionType().equalsIgnoreCase("credit")) {
            balance = balance + transaction.getAmount();
        }
        else {
            balance = balance - transaction.getAmount();
        }
        account.setBalance(balance);
        accountRepository.save(account);
        return transactionRepository.save(transaction).getTransactionId();
    }

    @Override
    public void updateTransaction(Transactions transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(int transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        List<Accounts> accountsList = accountRepository.getAccountsByCustomerCustomerId(customerId);
        List<Transactions> allTransactions = new ArrayList<>();
        if (accountsList.isEmpty()) {
            throw new AccountNotFoundException("No accounts found linked with this customer");
        }
        for (Accounts account : accountsList) {
            List<Transactions> transactionsForAccount = transactionRepository.findByAccountsAccountId(account.getAccountId());
            allTransactions.addAll(transactionsForAccount);
        }
        return allTransactions;
    }
}
