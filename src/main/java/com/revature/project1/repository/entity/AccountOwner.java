package com.revature.project1.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "accountOwners")
public class AccountOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recordId")
    private Long recordId;

    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    // Constructors
    public AccountOwner() {
    }

    public AccountOwner(Long accountNumber, Long userId) {
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    // Getters and Setters
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
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
