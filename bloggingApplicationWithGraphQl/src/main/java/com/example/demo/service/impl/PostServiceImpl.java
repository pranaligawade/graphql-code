package com.example.demo.service.impl;

import com.example.demo.Dto.PostDto;
import com.example.demo.Entities.Category;
import com.example.demo.Entities.Post;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.CatRepo;
import com.example.demo.Repositories.PostRepo;
import com.example.demo.Repositories.UserRepo;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CatRepo catRepo;

    @Override
    public PostDto createPost(PostDto postDto, Integer user_id, Integer Cat_id) {
        User user = this.userRepo.findById(user_id).orElseThrow(() -> new ResourceNotFoundException("User", "user id", user_id));
        Category category = this.catRepo.findById(Cat_id).orElseThrow(() -> new ResourceNotFoundException("Category", "category id", Cat_id));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setUser(user);
        post.setCategory(category);
        post.setAddDate(new Date());
        post.setImgName("default.png");
        Post post1 = this.postRepo.save(post);
        return this.modelMapper.map(post1, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer post_id) {
        Post post = this.postRepo.findById(post_id).orElseThrow(() -> new ResourceNotFoundException("Post", "Post Id", post_id));
        post.setPost_id(postDto.getPost_id());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setAddDate(postDto.getAddDate());
        post.setImgName(postDto.getImgName());
        Post post1 = this.postRepo.save(post);
        return this.modelMapper.map(post1, PostDto.class);
    }

    @Override
    public void deletePost(Integer post_id) {
        Post post = this.postRepo.findById(post_id).orElseThrow(() -> new ResourceNotFoundException("Post", "post id", post_id));
        this.postRepo.delete(post);
    }

    @Override
    public List<PostDto> getAll_Post() {
   List<Post> postLists=this.postRepo.findAll();
   List<PostDto>postDtos=postLists.stream().map((post )->this.modelMapper.map(post,PostDto.class) ).collect(Collectors.toList());
return  postDtos;
    }

    @Override
    public PostDto getBYIdPost(Integer post_id) {
        Post post = this.postRepo.findById(post_id).orElseThrow(() -> new ResourceNotFoundException("Post", "post id", post_id));
        return this.modelMapper.map(post, PostDto.class);
    }

    @Override
    public List<PostDto> getPostByCategory(Integer Cat_id) {
      Category category=this.catRepo.findById(Cat_id).orElseThrow(() -> new ResourceNotFoundException("Category", "category_id", Cat_id));
      List<Post>postList=this.postRepo.findByCategory(category);
      return postList.stream().map((post )-> this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());

    }

    @Override
    public List<PostDto> getPost_By_User(Integer user_id) {
        User user1=this.userRepo.findById(user_id).orElseThrow(()->new ResourceNotFoundException("User","user id",user_id));
        List<Post> postList=this.postRepo.findByUser(user1);
        return  postList.stream().map((users)->this.modelMapper.map(users,PostDto.class)).collect(Collectors.toList());
    }
}
