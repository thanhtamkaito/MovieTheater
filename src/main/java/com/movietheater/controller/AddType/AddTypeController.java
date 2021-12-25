package com.movietheater.controller.AddType;


import com.movietheater.dto.AddMovie.AddMovieRequest;
import com.movietheater.dto.addType.TypeDTO;
import com.movietheater.service.AddMovie.AddMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddType")
public class AddTypeController {

    @Autowired
    AddMovieService addMovieService;

    @PostMapping("/Add")
    public void addMovie(@RequestBody TypeDTO typeDTO){
        addMovieService.addTypeMovie(typeDTO);
    }

}
