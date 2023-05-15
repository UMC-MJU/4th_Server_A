package com.june.Carrot.service;

import com.june.Carrot.domain.Post;
import com.june.Carrot.dto.post.request.PostCreateRequest;
import com.june.Carrot.dto.post.response.PostUpdateRequest;
import com.june.Carrot.dto.post.response.PostsGetResponse;
import com.june.Carrot.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    @Transactional
    public void createPost(PostCreateRequest request) {
        postRepository.save(new Post(request.getWriterId(), request.getTitle(), request.getCost(), request.getContent()));
    }
    @Transactional
    public List<PostsGetResponse> getPosts() {
        return postRepository.findAll().stream()
                .map(PostsGetResponse::new)
                .collect(Collectors.toList());
    }
    @Transactional
    public void updatePost(PostUpdateRequest request) {
        Post post = postRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        post.update(request.getTitle(), request.getCost(), request.getContent());
    }
    @Transactional
    public void deletePost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        postRepository.delete(post);
    }
}
