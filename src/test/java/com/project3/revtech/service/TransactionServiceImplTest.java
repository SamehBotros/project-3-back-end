package com.project3.revtech.service;

import com.project3.revtech.dao.TransactionRepository;
import com.project3.revtech.entity.Transaction;
import com.project3.revtech.pojo.TransactionPojo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.project3.revtech.prototype.TransactionPrototype.transactionPojoTestObj;
import static com.project3.revtech.prototype.TransactionPrototype.transactionTestObj;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {   TransactionServiceImpl.class})
@ExtendWith(SpringExtension.class)
class TransactionServiceImplTest {

    @MockBean
    TransactionRepository transactionRepository;

    @Autowired
    TransactionServiceImpl transactionService;

    @Test
    void getTransactionById() {
        Transaction transactionEntity = transactionTestObj();
        when(transactionRepository.getById(eq(1))).thenReturn(transactionEntity);
        TransactionPojo transactionPojo = transactionService.getTransactionById(1);
        assertNotNull(transactionPojo);
        assertEquals(transactionPojoTestObj(transactionEntity).toString(), transactionPojo.toString());
    }

//    @Test
//    void createTransaction() {
//
//    }

}