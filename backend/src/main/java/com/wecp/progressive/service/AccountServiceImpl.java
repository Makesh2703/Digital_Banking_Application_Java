// // package com.wecp.progressive.service;


// // import com.wecp.progressive.dao.AccountDAO;
// // import com.wecp.progressive.entity.Accounts;

// // import java.sql.SQLException;
// // import java.util.List;

// // public class AccountServiceImpl implements AccountService {

// //     private AccountDAO accountDAO;

// //     public AccountServiceImpl(AccountDAO accountDAO) {
// //         this.accountDAO = accountDAO;
// //     }
// //     @Override
// //     public List<Accounts> getAllAccounts() throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public Accounts getAccountById(int accountId) throws SQLException {
// //         return null;
// //     }

// //     @Override
// //     public int addAccount(Accounts accounts) throws SQLException {
// //         return -1;
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
// //     public List<Accounts> getAccountsByUser(int userId) throws SQLException{
// //         return null;
// //     }

// //     @Override
// //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
// //         return null;
// //     }

// //     @Override
// //     public void emptyArrayList() {

// //     }

// //     @Override
// //     public List<Accounts> getAllAccountsFromArrayList() {
// //         return null;
// //     }
// //     @Override
// //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
// //         return null;
// //     }
// // }

// package com.wecp.progressive.service;


// import com.wecp.progressive.dao.AccountDAO;
// import com.wecp.progressive.entity.Accounts;

// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;

// public class AccountServiceImpl implements AccountService {

//     private static List<Accounts> accountsList = new ArrayList<>();
//     private AccountDAO accountDAO;

//     public AccountServiceImpl(AccountDAO accountDAO) {
//         this.accountDAO = accountDAO;
//     }
//     @Override
//     public List<Accounts> getAllAccounts() throws SQLException {
//         return null;
//     }

//     @Override
//     public Accounts getAccountById(int accountId) throws SQLException {
//         return null;
//     }

//     @Override
//     public int addAccount(Accounts accounts) throws SQLException {
//         return -1;
//     }

//     @Override
//     public void updateAccount(Accounts accounts) throws SQLException {

//     }

//     @Override
//     public void deleteAccount(int accountId) throws SQLException {

//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
//         return null;
//     }


//     @Override
//     public List<Accounts> getAccountsByUser(int userId) throws SQLException{
//         return null;
//     }
//     @Override
//     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
//         List<Accounts> sortedAccounts = accountsList;
//         sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
//         return sortedAccounts;
//     }

//     @Override
//     public void emptyArrayList() {
//         accountsList = new ArrayList<>();
//     }

//     @Override
//     public List<Accounts> getAllAccountsFromArrayList() {
//         return accountsList;
//     }
//     @Override
//     public List<Accounts> addAccountToArrayList(Accounts accounts) {
//         accountsList.add(accounts);
//         return accountsList;
//     }
// }

package com.wecp.progressive.service;


import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO;

    private static List<Accounts> accountsList = new ArrayList<>();
    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountDAO.getAllAccounts();
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return accountDAO.getAccountById(accountId);
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return accountDAO.addAccount(accounts);
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        accountDAO.updateAccount(accounts);
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        accountDAO.deleteAccount(accountId);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List<Accounts> sortedAccounts = accountDAO.getAllAccounts();
        if (sortedAccounts != null) {
            sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
        }
        return sortedAccounts;
    }


    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException{
        return accountDAO.getAllAccounts();
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        List<Accounts> sortedAccounts = accountsList;
        sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
        return sortedAccounts;
    }

    @Override
    public void emptyArrayList() {
        accountsList = new ArrayList<>();
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return accountsList;
    }
    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        accountsList.add(accounts);
        return accountsList;
    }
}