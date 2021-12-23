package com.movietheater.repository;

import com.movietheater.entity.ScheduleSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScheduleSeatRepo extends JpaRepository<ScheduleSeat,String> {

    String quyre = "SELECT * FROM dbo.schedule_seat WHERE dbo.schedule_seat.movie_id = ?";
    @Query( value = quyre, nativeQuery = true)
    ScheduleSeat  getScheduleSeatByMovieId(String moviceId );
}
