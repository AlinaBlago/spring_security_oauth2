package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Customer;
import com.demo.springsecurity.model.Loan;
import com.demo.springsecurity.repository.LoanRepository;
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
public class LoansController {
    private final LoanRepository loanRepository;
    private final CustomerService customerService;

    @GetMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestParam String email) throws Exception {
        Customer customer = customerService.findByEmail(email);
        return loanRepository.findByCustomerIdOrderByStartDateDesc(customer.getId());
    }
}
