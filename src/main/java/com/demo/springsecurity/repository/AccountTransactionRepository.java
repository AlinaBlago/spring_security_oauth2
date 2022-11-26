package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.AccountTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AccountTransactionRepository extends CrudRepository<AccountTransaction, UUID> {
    List<AccountTransaction> findAccountTransactionByCustomerIdOrderByTransactionDateDesc(UUID customerId);
}
