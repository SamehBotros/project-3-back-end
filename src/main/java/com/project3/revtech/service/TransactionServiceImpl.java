package com.project3.revtech.service;



import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project3.revtech.pojo.TransactionPojo;
import com.project3.revtech.dao.TransactionRepository;
import com.project3.revtech.entity.Transaction;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<TransactionPojo> getAllTransactions() {
		
		List<Transaction> allTransactionsEntity = this.transactionRepository.findAll();
		List<TransactionPojo> allTransactionsPojo = new LinkedList<TransactionPojo>();
		
		allTransactionsEntity.forEach((transaction) -> {
			TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			allTransactionsPojo.add(transactionPojo);
		});
		return allTransactionsPojo;
	}

	@Override
	public TransactionPojo getTransactionById(int transactionId) {
		Transaction transaction = transactionRepository.getById(transactionId);
		
//		Transaction transaction = optional.get();
		TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			
		return transactionPojo;
	}

	@Override
	public List<TransactionPojo> findAllTransactionsInCart(int cartId) {
		List<Transaction> allTransactionsEntity = this.transactionRepository.findAllByCartId(cartId);
		List<TransactionPojo> allTransactionsPojo = new LinkedList<TransactionPojo>();
		
		allTransactionsEntity.forEach((transaction) -> {
			TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			allTransactionsPojo.add(transactionPojo);
		});
		return allTransactionsPojo;
	}

	@Override
	public TransactionPojo createTransaction(TransactionPojo transactionPojo) {
		Transaction transaction = new Transaction(transactionPojo.getCartId());
		System.out.println(transaction);
		Transaction createdTransaction = this.transactionRepository.saveAndFlush(transaction);
//		TransactionPojo newTransactionPojo = new TransactionPojo(created.getTransactionId(), created.getTransactionDate(), created.getCartId());
		transactionPojo.setTransactionId(createdTransaction.getTransactionId());
		transactionPojo.setTransactionDate(createdTransaction.getTransactionDate());
		transactionPojo.setCartId(createdTransaction.getCartId());

		return transactionPojo;
	}

	@Override
	public TransactionPojo deleteTransaction(TransactionPojo transactionPojo) {
		Transaction transaction = new Transaction(transactionPojo.getTransactionId(), transactionPojo.getTransactionDate(), transactionPojo.getCartId());
		this.transactionRepository.delete(transaction);
			
		return transactionPojo;
	}

	@Override
	public TransactionPojo updateTransaction(TransactionPojo transactionPojo) {
		Transaction transaction = new Transaction(transactionPojo.getTransactionId(), transactionPojo.getTransactionDate(), transactionPojo.getCartId());
		Transaction updated = this.transactionRepository.saveAndFlush(transaction);
		
		
		TransactionPojo newTransactionPojo = new TransactionPojo(updated.getTransactionId(), updated.getTransactionDate(), updated.getCartId());
			
		return transactionPojo;
	}

	
}
