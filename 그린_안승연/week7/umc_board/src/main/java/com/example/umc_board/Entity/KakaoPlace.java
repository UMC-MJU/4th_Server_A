package com.example.umc_board.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.net.URL;

@NoArgsConstructor
@Getter
@Entity
@Table
public class KakaoPlace {

    @Id
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private URL url;

    @Builder
    public KakaoPlace(Long id, String title, URL url){
        this.id = id;
        this.title = title;
        this.url = url;
    }
}
