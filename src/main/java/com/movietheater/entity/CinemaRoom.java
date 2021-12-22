package com.movietheater.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class CinemaRoom {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int cinemaRoomId;
    private String cinemaRoomName;
    private int seatQuantity;


    @OneToMany(mappedBy = "cinemaRoom", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("cinemaRoom")
    private Set<Seat> seats = new HashSet<>();


    @OneToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private  Ticket ticket;

    @OneToMany( mappedBy = "cinemaRoom",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("cinemaRoom")
    private Set<Movie> movies = new HashSet<>();

}
