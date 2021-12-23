package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {
    @Id
    private  String movieId;
    private String actor;
    private  String content;
    private String directtor;
    private  int duration;
    private  Date fromDate;
    private String movieProductionCompany;
    private LocalDate toDate;
    private  String version;
    private String movieNamEnglish;
    private String movieNameVN;
    private  String lageImage;
    private String smallImage;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_date"
    ,joinColumns = @JoinColumn(name = "movie_id")
    ,inverseJoinColumns = @JoinColumn(name = "showDate_id"))
    @JsonIgnoreProperties("movies")
    private Set<ShowDate> showDates = new HashSet<>();


    @ManyToMany(mappedBy = "movies", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("movies")
    private  Set<Type> types = new HashSet<>();

    @ManyToMany(mappedBy = "movies", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("moviess")
    private  Set<Schedule> schedules = new HashSet<>();

    @OneToMany(mappedBy = "movie")
    @JsonIgnoreProperties("movie")
    private  Set<ScheduleSeat> scheduleSeats =new HashSet<>();


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnoreProperties("movies")
    @JoinColumn( name = "cinemaRoom_id")
    private  CinemaRoom cinemaRoom;


}
