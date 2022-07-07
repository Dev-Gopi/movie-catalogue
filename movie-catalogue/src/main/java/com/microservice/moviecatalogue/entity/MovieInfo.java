package com.microservice.moviecatalogue.entity;

public class MovieInfo {
    private long id;
    private String movieName;
    private String movieDesc;
    private String movieType;
    private int movieRating;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public MovieInfo(long id, String movieName, String movieDesc, String movieType, int movieRating) {
        this.id = id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.movieType = movieType;
        this.movieRating = movieRating;
    }

    public MovieInfo() {
    }
}
