package com.demo.springsecurity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "accounttransaction", schema = "eazybank")
public class AccountTransaction extends GenericEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "transactionid")
    private UUID transactionId;

    @Column(name = "accountid")
    private UUID accountId;

    @Column(name = "customerid")
    private UUID customerId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transactiondate")
    private Date transactionDate;

    @Column(name = "transactionsummary")
    private String transactionSummary;

    @Column(name = "transactiontype")
    private String transactionType;

    @Column(name = "transactionamt")
    private Integer transactionAmount;

    @Column(name = "closingbalance")
    private Integer closingBalance;
}
