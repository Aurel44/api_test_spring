package com.example.api_test_comm.repository;

import com.example.api_test_comm.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post,Integer> {

}
