package com.june.Carrot.dto.post.response;

import com.june.Carrot.domain.Post;
import lombok.Getter;

@Getter
public class PostsGetResponse {
    private Long writerId;
    private String title;
    private Integer cost;

    public PostsGetResponse(Post post){
        this.writerId = post.getWriterId();
        this.title = post.getTitle();
        this.cost = post.getCost();
    }

}
