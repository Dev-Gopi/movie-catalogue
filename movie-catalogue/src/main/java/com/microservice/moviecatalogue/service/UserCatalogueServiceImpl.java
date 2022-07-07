package com.microservice.moviecatalogue.service;

import com.microservice.moviecatalogue.entity.UserCatalogueEntity;
import org.springframework.stereotype.Service;

@Service
public class UserCatalogueServiceImpl implements UserCatalogueService{
    @Override
    public UserCatalogueEntity getUserCatalogById(long id, int rating, String desc) {
        return new UserCatalogueEntity(1L,"gopi","gopi@gmail.com",rating,desc);
    }
}
