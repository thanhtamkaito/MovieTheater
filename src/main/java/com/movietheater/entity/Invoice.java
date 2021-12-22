package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String invoiceId;
    private int addScore;
    private LocalDate bookingDate;
    private  int status;
    private  int totalMoney;
    private  int userScore;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    @JsonIgnoreProperties("invoices")
    private Account account;

    @OneToOne
    @JoinColumn( name = "schedule_seat")
    private  ScheduleSeat scheduleSeat;

}
