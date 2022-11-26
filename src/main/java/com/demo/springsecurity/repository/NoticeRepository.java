package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Notice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, UUID> {
}
