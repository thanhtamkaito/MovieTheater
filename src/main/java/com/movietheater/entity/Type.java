package com.movietheater.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int typeId;
    private String typeName;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_type"
    ,joinColumns = @JoinColumn(name = "movie_id")
    ,inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Set<Movie> movies = new HashSet<>();



}
