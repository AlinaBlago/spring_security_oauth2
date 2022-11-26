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
@Table(name = "loan", schema = "eazybank")
public class Loan extends GenericEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "loanid")
    private UUID loanId;

    @Column(name = "customerid")
    private UUID customerId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "loantype")
    private String loanType;

    @Column(name = "totalloan")
    private Integer totalLoan;

    @Column(name = "amountpaid")
    private Integer amountPaid;

    @Column(name = "outstandingamount")
    private Integer outstandingAmount;
}
