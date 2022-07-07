package com.microservice.moviecatalogue.controller;

import com.microservice.moviecatalogue.entity.UserCatalogueEntity;
import com.microservice.moviecatalogue.model.UserCatalogueModel;
import com.microservice.moviecatalogue.service.UserCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserCatalogueController {
    @Autowired
    UserCatalogueService userCatalogueService;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HttpHeaders headers;
    @PostMapping("/usercatalog")
    public UserCatalogueEntity getUserCatalog(@RequestBody UserCatalogueModel userCatalogueModel){
        UserCatalogueEntity userCatalogueEntity = this.userCatalogueService.getUserCatalogById(userCatalogueModel.getId(),userCatalogueModel.getRating(),userCatalogueModel.getDesc());
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserCatalogueModel> entity = new HttpEntity<UserCatalogueModel>(userCatalogueModel,headers);
        userCatalogueEntity.setMovieInfo(this.restTemplate.postForObject("http://movie-info/movieinfo", entity, List.class));
        return userCatalogueEntity;
    }
}
