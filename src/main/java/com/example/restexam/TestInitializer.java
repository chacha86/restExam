package com.example.restexam;

import com.example.restexam.entity.Post;
import com.example.restexam.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TestInitializer implements ApplicationRunner {

    private final PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (postRepository.count() > 0) {
            return;
        }

        postRepository.saveAll(List.of(
                Post.builder()
                        .title("Title 1")
                        .content("Content 1")
                        .build(),
                Post.builder()
                        .title("Title 2")
                        .content("Content 2")
                        .build(),
                Post.builder()
                        .title("Title 3")
                        .content("Content 3")
                        .build()

        ));
    }
}
