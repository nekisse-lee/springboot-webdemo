package com.nekisse.webservice.web;

import com.nekisse.webservice.domain.posts.PostsRepository;
import com.nekisse.webservice.domain.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/posts")
    public void savePots(@RequestBody PostsSaveRequestDto dto) {
        postsService.save(dto);
    }


}
