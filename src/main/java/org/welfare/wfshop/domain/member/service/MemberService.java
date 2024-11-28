/*
package org.welfare.wfshop.domain.member.service;

import org.springframework.stereotype.Service;
import org.welfare.wfshop.domain.member.entity.Member;
import org.welfare.wfshop.domain.member.repository.MemberRepository;

@Service
public class MemberService {

        private final MemberRepository memberRepository;

        public MemberService(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
        }

    public Member login(String username, String password) {
        // 사용자 조회
        Member user = memberRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("Invalid username or password"));

        // 비밀번호 검증 (여기서는 단순 비교, 실제로는 암호화된 비밀번호를 비교해야 함)
        if (!user.getPwd().equals(password)) {
            throw new IllegalArgumentException("Invalid username or password");
        }

        return user; // 인증 성공 시 사용자 정보 반환
    }

}
*/
