package com.wecp.progressive.service;


import com.wecp.progressive.entity.Customers;
import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
// The methods mentioned below have to be used for JDBC interactions with the database.
List<Customers> getAllCustomers() throws SQLException;
Customers getCustomerById(int customerId) throws SQLException;
int addCustomer(Customers customers) throws SQLException;
void updateCustomer(Customers customers) throws SQLException;
void deleteCustomer(int customerId) throws SQLException;
List<Customers> getAllCustomersSortedByName() throws SQLException;

// The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
List<Customers> getAllCustomersFromArrayList();
List<Customers> addCustomersToArrayList(Customers customers);
List<Customers> getAllCustomersSortedByNameFromArrayList();
void emptyArrayList();
}