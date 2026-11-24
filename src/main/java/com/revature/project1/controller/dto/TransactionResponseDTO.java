
package com.revature.project1.controller.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class TransactionResponseDTO {

    private Long transactionId;
    private String accountNumber;
    private String transactionType;
    private BigDecimal amount;
    private Long userId;
    private OffsetDateTime transactionTimestamp;

    public TransactionResponseDTO() {
    }

    public TransactionResponseDTO(Long transactionId,
                                  String accountNumber,
                                  String transactionType,
                                  BigDecimal amount,
                                  Long userId,
                                  OffsetDateTime transactionTimestamp) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.userId = userId;
        this.transactionTimestamp = transactionTimestamp;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public OffsetDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(OffsetDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}
