package com.example.umc_board.Dto;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.Category;
import com.example.umc_board.Entity.KakaoPlace;
import com.example.umc_board.Entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private Category category;

    @ApiModelProperty(example = "tester")
    private User user;

    @ApiModelProperty(example = "[[\"20522613\", \"거북당\", \"http://place.map.kakao.com/20522613\"]]")
    private List<KakaoPlace> placeList;

    public static BoardResponseDto of(Board board){
        return BoardResponseDto.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .category(board.getCategory())
                .user(board.getUser())
                .placeList(board.getPlaceList())
                .build();
    }
}
