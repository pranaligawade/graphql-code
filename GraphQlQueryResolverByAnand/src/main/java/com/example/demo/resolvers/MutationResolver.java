package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.Entity.Pranali;
import com.example.demo.service.PranaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PranaliService pranaliService;

    public Pranali addData(Pranali pranali){
        return this.pranaliService.addData(pranali);
    }
    public Pranali updateData(int id, Pranali pranali){
        Pranali pranali1= new Pranali();
        pranali1.setId(pranali.getId());
        pranali1.setQuality(pranali.getQuality());
        pranali1.setScore(pranali.getScore());
        return  this.pranaliService.update(id, pranali1);
}
    public  Pranali deleteData(int id){
        return  this.pranaliService.delete(id);
 }

}
