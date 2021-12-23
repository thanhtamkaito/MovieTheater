package com.movietheater.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponInvoiceDTO {

    private LocalDate bookingDate;
    private int addScore;
    private  int userScore;
    private String movieNamEnglish;
    private String movieNameVN;

}
