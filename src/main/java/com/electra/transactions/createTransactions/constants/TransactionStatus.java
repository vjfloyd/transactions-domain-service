package com.electra.transactions.createTransactions.constants;

public enum TransactionStatus {
    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED"),
    PENDING("PENDING");

    private final String status;

    private TransactionStatus(String dayName) {
        this.status = dayName;
    }

    public String getStatus() {
        return status;
    }
}
