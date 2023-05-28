package com.example.test_week7.domain.post;


import com.example.test_week7.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.data.domain.Pageable;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public void createPost(@RequestBody CreatePostRequestDto createPostRequestDto, Member member) {
        postRepository.save(createPostRequestDto.toEntity(member));
    }

    public Page<SimplePostInfoResponseDto> getSimplePostInfoList(Pageable pageable, Member member) {
        return new PageImpl<>(postRepository.findPostsByMember(pageable, member).get()
                .map(SimplePostInfoResponseDto::toDto)
                .collect(Collectors.toList()),
                pageable,
                postRepository.findPostsByMember(pageable, member).getTotalElements());
    }

    public PostInfoResponseDto getPostInfo(Long postId) {
        return PostInfoResponseDto.toDto(findPost(postId));
    }

    @Transactional
    public void editPostInfo(EditPostInfoRequestDto editPostInfoRequestDto, Long postId) {
        findPost(postId).editPost(editPostInfoRequestDto.getTitle(), editPostInfoRequestDto.getPrice(),
                editPostInfoRequestDto.getContent(), editPostInfoRequestDto.getPlace());
    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.delete(findPost(postId));
    }

    public Post findPost(Long postId) {
        return postRepository.findById(postId).orElseThrow(PostNotFoundException::new);
    }
}
