
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

}
