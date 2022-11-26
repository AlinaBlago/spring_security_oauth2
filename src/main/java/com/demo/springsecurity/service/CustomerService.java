package com.demo.springsecurity.service;

import com.demo.springsecurity.model.Customer;
import com.demo.springsecurity.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer findByEmail(String email) throws Exception {
        List<Customer> customers = customerRepository.findCustomerByEmail(email);

        if (customers == null || customers.isEmpty()) {
            log.atError();
            throw new Exception("No customer found by the email: " + email);
        }

        return customers.stream().findFirst().get();
    }
}
