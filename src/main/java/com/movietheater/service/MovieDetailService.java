package com.movietheater.service;

import com.movietheater.dto.List.MoviRespone;
import com.movietheater.dto.List.ScheduleDTO;
import com.movietheater.entity.Movie;
import com.movietheater.entity.Schedule;
import com.movietheater.repository.MovieRepo;
import com.movietheater.repository.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieDetailService {

    @Autowired
    ScheduleRepo scheduleRepo;
    @Autowired
    MovieRepo movieRepo;

    public MoviRespone getMoviInfor( String movieName){
        MoviRespone moviRespone = new MoviRespone();
//        moviRespone =  mo
            return  null;
    }

    private  MoviRespone ConvertDTO(String movieName){
        Movie movie = movieRepo.findMovieByMovieNamEnglish(movieName);
        Set<Schedule> schedules = movie.getSchedules().stream().collect(Collectors.toSet());

        Set<ScheduleDTO> scheduleDTO = new HashSet<>();

    //    schedules.stream().map(schedule -> new ScheduleDTO(schedule.get))

        MoviRespone moviRespone = new MoviRespone();
        moviRespone.setMovieNameVN(movie.getMovieNameVN());
        moviRespone.setMovieNamEnglish(movie.getMovieNamEnglish());
        moviRespone.setLageImage(movie.getLageImage());
        moviRespone.setSmallImage(movie.getSmallImage());


        return  moviRespone;

    }






}
