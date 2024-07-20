# Digital_Banking_Application_Java

The Banking industry is seeing a paradigm shift towards digitalization, aiming to enhance user experience, security and efficiency Amidst this trend, BankSafe, a newly-established community bank, seeks to distinguish itself by offering cutting-edge online banking services.



The management of BankSafe recognizes the importance of modernizing its banking operations. The bank's vision is to create an integrated digital platform that can facilitate various banking activities such as account management, transactions, loans, credit card management, and more, while maintaining a high standard of security and user-friendliness.
The goal of this progressive project is to build a comprehensive online banking system for BankSafe with features that cater to both regular customers and administrative staff.
## NOTE: Please refrain from submitting the project during the ongoing project development phase. The submission should only be completed after all tasks have been successfully accomplished, and this should take place on MS3 Day 26.*

Following is a day-wise schedule for building and completing the BankSafe Project
Scenario: BankSafe, wants to transition to digital and requires a BackEnd system to manage its accounts and operations.
## MS2 Day 1:

## Task 1: Design the Entity model template for Customers, Accounts, and Transactions and connect with the following database:

CREATE TABLE customers (
customer_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
username VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL,
role VARCHAR(255)
);

*NOTE: The role column in the customer table is to be kept null till it is otherwise instructed in the later stages of this project.*

CREATE TABLE accounts (
account_id INT AUTO_INCREMENT PRIMARY KEY,
customer_id INT NOT NULL,
balance DECIMAL(10, 2) NOT NULL
);

CREATE TABLE transactions (
transaction_id INT AUTO_INCREMENT PRIMARY KEY,
account_id INT NOT NULL,
amount DECIMAL(10, 2) NOT NULL,
transaction_date TIMESTAMP NOT NULL,
transaction_type VARCHAR(255) NOT NULL
);

## Task 2:
You need to complete the implementation of the following classes:

Accounts.java
Customers.java
Transactions.java
DatabaseConnectionManager.java

Note: Don't hardcode the values in DatabaseConnectionManager.java file. Read it dynamically from application.properties file

## Task 3: Build a layered architecture such as Client, Service, DAO, etc. Implement interfaces for DAO, DAO Impl, Service, Service Impl.

## MS2 Day 2:

Task 1: Use Java Collection ArrayList to store sample customer and account data.
Task 2: Display customer and account data using Comparable and Comparator.
You need to implement Comparable and Comparator in Account.java and Customer.java

## MS2 Day 3:
Task 1: pply exception handling using try-catch-finally and throw/throws. Start JDBC integration for persistent data storage.
Task 2: Develop the DAO layer for interaction with the database.

You need to complete the implementation of the following classes:

AccountDAOImpl.java
CustomerDAOImpl.java
TransactionDAOImpl.java

Scenario: BankSafe wants to introduce loans and credit card functionalities and requires a web portal for customer interactions.

## MS2 Day 4:

Task: Set up a SpringBoot project. Test with the "Welcome to BankSafe Online!" message.

## MS2 Day 5:

Task: Construct Controller and Service layers. Store Customer and Account data in an ArrayList.

Display data as JSON using a REST API and Test it.

You need to complete the implementation of the following classes, ensuring adherence to the specified API endpoints as listed below :

1: CustomerController.java

getAllCustomers - GET /customers
getCustomerById - GET /customers/{customerID}
addCustomer - POST /customers
updateCustomer - PUT /customers/{customerID}
deleteCustomer - DELETE /customers/{customerID}
getAllCustomersFromArrayList - GET /customers/fromArrayList
addCustomersToArrayList - POST /customers/toArrayList
getAllCustomersSortedByNameFromArrayList - GET /customers/fromArrayList/{customerId}

2: CustomerServiceJpaImpl.java
3: AccountServiceImplJpa.java

## MS2 Day 6:
Task: Replace ArrayList data storage with a MySQL database. Use Spring Boot JPA for CRUD operations.

Complete the CustomerController.java Controller for CRUD Operations.
You need to complete the CustomerServiceJpaImpl.java
CustomerController.java
 
## MS2 Day 7:

Task: Shift CRUD operations to SpringDataJPA.
You need to update the Entities (Customer, Account, and Transactions) to have associations and update the repository package for each Entity.

