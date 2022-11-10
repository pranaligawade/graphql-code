package com.example.demo.service;

import com.example.demo.Entity.Pranali;
import com.example.demo.Repo.PranaliRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PranaliService {

    @Autowired
    private PranaliRepo pranaliRepo;

    public Pranali addData(Pranali pranali){
        return this.pranaliRepo.save(pranali);
    }

    public Pranali getOne(int id){
        return this.pranaliRepo.findById(id).orElseThrow(()->new RuntimeException("Not in DB"));
    }

    public List<Pranali> getAll(){
        return this.pranaliRepo.findAll();
    }
     public  Pranali update(int id,Pranali pranali){
        Pranali pranali1=this.pranaliRepo.findById(id).orElseThrow(()->new RuntimeException("not in db"));
        pranali1.setId(pranali.getId());
        pranali1.setQuality(pranali.getQuality());
        pranali1.setScore(pranali.getScore());
        return  this.pranaliRepo.save(pranali1);
     }
      public  Pranali delete(int id){
        Pranali pranali=this.pranaliRepo.findById(id).orElseThrow(()->new RuntimeException("not in db"));
         this.pranaliRepo.deleteById(id);
         return pranali;
      }

}
