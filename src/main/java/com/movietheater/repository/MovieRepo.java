package com.movietheater.repository;

import com.movietheater.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie,String> {
            Movie findMovieByMovieNamEnglish( String nameEng);

            List<Movie> findMovieByMovieNamEnglishContaining( String userNam);






}
