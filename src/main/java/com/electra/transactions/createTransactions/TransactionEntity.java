package com.electra.transactions.createTransactions;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Table(name = "transactions")
@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destinationAccount;
    private String originAccount;
    private BigDecimal amount;
    private String transactionType;


}
