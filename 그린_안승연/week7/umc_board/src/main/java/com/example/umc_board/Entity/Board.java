package com.example.umc_board.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Board extends BaseTimeEntity{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<KakaoPlace> placeList = new ArrayList<>();

    @Builder
    public Board(String title, String content,
                 Category category, User user, List<KakaoPlace> list){
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
        this.placeList = list;
    }

    public void update(String title, String content, Category category){
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
