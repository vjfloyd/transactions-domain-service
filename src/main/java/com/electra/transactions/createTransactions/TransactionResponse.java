package com.electra.transactions.createTransactions;


import lombok.Builder;

@Builder
public record TransactionResponse(String transactionId, String transactionStatus) {
}
