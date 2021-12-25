package com.movietheater.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int scheduleId;
    private String scheduleTime;


    @ManyToMany
    @JoinTable( name = "movie_shedule"
    , joinColumns = @JoinColumn( name = "schedule_id")
    ,inverseJoinColumns = @JoinColumn( name = "movie_id"))
    @JsonIgnoreProperties("schedules")
    private Set<Movie> movies = new HashSet<>();


    @OneToMany(mappedBy = "schedule")
    @JsonIgnoreProperties("schedule")
    private  Set<ScheduleSeat> scheduleSeats =new HashSet<>();

}
