package com.june.Carrot.controller;

import com.june.Carrot.dto.post.request.PostCreateRequest;
import com.june.Carrot.dto.post.response.PostUpdateRequest;
import com.june.Carrot.dto.post.response.PostsGetResponse;
import com.june.Carrot.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    @PostMapping("/post/create")
    public void createPost(@RequestBody PostCreateRequest request){
        System.out.println(request.getWriterId() + request.getTitle() + request.getContent() + request.getCost());
        postService.createPost(request);
    }
    @GetMapping("/posts")
    public List<PostsGetResponse> getPosts(){
        return postService.getPosts();
    }

    @PutMapping("/post/update")
    public void updatePost(@RequestBody PostUpdateRequest request){
        postService.updatePost(request);
    }

    @DeleteMapping("/post/delete")
    public void deleteUser(@RequestParam Long id){
        postService.deletePost(id);
    }
}
