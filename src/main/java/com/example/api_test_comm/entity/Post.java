package com.example.api_test_comm.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")


public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String post_title;
    private String post_text;
    private String post_pic;
}
