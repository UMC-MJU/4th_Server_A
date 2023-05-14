package com.example.week7.domain.post;

import com.example.week7.domain.member.MemberService;
import com.example.week7.domain.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;


import static com.example.week7.domain.response.Response.success;
import static com.example.week7.domain.response.SuccessMessage.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
@Slf4j
public class PostController {

    private final PostService postService;
    private final MemberService memberService;

    @PostMapping("/create")
    public Response createPost(@RequestBody CreatePostRequestDto createPostRequestDto, Long memberId) {
        postService.createPost(createPostRequestDto, memberService.findMember(memberId));
        return success(SUCCESS_TO_CREATE_POST);
    }

    @GetMapping("/search/list")
    public Response getSimplePostInfoList(Pageable pageable, Long memberId) {
        return success(SUCCESS_TO_GET_POST_LIST, postService.getSimplePostInfoList(pageable, memberService.findMember(memberId)));
    }

    @GetMapping("/search")
    public Response getPostInfo(Long postId) {
        return success(SUCCESS_TO_GET_POST, postService.getPostInfo(postId));
    }

    @PatchMapping("/change")
    public Response editPostInfo(@RequestBody EditPostInfoRequestDto editPostInfoRequestDto, Long postId) {
        postService.editPostInfo(editPostInfoRequestDto, postId);
        return success(SUCCESS_TO_EDIT_POST);
    }

    @DeleteMapping("/delete")
    public Response deletePost(Long postId) {
        postService.deletePost(postId);
        return success(SUCCESS_TO_DELETE_POST);
    }
}