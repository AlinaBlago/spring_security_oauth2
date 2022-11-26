package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LoanRepository extends CrudRepository<Loan, UUID> {

    //@PreAuthorize("hasAuthority('VIEWLOANS')")
    List<Loan> findByCustomerIdOrderByStartDateDesc(UUID customerId);
}
