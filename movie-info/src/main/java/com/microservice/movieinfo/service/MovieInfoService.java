package com.microservice.movieinfo.service;

import com.microservice.movieinfo.entity.MovieInfo;

import java.util.List;

public interface MovieInfoService {
    public List<MovieInfo> filterAllMovieById(long id,int rating,String disc);
}
