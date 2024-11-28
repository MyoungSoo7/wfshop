package org.welfare.wfshop.domain.member.dto;

import lombok.*;
import org.welfare.wfshop.domain.member.entity.Member;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequestDto {

    private String memberNo; // 회원 고유 번호
    private String memberType; // 회원 종류
    private String memberGroup; // 회원 그룹
    private String appUserKey; // 앱 사용자 키
    private String id; // 회원 아이디
    private String pwd; // 회원 비밀번호
    private String name; // 회원 이름
    private String enName; // 회원 이름 (영문)
    private String mail; // 회원 이메일
    private String mobileNo; // 회원 휴대폰 번호
    private String phoneNo; // 회원 전화번호
    private String birth; // 회원 생년월일
    private String gender; // 회원 성별
    private String licenseType; // 보유 자격 및 면허 종류
    private String licenseObtainDate; // 면허 취득 날짜
    private String privacyInfoYn; // 개인정보 동의 여부
    private String termsServiceYn; // 서비스 약관 동의 여부
    private String locationBaseServiceYn; // 위치 기반 서비스 동의 여부
    private String promotionServiceYn; // 프로모션 서비스 동의 여부
    private String interestProductCode; // 관심 상품 코드
    private String joinPathCode; // 가입 경로 코드
    private String joinPathEtc; // 가입 경로 기타
    private LocalDateTime loginDate; // 최근 로그인 날짜
    private Member.Status status; // 회원 상태
    private String existingYn; // 인증 여부
    private LocalDateTime existingDate; // 인증 처리 날짜

    private WorkplaceDto workplace; // 직장 정보

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class WorkplaceDto {
        private String officeName; // 직장명
        private AddressDto officeAddress; // 직장 주소
        private AddressDto workplaceAddress; // 사업장 주소
        private String workplacePhoneNo; // 사업장 전화번호
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

