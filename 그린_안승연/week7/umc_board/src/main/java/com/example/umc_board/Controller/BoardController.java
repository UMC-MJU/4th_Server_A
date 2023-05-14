package com.example.umc_board.Controller;

import com.example.umc_board.Service.BoardService;
import com.example.umc_board.Dto.BoardRequestDto;
import com.example.umc_board.Dto.BoardResponseDto;
import com.example.umc_board.Entity.Board;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
@Api(value = "게시판 API")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    @ApiOperation(value = "게시물 페이지 API")
    public ResponseEntity<Page<Board>> list(@PageableDefault Pageable pageable, Model model){
        return ResponseEntity.ok(boardService.findBoardList(pageable));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "게시물 조회 API")
    @ApiImplicitParam(name = "id", value = "게시물 id")
    public ResponseEntity<BoardResponseDto> getBoard(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(BoardResponseDto.of(boardService.findBoardById(id)));
    }


    @PostMapping("/post")
    @ApiOperation(value = "게시물 작성 API")
    public ResponseEntity<BoardResponseDto> postBoard(@RequestBody BoardRequestDto requestDto){
        return ResponseEntity.ok(BoardResponseDto.of(boardService.save(requestDto)));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "게시물 수정 API")
    @ApiImplicitParam(name = "id", value = "게시물 id")
    public ResponseEntity<BoardResponseDto> updateBoard(@PathVariable(value = "id") Long id, @RequestBody BoardRequestDto requestDto){
        return ResponseEntity.ok(BoardResponseDto.of(boardService.update(id, requestDto)));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "게시물 삭제 API")
    @ApiImplicitParam(name = "id", value = "게시물 id")
    public ResponseEntity<String> deleteBoard(@PathVariable(value = "id") Long id){
        boardService.delete(id);
        return ResponseEntity.ok(new String("Delete Success".getBytes(), StandardCharsets.UTF_8));
    }
}
