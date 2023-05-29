package com.example.umc_board.Repository;

import com.example.umc_board.Entity.Board;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.umc_board.Entity.QBoard.board;

@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    public List<Board> findByTitle(String title){
        return jpaQueryFactory.selectFrom(board)
                .where(board.title.eq(title))
                .fetch();
    }
}
