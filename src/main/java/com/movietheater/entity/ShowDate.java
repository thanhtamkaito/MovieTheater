package com.movietheater.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ShowDate {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int showDateId;
    private Date showDate;
    private String dateName;


    @ManyToMany(mappedBy = "showDates", fetch = FetchType.EAGER
    , cascade = CascadeType.ALL)
    private Set<Movie> movies = new HashSet<>();


}
