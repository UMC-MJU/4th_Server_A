package com.example.umc_board.Dto;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.Category;
import com.example.umc_board.Entity.KakaoPlace;
import com.example.umc_board.Entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

    @ApiModelProperty(example = "[[\"20522613\", \"거북당\", \"http://place.map.kakao.com/20522613\"]]")
    private List<List<String>> placeList;

    @Builder
    public BoardRequestDto(String title, String content, String category, User user,
                           List<List<String>> places){
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
        this.placeList = places;
    }

    public Board toEntity() throws  MalformedURLException {
        List<KakaoPlace> places = new ArrayList<>();

        for(List<String> place : placeList){
            Long id = Long.valueOf(place.get(0));
            String title = place.get(1);
            URL url = new URL(place.get(2));
            KakaoPlace temp = KakaoPlace.builder()
                    .id(id)
                    .title(title)
                    .url(url)
                    .build();
            places.add(temp);
        }

        return Board.builder()
                .title(title)
                .content(content)
                .category(Category.valueOf(category))
                .user(user)
                .list(places)
                .build();
    }
}
