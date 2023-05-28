package com.june.API.controller;

import com.june.API.dto.post.request.PostCreateRequest;
import com.june.API.dto.post.response.PostGetResponse;
import com.june.API.dto.post.response.PostUpdateRequest;
import com.june.API.dto.post.response.PostsGetResponse;
import com.june.API.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/posts")
    public void createPost(@RequestBody PostCreateRequest request){
        System.out.println(request.getWriterId() + request.getTitle() + request.getContent() + request.getCost());
        postService.createPost(request);
    }
    @GetMapping("/posts")
    public List<PostsGetResponse> getPosts(){
        return postService.getPosts();
    }
    @GetMapping("/posts/{id}")
    public PostGetResponse getPost(@PathVariable("id") Long id){
        return postService.getPost(id);
    }
    @PutMapping("/posts")
    public void updatePost(@RequestBody PostUpdateRequest request){
        postService.updatePost(request);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        postService.deletePost(id);
    }
}
