package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Card;
import com.demo.springsecurity.model.Customer;
import com.demo.springsecurity.repository.CardRepository;
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
public class CardsController {
    private final CardRepository cardRepository;
    private final CustomerService customerService;

    @GetMapping("/myCards")
    public List<Card> getCardDetails(@RequestParam String email) throws Exception {
        Customer customer = customerService.findByEmail(email);
        return cardRepository.findByCustomerId(customer.getId());
    }
}
