package com.movietheater.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
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
