package com.microservice.moviecatalogue.model;

public class UserCatalogueModel {
    private long id;
    private int rating;
    private String desc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UserCatalogueModel(long id, int rating, String desc) {
        this.id = id;
        this.rating = rating;
        this.desc = desc;
    }

    public UserCatalogueModel() {
    }
}
