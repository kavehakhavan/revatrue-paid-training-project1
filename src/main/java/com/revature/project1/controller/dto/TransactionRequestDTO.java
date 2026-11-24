
package com.revature.project1.controller.dto;

import java.math.BigDecimal;

public class TransactionRequestDTO {

    private String accountNumber;
    private String transactionType;
    private BigDecimal amount;

    public TransactionRequestDTO() {
    }

    public TransactionRequestDTO(String accountNumber,
                                 String transactionType,
                                 BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
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
}
