package com.example.demo.Repositories;

import com.example.demo.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepo extends JpaRepository<Category,Integer> {
}
