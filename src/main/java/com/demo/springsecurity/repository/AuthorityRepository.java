package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Authority;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AuthorityRepository extends CrudRepository<Authority, UUID> {
}
