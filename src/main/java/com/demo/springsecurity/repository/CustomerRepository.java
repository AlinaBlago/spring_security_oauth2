package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, UUID> {
    List<Customer> findCustomerByEmail(String email);

    Customer findByEmail(String email);
}
