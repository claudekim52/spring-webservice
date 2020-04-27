package com.claude.webservice.web;

import com.claude.webservice.domain.posts.PostsRepository;
import com.claude.webservice.dto.posts.PostsSaveRequestDto;
import com.claude.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    // AllArgsConstruct가 빈을 주입해줌
    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }
}
