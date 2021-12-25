package com.movietheater.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
