package com.movietheater.service.AddMovie;


import com.movietheater.dto.AddMovie.AddMovieRequest;
import com.movietheater.dto.AddMovie.TypeRequest;
import com.movietheater.dto.addType.TypeDTO;
import com.movietheater.entity.Movie;
import com.movietheater.entity.Type;
import com.movietheater.repository.CinemaRoomRepo;
import com.movietheater.repository.MovieRepo;
import com.movietheater.repository.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddMovieService {

    @Autowired
    MovieRepo movieRepo;
    @Autowired
    TypeRepo typeRepo;

    @Autowired
    CinemaRoomRepo cinemaRoomRepo;

    public void addMovie(AddMovieRequest addMovieRequest){

                Set<Type> type =addMovieRequest.getTypeRequests().stream()
                        .map(typeRequest -> typeRepo.getType(typeRequest.getTypeName())).collect(Collectors.toSet());

                typeRepo.saveAll(type);

        Movie movie = new Movie(
                addMovieRequest.getActor(), addMovieRequest.getContent()
                ,addMovieRequest.getDirecttor(), addMovieRequest.getDuration()
                ,addMovieRequest.getFromDate(), addMovieRequest.getMovieProductionCompany()
                ,addMovieRequest.getToDate(), addMovieRequest.getVersion()
                ,addMovieRequest.getMovieNamEnglish(), addMovieRequest.getMovieNameVN()
                ,addMovieRequest.getLageImage(), addMovieRequest.getSmallImage()
                ,cinemaRoomRepo.findCinemaRoomByCinemaRoomName(addMovieRequest.getCinemaRoom())
                ,type
        );

        movieRepo.save(movie);




    }

    public  void  addTypeMovie( TypeDTO typeDTO){

        Set<Movie> movies = typeDTO.getMovies().stream()
                .map(type -> movieRepo.findMovieByMovieNamEnglish(type.getMovieName()))
                .collect(Collectors.toSet());


        Type type = new Type(
              typeDTO.getTypeName(),
              movies
        );

        typeRepo.save(type);

    }

//    private Type ConvertDTOType(TypeRequest typeRequest){
//        Type type = new Type();
//        type.
//    }

    private  Movie MapMovieDTO( AddMovieRequest addMovieRequest){
        Set<Type> type =addMovieRequest.getTypeRequests().stream()
                .map(typeRequest -> typeRepo.getType(typeRequest.getTypeName())).collect(Collectors.toSet());


        Movie movie = new Movie(
                addMovieRequest.getActor(), addMovieRequest.getContent()
                ,addMovieRequest.getDirecttor(), addMovieRequest.getDuration()
                ,addMovieRequest.getFromDate(), addMovieRequest.getMovieProductionCompany()
                ,addMovieRequest.getToDate(), addMovieRequest.getVersion()
                ,addMovieRequest.getMovieNamEnglish(), addMovieRequest.getMovieNameVN()
                ,addMovieRequest.getLageImage(), addMovieRequest.getSmallImage()
                ,cinemaRoomRepo.findCinemaRoomByCinemaRoomName(addMovieRequest.getCinemaRoom())
                ,type
        );

               //addMovieRequest.getTypeRequests().stream()
//                .map(typeRequest -> typeRepo.findTypeByTypeName(typeRequest.getTypeName())).collect(Collectors.toSet());
//        Set<TypeRequest> typeRequests = addMovieRequest.getTypeRequests().stream()
//               .map(typeRequest -> typeRepo.findTypeByTypeName(typeRequest.getTypeName())).collect(Collectors.toSet());
//
//        Set<TypeRequest> typeRequests = addMovieRequest.getTypeRequests();
//
//        for (TypeRequest t :typeRequests ){
//            type.add(typeRepo.findTypeByTypeName(t.getTypeName()));
//        }




//        movie.setMovieNamEnglish(addMovieRequest.getMovieNamEnglish());
//        movie.setMovieNameVN(addMovieRequest.getMovieNameVN());
//        movie.setFromDate(addMovieRequest.getFromDate());
//        movie.setToDate(addMovieRequest.getToDate());
//        movie.setActor(addMovieRequest.getActor());
//        movie.setMovieProductionCompany(addMovieRequest.getMovieProductionCompany());
//        movie.setDirecttor(addMovieRequest.getDirecttor());
//        movie.setDuration(addMovieRequest.getDuration());
//        movie.setVersion(addMovieRequest.getVersion());
//        movie.setContent(addMovieRequest.getContent());
//        movie.setLageImage(addMovieRequest.getLageImage());
//        movie.setSmallImage(addMovieRequest.getSmallImage());
//
//        movie.setCinemaRoom(cinemaRoomRepo.findCinemaRoomByCinemaRoomName(addMovieRequest.getCinemaRoom()));
//
//        movie.setTypes(type);


//        private Set<TypeRequest> types = new HashSet<>();
//        private CinemaRoom cinemaRoom;


        return movie;

    }

    private Type TypeConver(TypeRequest typeRequest){
            Type type = new Type();

            type.setTypeName(type.getTypeName());
            return type;
    }

}
