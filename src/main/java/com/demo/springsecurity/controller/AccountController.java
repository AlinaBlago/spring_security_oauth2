package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.Customer;
import com.demo.springsecurity.repository.AccountRepository;
import com.demo.springsecurity.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(
        allowedHeaders = {"*"},
        origins = {"*"})
public class AccountController {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam String email) throws Exception {
        Customer customer = customerService.findByEmail(email);
        return accountRepository.findAccountByCustomerId(customer.getId());
    }
}
