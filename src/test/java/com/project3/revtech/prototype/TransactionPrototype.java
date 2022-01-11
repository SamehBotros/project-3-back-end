package com.project3.revtech.prototype;

import com.project3.revtech.entity.Transaction;
import com.project3.revtech.pojo.TransactionPojo;

import java.sql.Timestamp;

public class TransactionPrototype {
    public static Transaction transactionTestObj() {
        Transaction newTransaction = new Transaction(1, new Timestamp(System.currentTimeMillis()), 1);
        return newTransaction;
    }

    public static TransactionPojo transactionPojoTestObj(Transaction testEntity) {
        TransactionPojo newTransactionPojo = new TransactionPojo(testEntity.getTransactionId(), testEntity.getTransactionDate(), testEntity.getCartId());
        return newTransactionPojo;
    }
}
