package com.example.week7.domain.post;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditPostInfoRequestDto {

    private String title;
    private int price;
    private String content;
    private String place;
}