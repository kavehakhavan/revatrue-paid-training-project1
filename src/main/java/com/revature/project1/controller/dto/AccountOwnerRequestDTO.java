package com.revature.project1.controller.dto;

import jakarta.validation.constraints.*;

public class AccountOwnerRequestDTO {

    private Long ownerRecordId;

    @NotBlank(message = "Account number is required")
    private Long accountNumber;

    @NotBlank(message = "User Id is required")
    private Long userId;

    // Constructors
    public AccountOwnerRequestDTO() {
    }

    public AccountOwnerRequestDTO(Long accountNumber, Long userId) {
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    public AccountOwnerRequestDTO(Long recordId, Long accountNumber, Long userId) {
        this.ownerRecordId = recordId;
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    // Getters and Setters
    public Long getOwnerRecordId() {
        return ownerRecordId;
    }

    public void setOwnerRecordId(Long recordId) {
        this.ownerRecordId = recordId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
