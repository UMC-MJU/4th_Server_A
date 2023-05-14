package com.example.umc_board.Repository;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
