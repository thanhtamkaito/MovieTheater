package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String accountId;
    @NotNull
    private String userName;
    private String address;
    private LocalDate LocalDateOfBirth;
    private  String email;
    private String fullName;
    private String gender;
    private  String identityCard;
    private String image;
    private String password;
    private  String phone;
    private LocalDate registerLocalDate;
    private String status;

    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
    @JsonIgnoreProperties("account")
    private Set<Invoice> invoices = new HashSet<>();

    @OneToOne(mappedBy = "account")
    private Member member;

    @OneToOne(mappedBy = "account", fetch = FetchType.EAGER)
    private  Employee employee;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @JsonIgnoreProperties("accounts")
    private Roles roles;







}
