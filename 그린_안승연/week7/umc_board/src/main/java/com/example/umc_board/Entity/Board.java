package com.example.umc_board.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Builder
    public Board(String title, String content,
                 Category category, User user){
        this.title = title;
        this.content = content;
        this.category = category;
        this.user = user;
    }

    public void update(String title, String content, Category category){
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
