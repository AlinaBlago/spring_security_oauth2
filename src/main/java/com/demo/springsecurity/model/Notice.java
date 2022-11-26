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
@Table(name = "noticedetail", schema = "eazybank")
public class Notice extends GenericEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "noticeid")
    private UUID noticeId;

    @Column(name = "noticesummary")
    private String noticeSummary;

    @Column(name = "noticedetails")
    private String noticeDetails;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "noticebegdate")
    private Date noticeBeginDate;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "noticeenddate")
    private Date noticeEndDate;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "updatedate")
    private Date updateDate;
}
