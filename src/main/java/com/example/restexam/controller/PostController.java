package com.example.restexam.controller;

import com.example.restexam.entity.Post;
import com.example.restexam.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 모든 메서드의 리턴을 문자 그대로 전달. template 사용 X -> JSON 문자열로 전달
@RequiredArgsConstructor
@RequestMapping("/posts")
@CrossOrigin("http://localhost:3000") // localhost:3000 번에 대해서는 데이터를 허용해줘라.
public class PostController {

    private final PostService postService;

    @GetMapping("")
    public List<Post> getList() {
        return postService.getList();
    }
}