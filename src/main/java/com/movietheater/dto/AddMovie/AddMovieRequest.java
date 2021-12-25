package com.movietheater.dto.AddMovie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.movietheater.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddMovieRequest {

    private String movieNamEnglish;
    private String movieNameVN;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String actor;
    private String movieProductionCompany;
    private String directtor;
    private  int duration;
    private  String version;
    private String cinemaRoom;
    private  String content;
    private  String lageImage;
    private String smallImage;

    Set<TypeRequest> typeRequests = new HashSet<>();

}
