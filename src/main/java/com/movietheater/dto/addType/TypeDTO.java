package com.movietheater.dto.addType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.movietheater.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TypeDTO {

    private String typeName;
    private Set<MovieDTO> movies ;

}
