package com.example.umc_board.Controller;

import com.example.umc_board.Dto.BoardRequestDto;
import com.example.umc_board.Dto.BoardResponseDto;
import com.example.umc_board.Entity.Board;
import com.example.umc_board.Service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
@Api(value = "게시판 API")
public class BoardController {

    private final BoardService boardService;

    @Value("${kakao.map.url}")
    private String KAKAO_MAP_URL;

    @Value("${kakao.map.key}")
    private String KAKAO_MAP_KEY;

    @GetMapping("/list")
    @ApiOperation(value = "게시물 페이지 API")
    public ResponseEntity<Page<Board>> list(@PageableDefault Pageable pageable, Model model){
        return ResponseEntity.ok(boardService.findBoardList(pageable));
    }

    @GetMapping("/search")
    @ApiOperation(value = "게시물 검색 API")
    public ResponseEntity<List<Board>> getSearchBoards(@RequestParam(value = "search") String search){
        return ResponseEntity.ok(boardService.findBoardByTitle(search));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "게시물 조회 API")
    @ApiImplicitParam(name = "id", value = "게시물 id")
    public ResponseEntity<BoardResponseDto> getBoard(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(BoardResponseDto.of(boardService.findBoardById(id)));
    }


    @PostMapping("/post")
    @ApiOperation(value = "게시물 작성 API")
    public ResponseEntity<BoardResponseDto> postBoard(@RequestBody BoardRequestDto requestDto) throws MalformedURLException {
        return ResponseEntity.ok(BoardResponseDto.of(boardService.save(requestDto)));
    }

    @GetMapping("/kakaomap/{keyword}")
    @ApiOperation(value = "카카오맵 키워드 검색 API")
    @ApiImplicitParam(name = "keyword", value = "키워드")
    public ResponseEntity<String> keywordMap(@PathVariable(value = "keyword") String keyword) throws IOException, URISyntaxException {
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(keyword);
        String search = StandardCharsets.UTF_8.decode(byteBuffer).toString();

        URI uri = UriComponentsBuilder
                .fromUriString(KAKAO_MAP_URL)
                .path("/v2/local/search/keyword.json") // 요청 경로를 "/v2/local/search/keyword.json"으로 지정
                .queryParam("query", search)
                .queryParam("page", 1)
                .queryParam("size", 10)
                .encode()
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK " + KAKAO_MAP_KEY);

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, String.class);
        return result;
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
