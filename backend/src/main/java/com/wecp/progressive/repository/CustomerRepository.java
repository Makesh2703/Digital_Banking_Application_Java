package com.wecp.progressive.repository;
 
import com.wecp.progressive.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
 
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
 
    Customers findByCustomerId(@Param("customerId") int customerId);
 
    void deleteByCustomerId(@Param("customerId") int customerId);
 
    Customers findByNameAndEmail(@Param("name") String name, @Param("email") String email);
    Customers findByUsername(String username);
}
 