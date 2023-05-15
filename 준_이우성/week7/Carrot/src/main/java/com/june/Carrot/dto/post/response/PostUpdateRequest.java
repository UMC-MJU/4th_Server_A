package com.june.Carrot.dto.post.response;

import lombok.Getter;

@Getter
public class PostUpdateRequest {
    private Long id;
    private String title;
    private Integer cost;
    private String content;
}
