package com.memorious.back.controller;

import com.memorious.back.dto.BoardWriteReqDto;
import com.memorious.back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("board/categories")
    public ResponseEntity<?> getCategories(){

        return ResponseEntity.ok(boardService.getBoardCategoriesAll());
    }

    @PostMapping("board/content")
    public ResponseEntity<?> writeBoard(@Valid @RequestBody BoardWriteReqDto boardWriteReqDto, BindingResult bindingResult) {
        System.out.println("boardWriteReqDto : " + boardWriteReqDto);
        return ResponseEntity.ok(boardService.writeBoardContent(boardWriteReqDto));
    }
}
