// package com.wecp.progressive.repository;

// import javax.transaction.Transaction;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.wecp.progressive.entity.Transactions;


// @Repository
// public interface TransactionRepository extends JpaRepository<Transactions,Integer>{
    
// }

package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

    List<Transactions> findByAccountsAccountId(int accountId);
}
