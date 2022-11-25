package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.Dto.PostDto;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Component
public class PostMutation implements GraphQLMutationResolver {
    @Autowired
    private PostService postService;

    public PostDto create_Post(@Valid PostDto postDto, Integer user_id, Integer cat_id){
        return  this.postService.createPost(postDto,user_id,cat_id);
    }
    public PostDto update_Post(@Valid PostDto  postDto,Integer post_id){
        return  this.postService.updatePost(postDto,post_id);
    }
    public int  delete_Post(Integer post_id){
        this.postService.deletePost(post_id);
        
        return post_id;
    }
}
