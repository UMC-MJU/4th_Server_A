package com.example.umc_board.Dto;

import com.example.umc_board.Entity.Board;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardResponseDto {

    @ApiModelProperty(example = "test")
    private String title;

    @ApiModelProperty(example = "test content")
    private String content;

    @ApiModelProperty(example = "커뮤니티")
    private String category;

    @ApiModelProperty(example = "tester")
    private String user;

    public static BoardResponseDto of(Board board){
        return BoardResponseDto.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .category(board.getCategory().getValue())
                .user(board.getUser().getName())
                .build();
    }
}
