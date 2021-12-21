package com.movietheater.entity;

import javax.persistence.*;

@Entity
public class Ticket {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ticketId;
        private  int price;
        private  int ticketType;

        @OneToOne(mappedBy = "ticket")
        private  CinemaRoom cinemaRoom;
}
