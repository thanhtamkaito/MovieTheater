package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class ScheduleSeat {
    @Id

    private String scheduleSeatId;


    @ManyToOne
    @JoinColumn(name = "movie_id")
    @JsonIgnoreProperties("scheduleSeats")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    @JsonIgnoreProperties("scheduleSeats")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    @JsonIgnoreProperties("scheduleSeats")
    private Seat seat;

    @OneToOne(mappedBy = "scheduleSeat")
    private Invoice invoice;

}
