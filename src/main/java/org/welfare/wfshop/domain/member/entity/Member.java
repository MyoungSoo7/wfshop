package org.welfare.wfshop.domain.member.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(
        name = "tb_member",
        indexes = {
                @Index(name = "idx_name", columnList = "name"),
                @Index(name = "idx_id", columnList = "id"),
                @Index(name = "idx_mail", columnList = "mail"),
                @Index(name = "idx_mobile_no", columnList = "mobile_no")
        }
)
public class Member {

    @Id
    @Column(name = "member_no", length = 20, nullable = false, unique = true, columnDefinition = "VARCHAR(20) COMMENT '회원 고유 번호 (Primary Key)'")
    private String memberNo;

    @Column(name = "member_type", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '회원 종류 (일반회원/카카오 간편 로그인 등)'")
    private String memberType;

    @Column(name = "member_group", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '회원 그룹 (기업회원, 일반회원, 자문의 등)'")
    private String memberGroup;

    @Column(name = "app_user_key", length = 200, columnDefinition = "VARCHAR(200) COMMENT '앱 사용자 키 (외부 연동용)'")
    private String appUserKey;

    @Column(name = "id", length = 50, nullable = false, unique = true, columnDefinition =  "VARCHAR(50) COMMENT '회원 아이디'")
    private String id;

    @Column(name = "pwd", length = 128, nullable = false, columnDefinition = "VARCHAR(128) COMMENT '회원 비밀번호 (암호화 저장)'")
    private String pwd;

    @Column(name = "name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '회원 이름'")
    private String name;

    @Column(name = "en_name", length = 50, columnDefinition =  "VARCHAR(50) COMMENT '회원 이름 (영문)'")
    private String enName;

    @Column(name = "mail", length = 100, columnDefinition = "VARCHAR(100) COMMENT '회원 이메일'")
    private String mail;

    @Column(name = "mobile_no", length = 30, columnDefinition = "VARCHAR(30) COMMENT '회원 휴대폰 번호'")
    private String mobileNo;

    @Column(name = "phone_no", length = 30, columnDefinition = "VARCHAR(30) COMMENT '회원 전화번호'")
    private String phoneNo;

    @Column(name = "birth", length = 8, columnDefinition = "VARCHAR(8) COMMENT '회원 생년월일 (YYYYMMDD 형식)'")
    private String birth;

    @Column(name = "gender", length = 6, columnDefinition = "VARCHAR(6) COMMENT '회원 성별 (코드값: G0100x)'")
    private String gender;

    @Column(name = "license_type", length = 6, columnDefinition = "VARCHAR(6) COMMENT '보유 자격 및 면허 종류'")
    private String licenseType;

    @Column(name = "license_obtain_date", length = 10, columnDefinition = "VARCHAR(10) COMMENT '면허 취득 날짜 (YYYY-MM-DD 형식)'")
    private String licenseObtainDate;

    @Column(name = "privacy_info_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String privacyInfoYn;

    @Column(name = "terms_service_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String termsServiceYn;

    @Column(name = "location_base_service_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String locationBaseServiceYn;

    @Column(name = "promotion_service_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String promotionServiceYn;

    @Column(name = "interest_product_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '관심 상품 코드 (L0100x)'")
    private String interestProductCode;

    @Column(name = "join_path_code", length = 6, columnDefinition =  "VARCHAR(6) COMMENT '가입 경로 코드 (J0300x)'")
    private String joinPathCode;

    @Column(name = "join_path_etc", length = 100, columnDefinition = "VARCHAR(100) COMMENT '가입 경로 기타 (영업사원 이름 등)'")
    private String joinPathEtc;

    @Column(name = "login_date", columnDefinition = "DATETIME COMMENT '최근 로그인 날짜'")
    private LocalDateTime loginDate;

    @Embedded
    private Workplace workplace;

    @Embeddable
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Workplace {

        @Column(name = "office_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '직장명'")
        private String officeName;

        @Embedded
        private Address officeAddress;

        @Embedded
        @AttributeOverrides({
                @AttributeOverride(name = "postcode", column = @Column(name = "workplace_postcode")),
                @AttributeOverride(name = "address", column = @Column(name = "workplace_address")),
                @AttributeOverride(name = "detailAddress", column = @Column(name = "workplace_detail_address"))
        })
        private Address workplaceAddress;

        @Column(name = "workplace_phone_no", length = 30, columnDefinition = "VARCHAR(30) COMMENT '사업장 전화번호'")
        private String workplacePhoneNo;
    }

    @Embeddable
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Address {
        @Column(name = "postcode", length = 6, columnDefinition = "VARCHAR(6) COMMENT '우편번호'")
        private String postcode;

        @Column(name = "address", length = 200, columnDefinition = "VARCHAR(200) COMMENT '주소'")
        private String address;

        @Column(name = "detail_address", length = 200, columnDefinition = "VARCHAR(200) COMMENT '상세 주소'")
        private String detailAddress;
    }
}