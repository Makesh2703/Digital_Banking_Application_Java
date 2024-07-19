// // // // // // package com.wecp.progressive.service;

// // // // // // import java.sql.SQLException;
// // // // // // import java.util.List;

// // // // // // import org.springframework.beans.factory.annotation.Autowired;
// // // // // // import org.springframework.stereotype.Service;

// // // // // // import com.wecp.progressive.entity.Accounts;
// // // // // // import com.wecp.progressive.repository.AccountRepository;

// // // // // // @Service
// // // // // // public class AccountServiceImplJpa implements AccountService {
// // // // // //     @Autowired
// // // // // //     private AccountRepository accountRepository;

// // // // // //     @Override
// // // // // //     public List<Accounts> getAllAccounts() throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
// // // // // //         return accountRepository.findAll();
// // // // // //     }

// // // // // //     @Override
// // // // // //     public List<Accounts> getAccountsByUser(int customerId) throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
// // // // // //         return accountRepository.getAccountByUser(customerId);
// // // // // //     }

// // // // // //     @Override
// // // // // //     public Accounts getAccountById(int accountId) throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
// // // // // //         return accountRepository.findById(accountId).orElse(null);
// // // // // //     }

// // // // // //     @Override
// // // // // //     public int addAccount(Accounts accounts) throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
// // // // // //         accountRepository.save(accounts);
// // // // // //         return accounts.getAccountId();
// // // // // //     }

// // // // // //     @Override
// // // // // //     public void updateAccount(Accounts accounts) throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
// // // // // //         accountRepository.save(accounts);
// // // // // //     }

// // // // // //     @Override
// // // // // //     public void deleteAccount(int accountId) throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
// // // // // //         accountRepository.deleteById(accountId);
// // // // // //     }

// // // // // //     @Override
// // // // // //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
// // // // // //         return accountRepository.getAllAccountsSortedByBalance();
// // // // // //     }

// // // // // //     @Override
// // // // // //     public List<Accounts> getAllAccountsFromArrayList() {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
// // // // // //         return null;
// // // // // //     }

// // // // // //     @Override
// // // // // //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         //throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
// // // // // //         return null;
// // // // // //     }

// // // // // //     @Override
// // // // // //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// // // // // //         // TODO Auto-generated method stub
// // // // // //        // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
// // // // // //        return null;
// // // // // //     }

// // // // // //     @Override
// // // // // //     public void emptyArrayList() {
// // // // // //         // TODO Auto-generated method stub
// // // // // //         // throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
        
// // // // // //     }
    
// // // // // // }

// // // // // package com.wecp.progressive.service;


// // // // // import com.wecp.progressive.entity.Accounts;
// // // // // import org.springframework.stereotype.Service;

// // // // // import java.sql.SQLException;
// // // // // import java.util.List;

// // // // // @Service
// // // // // public class AccountServiceImplJpa implements  AccountService{

// // // // //     @Override
// // // // //     public List<Accounts> getAllAccounts() throws SQLException {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public Accounts getAccountById(int accountId) throws SQLException {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public int addAccount(Accounts accounts) throws SQLException {
// // // // //         return 0;
// // // // //     }

// // // // //     @Override
// // // // //     public void updateAccount(Accounts accounts) throws SQLException {

// // // // //     }

// // // // //     @Override
// // // // //     public void deleteAccount(int accountId) throws SQLException {

// // // // //     }

// // // // //     @Override
// // // // //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Accounts> getAllAccountsFromArrayList() {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public void emptyArrayList() {

// // // // //     }
// // // // // }

// // // // package com.wecp.progressive.service;


// // // // import com.wecp.progressive.entity.Accounts;
// // // // import org.springframework.stereotype.Service;

// // // // import java.sql.SQLException;
// // // // import java.util.List;

// // // // @Service
// // // // public class AccountServiceImplJpa implements  AccountService{

// // // //     @Override
// // // //     public List<Accounts> getAllAccounts() throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public Accounts getAccountById(int accountId) throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public int addAccount(Accounts accounts) throws SQLException {
// // // //         return 0;
// // // //     }

// // // //     @Override
// // // //     public void updateAccount(Accounts accounts) throws SQLException {

// // // //     }

// // // //     @Override
// // // //     public void deleteAccount(int accountId) throws SQLException {

// // // //     }

// // // //     @Override
// // // //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public List<Accounts> getAllAccountsFromArrayList() {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public void emptyArrayList() {

// // // //     }
// // // // }
// // // package com.wecp.progressive.service;
 
 
// // // import com.wecp.progressive.entity.Accounts;
// // // import com.wecp.progressive.repository.AccountRepository;
 
// // // import org.springframework.beans.factory.annotation.Autowired;
// // // import org.springframework.stereotype.Service;
 
// // // import java.sql.SQLException;
// // // import java.util.List;
 
// // // @Service
// // // public class AccountServiceImplJpa implements  AccountService{
 
