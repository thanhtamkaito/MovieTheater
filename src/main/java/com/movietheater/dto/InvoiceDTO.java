package com.movietheater.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.movietheater.entity.Account;
import com.movietheater.entity.ScheduleSeat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class InvoiceDTO {

    private int addScore;
    private LocalDate bookingDate;
    private  int status;
    private  int totalMoney;
    private  int userScore;
    private Account account;
    private ScheduleSeat scheduleSeat;
}
