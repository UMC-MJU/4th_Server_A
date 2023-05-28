package com.june.API.dto.post.response;

import com.june.API.domain.Post;
import lombok.Getter;

@Getter
public class PostGetResponse {
    private Long id;
    private Long writerId;
    private String title;
    private Integer cost;
    private String content;
    public PostGetResponse(Post post){
        this.id = post.getId();
        this.writerId = post.getWriterId();
        this.title = post.getTitle();
        this.cost = post.getCost();
        this.content = post.getContent();
    }
}