// // //     private AccountRepository accountRepository;
// // //     @Autowired
// // //     public AccountServiceImplJpa(AccountRepository accountRepository) {
// // //         this.accountRepository = accountRepository;
// // //     }
 
// // //     @Override
// // //     public List<Accounts> getAllAccounts() throws SQLException {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public Accounts getAccountById(int accountId) throws SQLException {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public int addAccount(Accounts accounts) throws SQLException {
// // //         return 0;
// // //     }
 
// // //     @Override
// // //     public void updateAccount(Accounts accounts) throws SQLException {
 
// // //     }
 
// // //     @Override
// // //     public void deleteAccount(int accountId) throws SQLException {
 
// // //     }
 
// // //     @Override
// // //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public List<Accounts> getAllAccountsFromArrayList() {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// // //         return null;
// // //     }
 
// // //     @Override
// // //     public void emptyArrayList() {
 
// // //     }
// // // }

// // package com.wecp.progressive.service;


// // import com.wecp.progressive.entity.Accounts;
// // import com.wecp.progressive.repository.AccountRepository;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Service;

// // import java.sql.SQLException;
// // import java.util.List;

// // @Service
// // public class AccountServiceImplJpa implements  AccountService{

// //     private AccountRepository accountRepository;
// //     @Autowired
// //     public AccountServiceImplJpa(AccountRepository accountRepository) {
// //         this.accountRepository = accountRepository;
// //     }

// //     @Override
// //     public List<Accounts> getAllAccounts() throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public Accounts getAccountById(int accountId) throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public int addAccount(Accounts accounts) throws SQLException {
// //         return 0;
// //     }

// //     @Override
// //     public void updateAccount(Accounts accounts) throws SQLException {

// //     }

// //     @Override
// //     public void deleteAccount(int accountId) throws SQLException {

// //     }

// //     @Override
// //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public List<Accounts> getAllAccountsFromArrayList() {
// //         return null;
// //     }

// //     @Override
// //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// //         return null;
// //     }

// //     @Override
// //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// //         return null;
// //     }

// //     @Override
// //     public void emptyArrayList() {

// //     }
// // }

// package com.wecp.progressive.service;


// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.repository.AccountRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.sql.SQLException;
// import java.util.Comparator;
// import java.util.List;

// @Service
// public class AccountServiceImplJpa implements AccountService{

//     private AccountRepository accountRepository;
//     @Autowired
//     public AccountServiceImplJpa(AccountRepository accountRepository) {
//         this.accountRepository = accountRepository;
//     }

//     @Override
//     public List<Accounts> getAllAccounts() throws SQLException {
//         return accountRepository.findAll();
//     }

//     @Override
//     public List<Accounts> getAccountsByUser(int customerId) throws SQLException {
//         return accountRepository.getAccountsByCustomerCustomerId(customerId);
//     }

//     @Override
//     public Accounts getAccountById(int accountId) {
//         return accountRepository.findById(accountId).orElse(null);
//     }

//     @Override
//     public int addAccount(Accounts accounts) {
//         return accountRepository.save(accounts).getAccountId();
//     }

//     @Override
//     public void updateAccount(Accounts accounts) {
//         accountRepository.save(accounts);
//     }

//     @Override
//     public void deleteAccount(int accountId) {
//         accountRepository.deleteById(accountId);
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
//         List<Accounts> sortedAccounts = getAllAccounts();
//         sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
//         return sortedAccounts;
//     }

//     // Do not implement these methods
//     @Override
//     public List<Accounts> getAllAccountsFromArrayList() {
//         return null;
//     }

//     @Override
//     public List<Accounts> addAccountToArrayList(Accounts accounts) {
//         return null;
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
//         return null;
//     }

//     @Override
//     public void emptyArrayList() {

//     }
// }

package com.wecp.progressive.service;


import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImplJpa implements AccountService{

    private AccountRepository accountRepository;
    @Autowired
    public AccountServiceImplJpa(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountRepository.findAll();
    }

    @Override
    public List<Accounts> getAccountsByUser(int customerId) throws SQLException {
        return accountRepository.getAccountsByCustomerCustomerId(customerId);
    }

    @Override
    public Accounts getAccountById(int accountId) {
        Optional<Accounts> accounts = accountRepository.findById(accountId);
        if (accounts.isPresent()) {
            return accounts.get();
        }
        else {
            throw new AccountNotFoundException("No accounts found linked with this accountId");
        }
    }

    @Override
    public int addAccount(Accounts accounts) {
        return accountRepository.save(accounts).getAccountId();
    }

    @Override
    public void updateAccount(Accounts accounts) {
        accountRepository.save(accounts);
    }

    @Override
    public void deleteAccount(int accountId) {
        accountRepository.deleteById(accountId);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List<Accounts> sortedAccounts = getAllAccounts();
        sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
        return sortedAccounts;
    }

    // Do not implement these methods
    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return null;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        return null;
    }

    @Override
    public void emptyArrayList() {

    }
}