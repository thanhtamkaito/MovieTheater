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
    @JsonIgnoreProperties("")
    private CinemaRoom cinemaRoom;

    @OneToMany(mappedBy = "seat")
    @JsonIgnoreProperties("seat")
    private Set<ScheduleSeat> scheduleSeats =new HashSet<>();




}
