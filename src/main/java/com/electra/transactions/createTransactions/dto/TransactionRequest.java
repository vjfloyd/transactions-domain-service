package com.electra.transactions.createTransactions.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRequest(String transactionType, String destinationAccount, String originAccount,
                                 BigDecimal amount) {
}
