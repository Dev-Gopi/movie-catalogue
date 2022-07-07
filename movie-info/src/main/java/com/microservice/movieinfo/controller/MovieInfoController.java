package com.microservice.movieinfo.controller;

import com.microservice.movieinfo.entity.MovieInfo;
import com.microservice.movieinfo.model.MovieInfoModel;
import com.microservice.movieinfo.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieInfoController {
    @Autowired
    private MovieInfoService movieInfoService;
    @PostMapping("/movieinfo")
    public List<MovieInfo> getAllMovieById(@RequestBody MovieInfoModel movieInfoModel){
        return this.movieInfoService.filterAllMovieById(movieInfoModel.getId(),movieInfoModel.getRating(),movieInfoModel.getDesc());
    }
}
