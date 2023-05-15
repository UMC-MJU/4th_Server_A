package com.example.umc_board.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    community("커뮤니티"),
    notice("공지사항"),
    qna("질문게시판");

    private String value;
}
