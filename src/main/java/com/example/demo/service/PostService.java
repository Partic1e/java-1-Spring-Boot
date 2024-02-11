package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post("some text"));
        list.add(new Post("same text"));
        list.add(new Post("3"));
        return list;
    }
}
