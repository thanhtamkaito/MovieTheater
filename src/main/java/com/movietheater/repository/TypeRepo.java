package com.movietheater.repository;

import com.movietheater.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepo extends JpaRepository<Type, Integer> {


    @Query( value = "SELECT * FROM dbo.type WHERE type_name = ?", nativeQuery = true)
    Type getType(String typeName);

}
