package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Dto.CatDto;
import com.example.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class catQuery implements GraphQLQueryResolver {
    @Autowired
    private CatService catService;

    public List<CatDto> getAll(){
        return this.catService.getAllCategory();
    }

    public CatDto getById(Integer cat_id){
        return this.catService.getCategory(cat_id);
    }
}
