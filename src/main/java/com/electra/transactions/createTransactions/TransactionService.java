package com.electra.transactions.createTransactions;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public TransactionResponse save(TransactionRequest transactionRequest){
        String transactionId = UUID.randomUUID().toString();
        TransactionEntity transactionEntity = TransactionEntity.builder()
                .amount(transactionRequest.amount())
                .transactionType(transactionRequest.transactionType())
                .destinationAccount(transactionRequest.destinationAccount())
                .originAccount(transactionRequest.originAccount())
                .build();
        transactionRepository.save(transactionEntity);
        return TransactionResponse.builder().transactionId(transactionId).build();
    }
}
