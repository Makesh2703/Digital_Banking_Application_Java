package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.service.CustomerLoginService;
import com.wecp.progressive.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;
    private CustomerLoginService customerLoginService;
    
    @Autowired
    public CustomerController(@Qualifier("customerServiceImplJpa") CustomerService customerService, CustomerLoginService customerLoginService) {
        this.customerService = customerService;
        this.customerLoginService = customerLoginService;
    }


    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() {
        try {
            List<Customers> customers = customerService.getAllCustomers();
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) {
        try {
            Customers customers = customerService.getCustomerById(customerId);
            if (customers != null) {
                return new ResponseEntity<>(customers, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) {
        try {
            int customerId = customerService.addCustomer(customers);
            return new ResponseEntity<>(customerId, HttpStatus.CREATED);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Void> updateCustomer(@PathVariable int customerId, @RequestBody Customers customers) {
        try {
            customers.setCustomerId(customerId);
            
            customerLoginService.updateUser(customers);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) {
        try {
            customerService.deleteCustomer(customerId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Customers>> getAllCustomersFromArrayList() {
        List<Customers> customers = customerService.getAllCustomersFromArrayList();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<List<Customers>> addCustomersToArrayList(@RequestBody Customers customers) {
        List<Customers> customersList = customerService.addCustomersToArrayList(customers);
        return new ResponseEntity<>(customersList, HttpStatus.OK);
    }

    @GetMapping("/fromArrayList/{customerId}")
    public ResponseEntity<List<Customers>> getAllCustomersSortedByNameFromArrayList() {
        List<Customers> customersList = customerService.getAllCustomersSortedByNameFromArrayList();
        return new ResponseEntity<>(customersList, HttpStatus.OK);
    }
}
