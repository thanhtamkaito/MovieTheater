package com.movietheater.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ticketId;
        private  int price;
        private  int ticketType;

        @OneToOne(mappedBy = "ticket")
        private  CinemaRoom cinemaRoom;
}
