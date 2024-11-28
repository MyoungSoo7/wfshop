package org.welfare.wfshop.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.welfare.wfshop.domain.member.dto.MemberRequestDto;
import org.welfare.wfshop.domain.member.dto.MemberResponseDto;
import org.welfare.wfshop.domain.member.entity.Member;
import org.welfare.wfshop.domain.member.repository.MemberRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    // 회원 목록 조회
    public List<MemberResponseDto> getAllMembers() {
        List<Member> members = memberRepository.findAll();
        return members.stream()
                .map(member -> toResponseDto(member))
                .collect(Collectors.toList());
    }

    // 회원 검색
    public List<MemberResponseDto> searchMembers(String keyword) {
        List<Member> members = memberRepository.findByNameContaining(keyword);
        return members.stream()
                .map(member -> toResponseDto(member))
                .collect(Collectors.toList());
    }

    // 회원 추가
    public void createMember(MemberRequestDto requestDto) {
        Member member = toEntity(requestDto);
        memberRepository.save(member);
    }

    // 엔티티 → DTO 변환
    private MemberResponseDto toResponseDto(Member member) {
        return MemberResponseDto.builder()
                .memberNo(member.getMemberNo())
                .name(member.getName())
                .mail(member.getMail())
                .mobileNo(member.getMobileNo())
                .build();
    }

    // DTO → 엔티티 변환
    private Member toEntity(MemberRequestDto requestDto) {
        return Member.builder()
                .memberNo(requestDto.getMemberNo())
                .name(requestDto.getName())
                .mail(requestDto.getMail())
                .mobileNo(requestDto.getMobileNo())
                .build();
    }
/*
    public MemberResponseDto toResponseDto(Member member) {
        return MemberResponseDto.builder()
                .memberNo(member.getMemberNo())
                .name(member.getName())
                .mail(member.getMail())
                .mobileNo(member.getMobileNo())
                .memberType(member.getMemberType())
                .memberGroup(member.getMemberGroup())
                .loginDate(member.getLoginDate())
                .status(member.getStatus())
                .workplace(
                        MemberResponseDto.WorkplaceDto.builder()
                                .officeName(member.getWorkplace().getOfficeName())
                                .workplaceAddress(
                                        MemberResponseDto.AddressDto.builder()
                                                .postcode(member.getWorkplace().getWorkplaceAddress().getPostcode())
                                                .address(member.getWorkplace().getWorkplaceAddress().getAddress())
                                                .detailAddress(member.getWorkplace().getWorkplaceAddress().getDetailAddress())
                                                .build()
                                )
                                .build()
                )
                .build();
    }*/


}