You need to complete the implementation of the following classes:
CustomerServiceImplJpa.java
CustomerRepository

Your code should meet the following functional requirements:

Proper associations between Accounts and Transactions should be built.
Accounts and Transactions Entity should be updated (during Spring Data JPA inclusion) to have these One-to-Many/Many-to-one Associations between Accounts and Transactions.
Every Transaction (Credit/Debit) should be accounted with the corresponding Account, and the Balance should be adjusted accordingly.
 

## MS2 Day 8:

Task: Shift CRUD operations to SpringDataJPA.

You need to complete the implementation of the following classes, ensuring adherence to the specified API endpoints as listed below :

AccountServiceImplJpa
AccountController
getAllAccounts - GET /accounts
getAccountById - GET /accounts/{accountId}
getAccountsByUser - GET /accounts/user/{customerId}
addAccount - POST /accounts
updateAccount - PUT /accounts/{accountId}
deleteAccount - DELETE /accounts/{accountId}

TransactionServiceImplJpa
TransactionController
getAllTransactions - GET /transactions
getTransactionById - GET /transactions/{transactionId}
addTransaction - POST /transactions
updateTransaction - PUT /transactions/{transactionId}
deleteTransaction - DELETE /transactions/{transactionId}
getAllTransactionsByCustomerId - GET /transactions/customer{customerId}

## MS2 Day 9:

Task: Add the following custom exceptions to Service layer:

`AccountNotFoundException`: This exception is raised when an admin attempts to retrieve transaction details for a customer using an Account ID that is not associated with any account.
`WithdrawalLimitException`: This exception is triggered when a customer tries to make a debit transaction for an amount exceeding 30,000 in a single transaction.
`OutOfBalanceException`: This exception is raised when a debit transaction is initiated for an amount greater than the current account balance.
`CustomerAlreadyExistsException`: This exception occurs when a user tries to create a customer with a name and email that are already associated with an existing customer ID.


You need to complete the implementation of the following classes:
AccountNotFoundException.java
WithdrawalLimitException.java
OutOfBalanceException.java
CustomerAlreadyExistsException.java

You can raise these exceptions as required in the following ServiceImpl classes

AccountServiceJpaImpl  
CustomerServiceJpaImpl.java.
TransactionServiceJpaImpl
 
## MS2 Day 10:
Task: Implement CRUD for Loan using SpringDataJPA. Incorporate exception handling.

You need to complete the implementation of the following classes, ensuring adherence to the specified API endpoints as listed below :
Loan.java
LoanService
LoanController
getAllLoans - GET /loans
getLoanById - GET /loans/{id}
createLoan - POST /loans
updateLoan - PUT /loans/{id}
deleteLoan - DELETE /loans/{id}
 

## MS2 Day 11:

Task: Implement CRUD CreditCard entities using SpringDataJPA. Incorporate exception handling.

You need to complete the implementation of the following classes, ensuring adherence to the specified API endpoints as listed below :
CreditCard.java
CreditCardService
CreditCardController
getAllCreditCards - GET /credit-cards
getCreditCardById - GET /credit-cards/{id}
createCreditCard - POST /credit-cards
updateCreditCard - PUT /credit-cards/{id}
deleteCreditCard - DELETE /credit-cards/{id}
 
## MS2 Day 12:

Scenario: For enhanced security and user experience, BankSafe wants registration/logins and wants to secure its APIs.

Task 1: Update customer service such that any user can have one role either it should be "USER" or "ADMIN". The role can no longer be null for any user while performing the add, delete, and update operations for them.  
You need to implement the following classes:

1: CustomerService
2. CustomerRepository

Task 2: Implement Secure token functionalities

You need to implement the following classes:

JwtUtil
JwtRequestFilter

## MS3 Day 13:
Task 1: Implement User Registration and Login functionalities
You need to implement the following classes, ensuring adherence to the specified API endpoints as listed below :

CustomerLoginController
registerUser - POST /customer/register
loginUser - POST /customer/login
CustomerLoginService

Task 2: Secure all api. All endpoints should be allowed to only "ADMIN or USER" authority roles.
You need to implement the following classes:

SecurityConfig.java (Remove the existing methods)
Configurations.java

