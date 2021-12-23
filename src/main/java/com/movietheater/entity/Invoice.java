package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Invoice {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true)
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
    @JoinColumn( name = "schedule_seat_id")
    private  ScheduleSeat scheduleSeat;

    public Invoice(int addScore, LocalDate bookingDate, int status, int totalMoney, int userScore, Account account, ScheduleSeat scheduleSeat) {
        this.addScore = addScore;
        this.bookingDate = bookingDate;
        this.status = status;
        this.totalMoney = totalMoney;
        this.userScore = userScore;
        this.account = account;
        this.scheduleSeat = scheduleSeat;
    }
}
