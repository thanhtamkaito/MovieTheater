package com.movietheater.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int seatId;
    private  String seatColumn;
    private  int seatRow;
    private int seatStatus;
    private int seatType;

    @ManyToOne
    @JoinColumn(name = "cinemaRoom_id")
    private CinemaRoom cinemaRoom;

    @OneToMany(mappedBy = "seat")
    private Set<ScheduleSeat> scheduleSeats =new HashSet<>();




}
