package com.movietheater.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ScheduleSeat {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true)
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

    public ScheduleSeat(Movie movie) {
        this.movie = movie;
    }
}
