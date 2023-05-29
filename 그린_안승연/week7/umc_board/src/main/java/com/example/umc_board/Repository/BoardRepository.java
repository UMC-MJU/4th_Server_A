package com.example.umc_board.Repository;

import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
    List<Board> findByUser(User user);
}
