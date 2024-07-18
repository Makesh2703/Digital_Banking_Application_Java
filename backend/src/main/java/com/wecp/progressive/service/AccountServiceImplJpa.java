package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

@Service
public class AccountServiceImplJpa implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
        return accountRepository.findAll();
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
        return accountRepository.getAccountByUser(userId);
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
        accountRepository.save(accounts);
        return accounts.getAccountId();
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
        accountRepository.save(accounts);
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
        accountRepository.deleteById(accountId);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
        return accountRepository.getAllAccountsSortedByBalance();
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
        return null;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
       return null;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
        
    }
    
}