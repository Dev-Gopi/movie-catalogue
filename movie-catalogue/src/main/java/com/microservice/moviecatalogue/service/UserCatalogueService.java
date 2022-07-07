package com.microservice.moviecatalogue.service;

import com.microservice.moviecatalogue.entity.UserCatalogueEntity;

public interface UserCatalogueService {
    public UserCatalogueEntity getUserCatalogById(long id, int rating, String desc);
}
