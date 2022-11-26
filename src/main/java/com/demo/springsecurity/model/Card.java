package com.demo.springsecurity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "card", schema = "eazybank")
public class Card extends GenericEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "cardid")
    private UUID cardId;

    @Column(name = "cardnumber")
    private String cardNumber;

    @Column(name = "customerid")
    private UUID customerId;

    @Column(name = "cardtype")
    private String cardType;

    @Column(name = "totallimit")
    private Integer totalLimit;

    @Column(name = "amountused")
    private Integer amountUsed;

    @Column(name = "availableamount")
    private Integer availableAmount;
}
