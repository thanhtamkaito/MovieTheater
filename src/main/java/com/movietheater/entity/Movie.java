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
public class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true)
    private  String movieId;
    private String actor;
    private  String content;
    private String directtor;
    private  int duration;
    private  LocalDate fromDate;
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


    public Movie(String actor, String content
            , String directtor, int duration, LocalDate fromDate
            , String movieProductionCompany, LocalDate toDate
            , String version, String movieNamEnglish, String movieNameVN
            , String lageImage, String smallImage) {
        this.actor = actor;
        this.content = content;
        this.directtor = directtor;
        this.duration = duration;
        this.fromDate = fromDate;
        this.movieProductionCompany = movieProductionCompany;
        this.toDate = toDate;
        this.version = version;
        this.movieNamEnglish = movieNamEnglish;
        this.movieNameVN = movieNameVN;
        this.lageImage = lageImage;
        this.smallImage = smallImage;
    }
}
