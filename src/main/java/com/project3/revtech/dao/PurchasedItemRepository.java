package com.project3.revtech.dao;

import com.project3.revtech.entity.PurchasedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchasedItemRepository extends JpaRepository<PurchasedItem, Integer> {
    List<PurchasedItem> findAllByTransactionId(int transactionId);
    List<PurchasedItem> findAllByUserId(int userId);

}
