package com.example.umc_board.Dto;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.KakaoPlace;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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
    private String category;

    @ApiModelProperty(example = "tester")
    private String user;

    private List<List<String>> placeList;

    public static BoardResponseDto of(Board board){
        List<KakaoPlace> places = board.getPlaceList();
        List<List<String>> list = new ArrayList<>();

        for(KakaoPlace place : places){
            List<String> tempList = new ArrayList<>();
            tempList.add(place.getId().toString());
            tempList.add(place.getTitle());
            tempList.add(place.getUrl().toString());
            list.add(tempList);
        }

        return BoardResponseDto.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .category(board.getCategory().getValue())
                .user(board.getUser().getName())
                .placeList(list)
                .build();
    }
}
