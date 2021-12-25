package com.movietheater.controller.AddMovie;


import com.movietheater.dto.AddMovie.AddMovieRequest;
import com.movietheater.service.AddMovie.AddMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddmMovie")
public class AddMovie {

    @Autowired
    AddMovieService addMovieService;

    @PostMapping("/Add")
    public void addMovie(@RequestBody AddMovieRequest addMovieRequest){
        addMovieService.addMovie(addMovieRequest);
    }

}
