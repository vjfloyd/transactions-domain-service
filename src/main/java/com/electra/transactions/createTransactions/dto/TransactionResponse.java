package com.electra.transactions.createTransactions.dto;


import lombok.Builder;

@Builder
public record TransactionResponse(String transactionId, String transactionStatus) {
}
