package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.AccountTransaction;
import com.demo.springsecurity.model.Customer;
import com.demo.springsecurity.repository.AccountTransactionRepository;
import com.demo.springsecurity.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(
        allowedHeaders = {"*"},
        origins = {"*"})
public class BalanceController {
    private final AccountTransactionRepository accountTransactionRepository;
    private final CustomerService customerService;

    @GetMapping("/myBalance")
    public List<AccountTransaction> getBalanceDetails(@RequestParam String email) throws Exception {
        Customer customer = customerService.findByEmail(email);
        return accountTransactionRepository
                .findAccountTransactionByCustomerIdOrderByTransactionDateDesc(customer.getId());
    }
}
