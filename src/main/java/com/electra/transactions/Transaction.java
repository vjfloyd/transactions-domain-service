package com.electra.transactions;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transaction(String transactionType, String transactionStatus,
                          BigDecimal value, LocalDateTime localDateTime ) {
}
