package com.movietheater.repository;

import com.movietheater.entity.CinemaRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRoomRepo extends JpaRepository<CinemaRoom, Integer> {

    CinemaRoom findCinemaRoomByCinemaRoomName( String roomName);
}