A person with the role “USER” must be able to perform the following tasks:

Ability to check balance and perform transactions on account associated with that customer Id
Ability to update the account details like username or password.
Ability to view a list of transactions done on that account.

A person with the role “ADMIN” must be able to perform the following tasks:

Ability to create a new customer account.
Ability to modify account id for a customer
Ability to get details of all transactions of any customer with their customer ID/ Account ID
Ability to delete an account or customer.
Ability to update customer id.

## MS3 Day 14 and Day 15:
Scenario: BankSafe wants a modern FrontEnd and a mobile-friendly interface for its digital banking platform.
Task: Apply Frontend validation for registration and login pages using JavaScript.

The validation rules should include checks for the following cases:

Username should not contain special characters.
Password should be at least 8 digits and must contain at least one capital letter and one numeric.
The fields in the registration form are all mandatory fields and do not accept empty inputs.
The email entered should be a valid email address.
Implement the following files:

./frontend/day_14_15/login.html
./frontend/day_14_15/registaration.html
./frontend/day_14_15/js/validation.js

NOTE to Learners: Create separate JavaScript files to do the above validations.*

## MS3 Day 16:

Task: Use TypeScript to design classes for Customers, Accounts, and Transactions. Console the attributes of customer, account, and transaction tables as key-value pairs.

Implement the following files:

src/app/types/Account.ts
src/app/types/Customer.ts
src/app/types/Transaction.ts

## MS3 Day 17:

Task: Create Angular components for Customers and Accounts. Bind sample data to customer and account classes.

Implement the following files:

./frontend/src/app/bank/components/accountsample/accountsample.component.ts
/frontend/src/app/bank/components/accountsample/accountsample.component.html
./frontend/src/app/bank/components/customersample/customersample.component.ts
./frontend/src/app/bank/components/customersample/customersample.component.html
 
## MS3 Day 18:

Task: Implement two-way data binding and event binding for Customers using angular forms.

Implement the following files:
src/app/bank/components/customer/customer.component.html
src/app/bank/components/customer/customer.component.ts

## MS3 Day 19:

Task: Add customer data using JSON Array. Showcase Customer data using *ngFor and *ngIf directives in Angular.

Implement the following files:

./frontend/src/app/bank/components/customerarray/customerarray.component.html
./frontend/src/app/bank/components/customerarray/customerarray.component.ts

## MS3 Day 20:

Task: Create Angular components for Transactions and Accounts. Implement two-way data binding and event binding in Angular Forms.

Implement the following files:

src/app/bank/components/transaction/transaction.component.ts
src/app/bank/components/transaction/transaction.component.html
src/app/bank/components/account/account.component.html
src/app/bank/components/account/account.component.ts
 

## MS3 Day 21:
Task 1: Apply Frontend form functionalities and validation for registration and login forms.
The validation rules should include checks for the following cases:

Username should not contain special characters.
Password should be at least 8 digits and must contain at least one capital letter and one numeric.
The fields in the registration form are all mandatory fields and do not accept empty inputs.
The email entered should be a valid email address.

Task 2: Continue form functionalities and validations for Customer, Accounts forms.

The following validations must be added:

Account id cannot be null.
Amount has to be non-negative.
Customer name must not contain any special characters.
There should be proper validation that the email is a proper email address.

Note: The error messages from the Backend should be properly propagated and displayed in UI.

Implement the following files:

./src/app/bank/components/account/account.component.html
./src/app/bank/components/account/account.component.ts
src/app/bank/components/customer/customer.component.ts
src/app/bank/components/customer/customer.component.html

## MS 3 Day 22

Scenario: For a seamless user journey, BankSafe wants routing, forms, integration with Backend services, and style enhancements.
Note: Edit the following files to establish ManyToOne relationships between the entities -

/src/app/bank/types/Account.ts
/src/app/bank/types/Transaction.ts
/src/app/bank/types/Customer.ts

Task 1: Apply routing in Angular. Design forms to capture user data.

Implement the following files:

