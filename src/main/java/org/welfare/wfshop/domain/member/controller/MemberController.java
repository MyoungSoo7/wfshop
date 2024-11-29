package org.welfare.wfshop.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.welfare.wfshop.domain.member.dto.MemberRequestDto;
import org.welfare.wfshop.domain.member.dto.MemberResponseDto;
import org.welfare.wfshop.domain.member.service.MemberService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    // 회원 추가 API
    @PostMapping("/register")
    public String createMember(@RequestBody MemberRequestDto requestDto, ModelAndView model ) {
        memberService.createMember(requestDto);
        List<MemberResponseDto> users = memberService.getAllMembers();
        ModelAndView modelAndView = new ModelAndView("/users");
        modelAndView.addObject("users", users);
        return "/users";
    }


    // 회원 목록 조회 API
    @GetMapping("/")
    public List<MemberResponseDto> getAllMembers( ) {
        // 회원 목록 조회 (이미 작성한 로직 사용)
        List<MemberResponseDto> users = memberService.getAllMembers();
        return users;
    }

    // 회원 검색 API
    @GetMapping("/search")
    public List<MemberResponseDto> searchMembers(@RequestParam String keyword) {
        return memberService.searchMembers(keyword);
    }



}
