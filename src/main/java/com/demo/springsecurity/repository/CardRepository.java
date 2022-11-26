package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CardRepository extends CrudRepository<Card, UUID> {
    List<Card> findByCustomerId(UUID customerId);
}
