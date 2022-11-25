package com.example.demo.Repositories;

import com.example.demo.Entities.Category;
import com.example.demo.Entities.Post;
import com.example.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post>findByCategory(Category category);
    List<Post>findByUser(User user);

}
