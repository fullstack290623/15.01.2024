package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {

    private final LocalDateTime trxTime; // final = const
    private float moneyTransfer;

    public LocalDateTime getTrxTime() {
        return trxTime;
    }

    public Transaction(float moneyTransfer) {
        trxTime = LocalDateTime.now();
        this.moneyTransfer = moneyTransfer;

        // A -> B
        // A-- B++
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trxTime=" + trxTime +
                ", moneyTransfer=" + moneyTransfer +
                '}';
    }
}
