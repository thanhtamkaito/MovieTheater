package com.movietheater.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int typeId;
    private String typeName;



    //@ManyToMany(targetEntity = Movie.class,mappedBy = "types",fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_type"
            ,joinColumns = @JoinColumn(name = "type_id")
            ,inverseJoinColumns = @JoinColumn(name = "movie_id"))
    @JsonIgnoreProperties("types")
    private Set<Movie> movies ;




//    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinTable(name = "movie_type"
//            ,joinColumns = @JoinColumn(name = "type_id")
//            ,inverseJoinColumns = @JoinColumn(name = "movie_id"))
//    @JsonIgnoreProperties("types")
//    private Set<Movie> movies ;



    public Type(String typeName) {
        this.typeName = typeName;
    }

    public Type(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Type(String typeName, Set<Movie> movies) {
        this.typeName = typeName;
        this.movies = movies;
    }
}
