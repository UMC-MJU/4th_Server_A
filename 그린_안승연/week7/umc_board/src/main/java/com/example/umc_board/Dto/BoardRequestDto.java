package com.example.umc_board.Dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class BoardRequestDto {

    @ApiModelProperty(example = "test")
    private String title;

    @ApiModelProperty(example = "test content")
    private String content;

    @ApiModelProperty(example = "community")
    private String category;

    @ApiModelProperty(example = "test@test.com")
    private String email;

    @ApiModelProperty(example = "[20522613]")
    private List<Long> placeList;

    @Builder
    public BoardRequestDto(String title, String content, String category, String email,
                           List<Long> places) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.email = email;
        this.placeList = places;
    }
}
