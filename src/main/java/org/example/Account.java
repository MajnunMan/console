package org.example;

/*
* Building an MVP bank application
We will do this in multiple steps, each steps will have requirements (as if they came from product manager) that need to be implemented in code
Everything is in memory
Treat it as if you were aiming to deliver production quality code that would be submitted as PR and eventually deployed
Will code for up to 45 mins and we're aiming to complete multiple tasks over this time
*
Task 1:
Account registration
- Our bank application should allow to register a new account
- The account should contain: first and last name, phone number
- Phone number must be unique
- Additionally the system should generate a unique account number
- The account number should contain 6 digits, and be padded with 0s if needed, e.g. "000121"
- The account number should be generated sequentially, e.g. first customer should get "000001", second "000002" and so on [999999]
- [Accounts must be available to retrieve by account number]
*
*
* */
public class Account {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Account(String accountNumber, String firstName, String lastName, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // validate uniqueness
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
