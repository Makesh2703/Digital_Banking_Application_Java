package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer>{

    @Query("select a from Accounts a where a.userId =:userId")
    List<Accounts> getAccountByUser(int userId);

    @Query("select a from Accounts a where a.balance =:balance oder by a.balance asc")
    List<Accounts> getAllAccountsSortedByBalance();
    
}
