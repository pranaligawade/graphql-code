package com.example.demo.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Dto.PostDto;
import com.example.demo.Entities.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostQuery implements GraphQLQueryResolver {
    @Autowired
    private PostService postService;

    public PostDto get_post(Integer post_id) {
        return this.postService.getBYIdPost(post_id);
    }


    public  List<PostDto>get_ALL_Post(){
        return  this.postService.getAll_Post();
    }

    public List<PostDto> getPostBy_Cat(Integer cat_id) {
        return this.postService.getPostByCategory(cat_id);
    }

    public List<PostDto> getPost_User(Integer user_id) {
        return this.postService.getPost_By_User(user_id);    }
}
