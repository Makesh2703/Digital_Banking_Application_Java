// // package com.wecp.progressive.repository;

// // import java.util.List;

// // import org.springframework.data.jpa.repository.JpaRepository;
// // import org.springframework.data.jpa.repository.Query;
// // import org.springframework.stereotype.Repository;

// // import com.wecp.progressive.entity.Customers;


// // public interface CustomerRepository {

// //     // @Query("select c from Customers c where c.customerId =:customerId")
// //     // Customers getCustomerById(Integer customerId);

// //     // @Query("select c from Customers c where c.name =:name ORDER BY c.name ASC")
// //     // public List<Customers> getAllCustomersSortedByName();


// // }


// package com.wecp.progressive.repository;

// import com.wecp.progressive.entity.Customers;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.query.Param;
// import org.springframework.stereotype.Repository;

// import java.util.List;

// @Repository
// public interface CustomerRepository extends JpaRepository<Customers, Integer> {

//     Customers findByCustomerId(@Param("customerId") int customerId);

//     void deleteByCustomerId(@Param("customerId") int customerId);
// }


package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

    Customers findByCustomerId(@Param("customerId") int customerId);

    void deleteByCustomerId(@Param("customerId") int customerId);
    Customers findByNameAndEmail(@Param("name") String name, @Param("email") String email);
}
