package com.movietheater.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int roleId;
    private  String roleName;

    @OneToMany(mappedBy = "roles", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Account> accounts = new HashSet<>();

}
