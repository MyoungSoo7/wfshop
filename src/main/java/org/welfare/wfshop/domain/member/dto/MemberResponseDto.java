package org.welfare.wfshop.domain.member.dto;

import lombok.*;
import org.welfare.wfshop.domain.member.entity.Member;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponseDto {

    private String memberNo; // 회원 고유 번호
    private String name; // 회원 이름
    private String mail; // 회원 이메일
    private String mobileNo; // 회원 휴대폰 번호
    private String memberType; // 회원 종류
    private String memberGroup; // 회원 그룹
    private LocalDateTime loginDate; // 최근 로그인 날짜
    private Member.Status status; // 회원 상태

    private WorkplaceDto workplace; // 직장 정보

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class WorkplaceDto {
        private String officeName; // 직장명
        private AddressDto workplaceAddress; // 사업장 주소
    }

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AddressDto {
        private String postcode; // 우편번호
        private String address; // 주소
        private String detailAddress; // 상세 주소
    }
}
