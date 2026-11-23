package com.revature.project1.repository.entity;

import jakarta.persistence.*;

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    // possible types are WITHDRAWAL, DEPOSIT, and TRANSFER
    @Column(name = "type", nullable = false, length = 10)
    private String type;

    @Column(name = "amount", nullable = false)
    private Long amount;

    @Column(name = "user_id", nullable = false)
    private Long userId ;

    @Column(name = "time_stamp", nullable = false, length = 100)
    private String timeStamp;

    // Constructors
    public Transaction(){

    }

    public Transaction(Long accountNumber, String type, Long amount, Long userId, String timeStamp) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.userId = userId;
        this.timeStamp = timeStamp;
    }

    // Getters and Setters
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
