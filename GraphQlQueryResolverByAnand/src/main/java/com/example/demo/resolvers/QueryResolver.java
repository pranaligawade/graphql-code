package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Entity.Pranali;
import com.example.demo.service.PranaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PranaliService pranaliService;


    public Pranali getOne(int id) {
        return this.pranaliService.getOne(id);
    }

    public List<Pranali> getAll() {
        return this.pranaliService.getAll();
    }
}
