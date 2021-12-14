package com.example.api_test_comm.controller;

import com.example.api_test_comm.entity.Post;
import com.example.api_test_comm.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
        return service.savePost(post);
    }

    @PostMapping("/addPosts")
    public List<Post> addPosts(@RequestBody List<Post> posts){
        return service.savePosts(posts);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return service.getPosts();
    }

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable int id){
        return service.getPostById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id){
        return service.deletePost(id);
    }

    @PutMapping ("/update")
    public Post updatePost ( Post post){
        return service.updatePost(post);
    }
}
