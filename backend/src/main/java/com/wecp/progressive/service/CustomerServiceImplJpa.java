// // // // // package com.wecp.progressive.service;

// // // // // import java.sql.SQLException;
// // // // // import java.util.List;

// // // // // import org.springframework.beans.factory.annotation.Autowired;
// // // // // import org.springframework.stereotype.Service;

// // // // // import com.wecp.progressive.entity.Customers;
// // // // // import com.wecp.progressive.repository.CustomerRepository;

// // // // // @Service
// // // // // public class CustomerServiceImplJpa implements CustomerService{
// // // // //     @Autowired
// // // // //     private CustomerRepository customerRepository;
    
// // // // //     //private List<Customers> customers = new List<>() {}
// // // // //     @Override
// // // // //     public List<Customers> getAllCustomers() {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
// // // // //         return customerRepository.findAll();
// // // // //     }

// // // // //     @Override
// // // // //     public Customers getCustomerById(int customerId) {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
// // // // //         return customerRepository.findById(customerId).orElse(null);
// // // // //     }

// // // // //     @Override
// // // // //     public int addCustomer(Customers customers) {
// // // // //         // TODO Auto-generated method stub
// // // // //         // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
// // // // //         customerRepository.save(customers);
// // // // //         return customers.getCustomerId();
// // // // //     }

// // // // //     @Override
// // // // //     public void updateCustomer(Customers customers){
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
// // // // //         customerRepository.save(customers);
// // // // //     }

// // // // //     @Override
// // // // //     public void deleteCustomer(int customerId) throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
// // // // //         customerRepository.deleteById(customerId);
// // // // //     }

// // // // //     @Override
// // // // //     public List<Customers> getAllCustomersSortedByName() throws SQLException {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
// // // // //         return customerRepository.getAllCustomersSortedByName();

// // // // //     }

// // // // //     @Override
// // // // //     public List<Customers> getAllCustomersFromArrayList() {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Customers> addCustomersToArrayList(Customers customers) {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
// // // // //         return null;
// // // // //     }

// // // // //     @Override
// // // // //     public void emptyArrayList() {
// // // // //         // TODO Auto-generated method stub
// // // // //         //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
        
// // // // //     }
   
// // // // // }

// // // // package com.wecp.progressive.service;


// // // // import com.wecp.progressive.entity.Customers;
// // // // import org.springframework.stereotype.Service;

// // // // import java.util.ArrayList;
// // // // import java.util.Collections;
// // // // import java.util.List;

// // // // @Service
// // // // public class CustomerServiceImplJpa implements CustomerService {

// // // //     private static List<Customers> customersList = new ArrayList<>();
// // // //     @Override
// // // //     public List<Customers> getAllCustomers() {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public Customers getCustomerById(int customerId) {
// // // //         return null;
// // // //     }

// // // //     @Override
// // // //     public int addCustomer(Customers customers) {
// // // //         return -1;
// // // //     }

// // // //     @Override
// // // //     public void updateCustomer(Customers customers) {

// // // //     }

// // // //     @Override
// // // //     public void deleteCustomer(int customerId) {

// // // //     }

// // // //     @Override
// // // //     public List<Customers> getAllCustomersSortedByName() {
// // // //         return null;
// // // //     }



// // // //     // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
// // // //     @Override
// // // //     public List<Customers> getAllCustomersFromArrayList() {
// // // //         return customersList;
// // // //     }

// // // //     @Override
// // // //     public List<Customers> addCustomersToArrayList(Customers customers) {
// // // //         customersList.add(customers);
// // // //         return customersList;
// // // //     }

// // // //     @Override
// // // //     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
// // // //         List<Customers> sortedCustomers = customersList;
// // // //         Collections.sort(sortedCustomers);
// // // //         return sortedCustomers;
// // // //     }

// // // //     @Override
// // // //     public void emptyArrayList() {
// // // //         customersList = new ArrayList<>();
// // // //     }
// // // // }


// // // package com.wecp.progressive.service;


// // // import com.wecp.progressive.entity.Customers;
// // // import org.springframework.stereotype.Service;

// // // import java.util.ArrayList;
// // // import java.util.Collections;
// // // import java.util.List;

// // // @Service
// // // public class CustomerServiceImplJpa implements CustomerService {

// // //     private static List<Customers> customersList = new ArrayList<>();
// // //     @Override
// // //     public List<Customers> getAllCustomers() {
// // //         return null;
// // //     }

// // //     @Override
// // //     public Customers getCustomerById(int customerId) {
// // //         return null;
// // //     }

// // //     @Override
// // //     public int addCustomer(Customers customers) {
// // //         return -1;
// // //     }

// // //     @Override
// // //     public void updateCustomer(Customers customers) {

// // //     }

// // //     @Override
// // //     public void deleteCustomer(int customerId) {

// // //     }

// // //     @Override
// // //     public List<Customers> getAllCustomersSortedByName() {
// // //         return null;
// // //     }



// // //     // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
// // //     @Override
// // //     public List<Customers> getAllCustomersFromArrayList() {
// // //         return customersList;
// // //     }

// // //     @Override
// // //     public List<Customers> addCustomersToArrayList(Customers customers) {
// // //         customersList.add(customers);
// // //         return customersList;
// // //     }

