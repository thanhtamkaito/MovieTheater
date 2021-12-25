package com.movietheater.dto.List;

import com.movietheater.entity.Schedule;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
public class MoviRespone {

    private String movieNamEnglish;
    private String movieNameVN;
    private  String lageImage;
    private String smallImage;
    private Set<ScheduleDTO> schedules ;

}
