package com.electra.transactions.createTransactions;

import com.electra.transactions.createTransactions.constants.TransactionStatus;
import com.electra.transactions.createTransactions.dto.TransactionRequest;
import com.electra.transactions.createTransactions.dto.TransactionResponse;
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
        return TransactionResponse.builder()
                .transactionId(transactionId)
                .transactionStatus(TransactionStatus.ACCEPTED.getStatus())
                .build();
    }
}
