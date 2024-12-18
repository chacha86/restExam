package com.example.restexam.service;

import com.example.restexam.entity.Post;
import com.example.restexam.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public List<Post> getList() {
        return postRepository.findAll();
    }
}