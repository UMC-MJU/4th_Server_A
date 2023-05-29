package com.example.umc_board.Repository;

import com.example.umc_board.Entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepositoryCustom {

    List<Board> findByTitle(String title);
}
