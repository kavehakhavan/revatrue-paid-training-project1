
package com.revature.project1.controller.dto;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public class AccountRequestDTO {

    private Long accountId;

    @NotBlank(message = "Account number is required")
    private Long accountNumber;

    @NotBlank(message = "Balance is required")
    private BigDecimal balance;

    // Constructors
    public AccountRequestDTO() {
    }

    public AccountRequestDTO(Long accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountRequestDTO(Long accountId, Long accountNumber, BigDecimal balance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
