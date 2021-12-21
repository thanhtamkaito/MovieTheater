package com.movietheater.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String invoiceId;
    private int addScore;
    private Date bookingDate;
    private String movieName;
    private Date scheduleShow;
    private String scheduleShowTime;
    private  int status;
    private  int totalMoney;
    private  int userScore;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;



}
