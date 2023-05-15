package com.june.Carrot.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long writerId;
    @Column(nullable = true)
    private Long buyerId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer cost;
    @Column(nullable = false)
    private String content;

    public Post(Long writerId, String title, Integer cost, String content) {
        this.writerId = writerId;
        this.title = title;
        this.cost = cost;
        this.content = content;
    }

    public void update(String title, Integer cost, String content) {
        this.title = title;
        this.cost = cost;
        this.content = content;
    }
}
