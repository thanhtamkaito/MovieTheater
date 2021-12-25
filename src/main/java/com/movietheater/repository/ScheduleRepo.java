package com.movietheater.repository;

import com.movietheater.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScheduleRepo extends JpaRepository<Schedule,Integer > {

//
//    @Query(value = )
//    Schedule findScheduleByMovies
}
