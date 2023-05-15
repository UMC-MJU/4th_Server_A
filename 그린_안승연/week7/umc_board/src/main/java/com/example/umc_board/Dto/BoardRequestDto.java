package com.example.umc_board.Dto;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.Category;
import com.example.umc_board.Entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardRequestDto {

    @ApiModelProperty(example = "test")
    private String title;

    @ApiModelProperty(example = "test content")
    private String content;

    @ApiModelProperty(example = "커뮤니티")
    private String category;

    @ApiModelProperty(example = "tester")
    private User user;

    @Builder
    public BoardRequestDto(String title, String content, String category, User user){
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
    }

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .category(Category.valueOf(category))
                .user(user)
                .build();
    }
}
