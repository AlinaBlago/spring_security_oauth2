package com.demo.springsecurity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "account", schema = "eazybank")
public class Account extends GenericEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "accountid")
    private UUID accountId;

    @Column(name = "customerid")
    private UUID customerId;

    @Column(name = "accounttype")
    private String accountType;

    @Column(name = "branchaddress")
    private String branchAddress;
}
