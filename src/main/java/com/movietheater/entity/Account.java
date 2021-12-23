package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Account {
    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(generator = "uuid")
   @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true)
    private  String accountId;
    @NotNull
    private String userName;
    private String address;
    private LocalDate DateOfBirth;
    private  String email;
    private String fullName;
    private String gender;
    private  String identityCard;
    private String image;
    private String password;
    private  String phone;
    private LocalDate registerDate;
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


    public Account(String userName, String address, LocalDate localDateOfBirth, String email, String fullName, String gender, String identityCard, String image, String password, String phone, LocalDate registerLocalDate, String status, Roles roles) {
        this.userName = userName;
        this.address = address;
        DateOfBirth = localDateOfBirth;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.identityCard = identityCard;
        this.image = image;
        this.password = password;
        this.phone = phone;
        this.registerDate = registerLocalDate;
        this.status = status;
        this.roles = roles;
    }



}
