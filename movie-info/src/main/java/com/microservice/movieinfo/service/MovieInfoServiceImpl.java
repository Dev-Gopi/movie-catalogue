package com.microservice.movieinfo.service;

import com.microservice.movieinfo.entity.MovieInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class MovieInfoServiceImpl implements MovieInfoService{
    List<MovieInfo> list = List.of(
            new MovieInfo(1L,"Dj1","decs","type",4),
            new MovieInfo(1L,"Dj11","decs","type",4),
            new MovieInfo(1L,"Dj1111","decs","type",4),
            new MovieInfo(1L,"Dj2","decs","type",5),
            new MovieInfo(2L,"Dj3","decs","type",5),
            new MovieInfo(3L,"Dj4","decs","type",3)
    );

    @Override
    public List<MovieInfo> filterAllMovieById(long id, int rating, String disc) {
        return list.stream().filter(movieInfo -> Objects.equals(movieInfo.getId(), id) && Objects.equals(movieInfo.getMovieRating(), rating)).collect(Collectors.toList());
    }
}
