package com.revature.project1.controller.dto;

import java.util.ArrayList;
import java.util.List;

public class AccountOwnerResponseDTO {

    private Long ownerRecordId;
    private Long accountId;
    private Long userId;

    // Constructors
    public AccountOwnerResponseDTO() {
    }

    public AccountOwnerResponseDTO(Long ownerRecordId, Long accountId, Long userId) {
        this.ownerRecordId = ownerRecordId;
        this.accountId = accountId;
        this.userId = userId;
    }

    // Getters and Setters
    public Long getOwnerRecordId() {
        return ownerRecordId;
    }

    public void setOwnerRecordId(Long ownerRecordId) {
        this.ownerRecordId = ownerRecordId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
