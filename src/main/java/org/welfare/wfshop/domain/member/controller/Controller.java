package org.welfare.wfshop.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.welfare.wfshop.domain.member.dto.MemberRequestDto;
import org.welfare.wfshop.domain.member.dto.MemberResponseDto;
import org.welfare.wfshop.domain.member.service.MemberService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class Controller {

    private final MemberService memberService;

    // 회원 목록 조회 API
    @GetMapping
    public List<MemberResponseDto> getAllMembers() {
        return memberService.getAllMembers();
    }

    // 회원 검색 API
    @GetMapping("/search")
    public List<MemberResponseDto> searchMembers(@RequestParam String keyword) {
        return memberService.searchMembers(keyword);
    }

    // 회원 추가 API
    @PostMapping
    public ResponseEntity<Void> createMember(@RequestBody MemberRequestDto requestDto) {
        memberService.createMember(requestDto);
        return ResponseEntity.ok().build();
    }


}