./src/app/bank/bank-routing.module.ts
./src/app/auth/auth-routing.module.ts
./src/app/auth/components/login/login.component.html
./src/app/auth/components/logout/logout.component.ts
./src/app/auth/components/user/user.component.ts
./src/app/auth/components/login/login.component.ts
./src/app/auth/components/logout/logout.component.css
./src/app/auth/components/user/user.component.css
./src/app/auth/components/login/login.component.css
./src/app/auth/components/logout/logout.component.html
./src/app/auth/components/user/user.component.html

Task 2: Use Angular services and HTTP client to fetch data from the SpringBoot application. Implement login workflow for admin and user roles.

Implement the following files:

./src/app/auth/services/auth.service.ts
./src/app/auth/auth.module.ts
./src/app/auth/auth.component.ts
./src/app/auth/auth.component.css
./src/app/auth/auth.component.html
./src/app/auth/components/login/login.component.html
./src/app/auth/components/logout/logout.component.ts
./src/app/auth/components/user/user.component.ts
./src/app/auth/components/login/login.component.ts
./src/app/auth/components/logout/logout.component.css
./src/app/auth/components/user/user.component.css
./src/app/auth/components/login/login.component.css
./src/app/auth/components/logout/logout.component.html
./src/app/auth/components/user/user.component.html
 
## MS 3 Day 23:

Task: Use Angular services and HTTP client to fetch data from the SpringBoot application.
Create dashboard components that list down customers, accounts, and transactions as html tables.
If a User logs in as administrator, display a nav bar on top where he can browse through Transaction, Account, and Customer forms. Implement bank services so that he can create transactions, accounts, and customers using these forms.

Implement the following files:

src/app/auth/services/auth.service.ts
./src/app/auth.interceptors.ts
./src/app/app.component.ts
./src/app/navbar/navbar.component.ts
./src/app/navbar/navbar.component.css
./src/app/navbar/navbar.component.html
./src/app/auth/components/logout/logout.component.ts
./src/app/auth/components/user/user.component.ts
./src/app/auth/components/login/login.component.ts
./src/app/auth/components/logout/logout.component.css
./src/app/auth/components/user/user.component.css
./src/app/auth/components/login/login.component.css
./src/app/auth/components/logout/logout.component.html
./src/app/auth/components/user/user.component.html
./src/app/auth/components/login/login.component.html
./src/app/auth/auth-routing.module.ts
./src/app/auth/auth.module.ts
./src/app/auth/bank-routing.module.ts

## MS 3 Day 24:

Task: Create a customer dashboard displaying the following customer-related info:

Account details related to customer
Transaction history for the customer account
Ability to perform a transaction(credit/debit)

Complete the implementation in the file below:

src/app/bank/components/dashboard/dashboard.component.ts
src/app/bank/components/dashboard/dashboard.component.html

## MS 3 Day 25:

Task 1: Create an admin dashboard and add functionality to perform the following tasks:
Ability to add/update/delete customers.
Ability to add/update/delete accounts.
Ability to view all transactions/customers/accounts.
Make sure edit and delete buttons are only visible to user type Admin.

Complete the implementation in the file below:

src/app/bank/components/dashboard/dashboard.component.ts
src/app/bank/services/bank.service.ts
src/app/bank/components/accountedit/accountedit.component.ts
src/app/bank/components/customer/accountedit.component.html
src/app/bank/components/customer/accountedit.component.css
src/app/bank/components/customeredit/customeredit.component.ts
src/app/bank/components/customeredit/customeredit.component.html
src/app/bank/components/customeredit/customeredit.component.css


## MS 3 Day 26:

Task: Enhancement in UI design using the Bootstrap. Apply Bootstrap for responsive design and style enhancement.

Note: You are directed to craft well-designed web pages incorporating responsive design by utilizing Bootstrap. The page should be clean and professional while maintaining all the UI and UX needed to complete all the given tasks.

Testing & Submitting your code:
Step 1: Click on the WeCP Projects Button shown below:
Step 2: Click on Test & Submit app button to test your code. You will receive a congratulations message upon successful completion of the task.
Step 3: Click on Run FrontEnd server to start the angular server
Step 4: Click on Run BackEnd server to start the SpringBoot server
Step 5: Click on Open MySQL bash session to query the database
Step 6: Click on Initialize GitHub to get the key for connecting with GitHub
Step 7: Click on Show testing URL to get the URL for testing using ThunderClient.


 


