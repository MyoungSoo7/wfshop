package org.welfare.wfshop.entity.member;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_member_address",

        indexes = {
                @Index(name = "idx_member_no", columnList = "member_no")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "member_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) DEFAULT '0' COMMENT '회원 고유 번호'")
    private String memberNo;

    @Column(name = "address_name", length = 200, columnDefinition = "VARCHAR(200) COMMENT '주소 이름 (예: 집, 회사 등)'")
    private String addressName;

    @Column(name = "recipient_name", length = 200, columnDefinition = "VARCHAR(200) COMMENT '수령인 이름'")
    private String recipientName;

    @Column(name = "recipient_ph", length = 20, nullable = false, columnDefinition = "VARCHAR(20) DEFAULT '0' COMMENT '휴대폰 번호'")
    private String recipientPh;

    @Column(name = "recipient_tel", length = 20, columnDefinition = "VARCHAR(20) DEFAULT '0' COMMENT '전화번호 (필수 아님)'")
    private String recipientTel;

    @Column(name = "recipient_postcode", length = 10, nullable = false, columnDefinition = "VARCHAR(10) DEFAULT '0' COMMENT '우편번호'")
    private String recipientPostcode;

    @Column(name = "recipient_address", length = 200, nullable = false, columnDefinition = "VARCHAR(200) DEFAULT '0' COMMENT '기본 주소'")
    private String recipientAddress;

    @Column(name = "recipient_detail_address", length = 200, columnDefinition = "VARCHAR(200) COMMENT '상세 주소'")
    private String recipientDetailAddress;

    @Column(name = "basic_yn", length = 2, nullable = false, columnDefinition = "CHAR(2) DEFAULT '0' COMMENT '기본 배송지 설정 여부 (Y/N)'")
    private String basicYn;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP DEFAULT '0000-00-00 00:00:00' COMMENT '등록일'")
    private LocalDateTime regDate;
}
