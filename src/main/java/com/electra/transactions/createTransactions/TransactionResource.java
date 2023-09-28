package com.electra.transactions.createTransactions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/domain-services/v1/transactions")
public class TransactionResource {
    private TransactionService transactionService;
    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    private ResponseEntity<TransactionResponse> createTransaction(@RequestBody TransactionRequest transactionRequest){
        log.info("Create transaction");
        TransactionResponse transactionResponse = transactionService.save(transactionRequest);
        return new ResponseEntity<>(transactionResponse, HttpStatus.CREATED);
    }

}
