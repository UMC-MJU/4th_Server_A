package com.example.umc_board.Service;

import com.example.umc_board.Dto.BoardRequestDto;
import com.example.umc_board.Entity.Board;
import com.example.umc_board.Entity.Category;
import com.example.umc_board.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.MalformedURLException;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public Page<Board> findBoardList(Pageable pageable){
        return boardRepository
                .findAll(PageRequest.of(
                        pageable.getPageNumber() <= 0?0: pageable.getPageNumber()-1, pageable.getPageSize()
                ));
    }

    public Board findBoardById(Long id){
        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("글이 없습니다."));
        return board;
    }

    @Transactional
    public Board save(BoardRequestDto requestDto) throws MalformedURLException {
        return boardRepository.save(requestDto.toEntity());
    }

    @Transactional
    public Board update(Long id, BoardRequestDto requestDto){
        Board find = findBoardById(id);
        find.update(requestDto.getTitle(), requestDto.getContent(), Category.valueOf(requestDto.getCategory()));
        return boardRepository.save(find);
    }

    @Transactional
    public void delete(Long id){
        boardRepository.deleteById(id);
    }
}
