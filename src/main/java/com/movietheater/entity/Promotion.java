package com.movietheater.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Promotion {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  int promotionId;
    private String detail;
    private  int discountLevel;
    private LocalDate endTime;
    private String image;
    private LocalDate startTime;
    private String title;

}
