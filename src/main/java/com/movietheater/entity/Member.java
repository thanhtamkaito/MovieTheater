package com.movietheater.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String memberId;
    private int Score;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id",nullable = false )
    @JsonIgnoreProperties("")
    private  Account account;
}
