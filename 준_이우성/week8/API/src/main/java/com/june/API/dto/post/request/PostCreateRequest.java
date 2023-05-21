package com.june.API.dto.post.request;

import lombok.Getter;

@Getter
public class PostCreateRequest {
    private Long writerId;
    private String title;
    private Integer cost;
    private String content;
}
