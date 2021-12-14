package com.example.api_test_comm.service;

import com.example.api_test_comm.entity.Post;
import com.example.api_test_comm.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post savePost(Post post){
        return repository.save(post);
    }

    public List<Post> savePosts(List<Post> posts){
        return repository.saveAll(posts);
    }

    public List<Post> getPosts(){
        return repository.findAll();
    }

    public Post getPostById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deletePost(int id){
        repository.deleteById(id);
        return "Post removed !!!"+id;
    }

    public Post updatePost( Post post){
        Post existingPost = repository.findById(post.getId()).orElse(null);
        existingPost.setPost_title(post.getPost_title());
        existingPost.setPost_text(post.getPost_text());
        existingPost.setPost_pic(post.getPost_pic());
        return repository.save(existingPost);
    }
}