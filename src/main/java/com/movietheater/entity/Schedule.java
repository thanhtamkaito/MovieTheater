package com.movietheater.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int scheduleId;
    private String scheduleTime;


    @ManyToMany
    @JoinTable( name = "movie_shedule"
    , joinColumns = @JoinColumn( name = "movie_id")
    ,inverseJoinColumns = @JoinColumn( name = "schedule_id"))
    private Set<Movie> movies = new HashSet<>();

    @OneToMany(mappedBy = "schedule")
    private  Set<ScheduleSeat> scheduleSeats =new HashSet<>();

}
