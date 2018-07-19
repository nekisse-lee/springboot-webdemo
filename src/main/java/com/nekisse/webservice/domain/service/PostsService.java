package com.nekisse.webservice.domain.service;

import com.nekisse.webservice.domain.posts.PostsRepository;
import com.nekisse.webservice.web.PostsMainResponseDto;
import com.nekisse.webservice.web.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;


    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(entity -> new PostsMainResponseDto(entity))
                .collect(Collectors.toList());
    }


}
