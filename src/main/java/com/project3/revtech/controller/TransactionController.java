package com.project3.revtech.controller;

import java.util.List;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project3.revtech.pojo.TransactionPojo;
import com.project3.revtech.service.TransactionService;


@RestController
@RequestMapping("api/transaction")
@CrossOrigin
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@GetMapping()
	public List<TransactionPojo> getAllTransactions() {
		return transactionService.getAllTransactions();
	}
	
	@GetMapping("{tid}")
	public TransactionPojo getTransactionById(@PathVariable int transactionId) {
		return transactionService.getTransactionById(transactionId);
	}
	
	@GetMapping("cart/{cid}")
	public List<TransactionPojo> getCartTransactions(@PathVariable int cartId) {
		return transactionService.findAllTransactionsInCart(cartId);
	}
	
	@PostMapping()
	public TransactionPojo createTransaction(@Valid @RequestBody TransactionPojo transactionPojo) {
		return transactionService.createTransaction(transactionPojo);
	}
	
	@PutMapping()
	public TransactionPojo UpdateTransaction(@Valid @RequestBody TransactionPojo transactionPojo) {
		return transactionService.updateTransaction(transactionPojo);
	}
	
	@DeleteMapping("transaction")
	public TransactionPojo deleteTransaction(@Valid @RequestBody TransactionPojo tp) {
		return transactionService.deleteTransaction(tp);
	}
	
}
