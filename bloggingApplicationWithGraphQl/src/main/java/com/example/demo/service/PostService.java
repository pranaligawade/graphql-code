package com.example.demo.service;

import com.example.demo.Dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    PostDto createPost(PostDto postDto,Integer user_id,Integer Cat_id);

    PostDto updatePost(PostDto postDto, Integer post_id);

    void deletePost(Integer post_id);

    List<PostDto> getAll_Post();

    PostDto getBYIdPost(Integer post_id);

    List<PostDto> getPostByCategory(Integer Cat_id);
    List<PostDto>getPost_By_User(Integer user_id);
}
