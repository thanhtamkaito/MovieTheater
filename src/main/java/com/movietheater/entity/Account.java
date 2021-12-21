package com.movietheater.entity;


import com.sun.istack.NotNull;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
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
    private Date dateOfBirth;
    private  String email;
    private String fullName;
    private String gender;
    private  String identityCard;
    private String image;
    private String password;
    private  String phone;
    private Date registerDate;
    private String status;

    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
    private Set<Invoice> accounts = new HashSet<>();

    @OneToOne(mappedBy = "account")
    private Member member;

    @OneToOne(mappedBy = "account", fetch = FetchType.EAGER)
    private  Employee employee;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roles;

}
