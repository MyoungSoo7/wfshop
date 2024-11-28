package org.welfare.wfshop.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public void createMember(MemberRequestDto requestDto) {
        Member member = modelMapper.map(requestDto, Member.class);
        memberRepository.save(member);
    }

    public List<MemberResponseDto> getAllMembers() {
        return mapToResponseDto(memberRepository.findAll());
    }

    public List<MemberResponseDto> searchMembers(String keyword) {
        return mapToResponseDto(memberRepository.findByNameContaining(keyword));
    }
    private List<MemberResponseDto> mapToResponseDto(List<Member> members) {
        return members.stream()
                .map(this::getMemberResponse)
                .collect(Collectors.toList());
    }

    public MemberResponseDto getMemberResponse(Member member) {
        return modelMapper.map(member, MemberResponseDto.class);
    }

}