// // //     @Override
// // //     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
// // //         List<Customers> sortedCustomers = customersList;
// // //         Collections.sort(sortedCustomers);
// // //         return sortedCustomers;
// // //     }

// // //     @Override
// // //     public void emptyArrayList() {
// // //         customersList = new ArrayList<>();
// // //     }
// // // }


// // package com.wecp.progressive.service;


// // import com.wecp.progressive.entity.Customers;
// // import com.wecp.progressive.repository.CustomerRepository;
// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Service;
// // import org.springframework.transaction.annotation.Transactional;

// // import java.util.ArrayList;
// // import java.util.Collections;
// // import java.util.List;

// // @Service
// // public class CustomerServiceImplJpa implements CustomerService {

// //     private final CustomerRepository customerRepository;

// //     @Autowired
// //     public CustomerServiceImplJpa(CustomerRepository customerRepository) {
// //         this.customerRepository = customerRepository;
// //     }

// //     private static List<Customers> customersList = new ArrayList<>();
// //     @Override
// //     public List<Customers> getAllCustomers() {
// //         return customerRepository.findAll();
// //     }

// //     @Override
// //     public Customers getCustomerById(int customerId) {
// //         return customerRepository.findByCustomerId(customerId);
// //     }

// //     @Override
// //     public int addCustomer(Customers customers) {
// //         return customerRepository.save(customers).getCustomerId();
// //     }

// //     @Override
// //     public void updateCustomer(Customers customers) {
// //         customerRepository.save(customers);
// //     }

// //     @Override
// //     @Transactional
// //     public void deleteCustomer(int customerId) {
// //         customerRepository.deleteByCustomerId(customerId);
// //     }

// //     @Override
// //     public List<Customers> getAllCustomersSortedByName() {
// //         List<Customers> sortedCustomers = customerRepository.findAll();
// //         Collections.sort(sortedCustomers);
// //         return sortedCustomers;
// //     }



// //     // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
// //     @Override
// //     public List<Customers> getAllCustomersFromArrayList() {
// //         return customersList;
// //     }

// //     @Override
// //     public List<Customers> addCustomersToArrayList(Customers customers) {
// //         customersList.add(customers);
// //         return customersList;
// //     }

// //     @Override
// //     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
// //         List<Customers> sortedCustomers = customersList;
// //         Collections.sort(sortedCustomers);
// //         return sortedCustomers;
// //     }

// //     @Override
// //     public void emptyArrayList() {
// //         customersList = new ArrayList<>();
// //     }
// // }

// package com.wecp.progressive.service;


// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.repository.CustomerRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// @Service
// public class CustomerServiceImplJpa implements CustomerService {

//     private final CustomerRepository customerRepository;

//     @Autowired
//     public CustomerServiceImplJpa(CustomerRepository customerRepository) {
//         this.customerRepository = customerRepository;
//     }

//     private static List<Customers> customersList = new ArrayList<>();
//     @Override
//     public List<Customers> getAllCustomers() {
//         return customerRepository.findAll();
//     }

//     @Override
//     public Customers getCustomerById(int customerId) {
//         return customerRepository.findByCustomerId(customerId);
//     }

//     @Override
//     public int addCustomer(Customers customers) {
//         return customerRepository.save(customers).getCustomerId();
//     }

//     @Override
//     public void updateCustomer(Customers customers) {
//         customerRepository.save(customers);
//     }

//     @Override
//     @Transactional
//     @Modifying
//     public void deleteCustomer(int customerId) {
//         customerRepository.deleteByCustomerId(customerId);
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByName() {
//         List<Customers> sortedCustomers = customerRepository.findAll();
//         Collections.sort(sortedCustomers);
//         return sortedCustomers;
//     }



//     // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
//     @Override
//     public List<Customers> getAllCustomersFromArrayList() {
//         return customersList;
//     }

//     @Override
//     public List<Customers> addCustomersToArrayList(Customers customers) {
//         customersList.add(customers);
//         return customersList;
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
//         List<Customers> sortedCustomers = customersList;
//         Collections.sort(sortedCustomers);
//         return sortedCustomers;
//     }

//     @Override
//     public void emptyArrayList() {
//         customersList = new ArrayList<>();
//     }
// }

package com.wecp.progressive.service;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.exception.CustomerAlreadyExistsException;
import com.wecp.progressive.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImplJpa implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImplJpa(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private static List<Customers> customersList = new ArrayList<>();
    @Override
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customers getCustomerById(int customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    @Override
    public int addCustomer(Customers customers) {
        Customers customers1 = customerRepository.findByNameAndEmail(customers.getName(), customers.getEmail());
        if (customers1 != null) {
            throw new CustomerAlreadyExistsException("Customer already exists");
        }
        return customerRepository.save(customers).getCustomerId();
    }

    @Override
    public void updateCustomer(Customers customers) {
        customerRepository.save(customers);
    }

    @Override
    @Transactional
    @Modifying
    public void deleteCustomer(int customerId) {
        customerRepository.deleteByCustomerId(customerId);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() {
        List<Customers> sortedCustomers = customerRepository.findAll();
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }



    // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return customersList;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        customersList.add(customers);
        return customersList;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        List<Customers> sortedCustomers = customersList;
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void emptyArrayList() {
        customersList = new ArrayList<>();
    }
}

