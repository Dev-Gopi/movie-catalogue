package com.microservice.moviecatalogue.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCatalogueEntity {
    private Long id;
    private String userName;
    private String emailId;
    private int catalogRating;
    private String catalogDesc;
    List<MovieInfo> movieInfo=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getCatalogRating() {
        return catalogRating;
    }

    public void setCatalogRating(int catalogRating) {
        this.catalogRating = catalogRating;
    }

    public String getCatalogDesc() {
        return catalogDesc;
    }

    public void setCatalogDesc(String catalogDesc) {
        this.catalogDesc = catalogDesc;
    }

    public List<MovieInfo> getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(List<MovieInfo> movieInfo) {
        this.movieInfo = movieInfo;
    }

    public UserCatalogueEntity(Long id, String userName, String emailId, int catalogRating, String catalogDesc, List<MovieInfo> movieInfo) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.catalogRating = catalogRating;
        this.catalogDesc = catalogDesc;
        this.movieInfo = movieInfo;
    }

    public UserCatalogueEntity(Long id, String userName, String emailId, int catalogRating, String catalogDesc) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.catalogRating = catalogRating;
        this.catalogDesc = catalogDesc;
    }

    public UserCatalogueEntity() {
    }
}
