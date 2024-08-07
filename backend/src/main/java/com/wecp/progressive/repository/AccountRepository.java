package com.wecp.progressive.repository;


import com.wecp.progressive.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    List<Accounts> getAccountsByCustomerCustomerId(int customerId);
    List<Accounts> getAccountsByCustomerName(String name);
    Accounts findByAccountId(int accountId);
}
