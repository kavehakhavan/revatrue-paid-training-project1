
package com.revature.project1.controller.dto;

import java.math.BigDecimal;

public class AccountResponseDTO {

    private Long accountId;
    private String accountNumber;
    private BigDecimal balance;

    // Constructors
    public AccountResponseDTO() {
    }

    public AccountResponseDTO(String accountNumber, BigDecimal balance, Long accountId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId = accountId;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
