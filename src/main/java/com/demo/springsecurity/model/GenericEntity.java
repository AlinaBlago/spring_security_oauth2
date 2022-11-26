package com.demo.springsecurity.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass
public class GenericEntity {
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "entrydate")
    private Date entryDate;

    @PrePersist
    private void onSave() {
        Date dateNow = Date.from(Instant.now());
        this.entryDate = dateNow;
    }
}
