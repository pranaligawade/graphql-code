package com.example.demo.Repo;


import com.example.demo.Entity.Pranali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PranaliRepo extends JpaRepository<Pranali,Integer> {
}
