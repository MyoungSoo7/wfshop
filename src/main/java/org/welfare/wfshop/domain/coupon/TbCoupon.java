package org.welfare.wfshop.domain.coupon;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_coupon",
        indexes = {
                @Index(name = "ix_tb_coupon_code", columnList = "code"),
                @Index(name = "idx_isUsed", columnList = "isUsed"),
                @Index(name = "idx_expiredType", columnList = "expiredType")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 쿠폰 고유 식별자 (Primary Key)

    @OneToMany(mappedBy = "coupon", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TbCouponDetail> couponDetails; // 쿠폰 발급/사용 이력

    @Column(name = "code", length = 50, nullable = false)
    private String code; // 쿠폰 코드

    @Column(name = "name", length = 200, nullable = false)
    private String name; // 쿠폰 이름

    @Column(name = "type", length = 1, nullable = false)
    private String type; // 쿠폰 형태 (O: 온라인, F: 오프라인, M: 마켓, G: 등급)

    @Column(name = "saleType", length = 1, nullable = false)
    private String saleType; // 할인 종류 (P: 퍼센트, A: 금액)

    @Column(name = "isUsed", length = 1, nullable = false)
    private String isUsed; // 발급 가능 여부 (Y: 가능, N: 불가능)

    @Column(name = "expiredType", length = 1, nullable = false)
    private String expiredType; // 만료 형태 (E: 무제한, S: 날짜 지정, D: 발급일 기준)

    @Column(name = "expiredStartDate", length = 30)
    private String expiredStartDate; // 만료 시작일

    @Column(name = "expiredEndDate", length = 30)
    private String expiredEndDate; // 만료 종료일

    @Column(name = "expiredDate", length = 10)
    private String expiredDate; // 발급일로부터 사용 가능 기간 (일 단위)

    @Column(name = "salePrice", length = 50)
    private String salePrice; // 금액 할인 시 할인 금액

    @Column(name = "salePercent", length = 50)
    private String salePercent; // 퍼센트 할인 시 할인 퍼센트

    @Column(name = "salePercentMax", length = 50)
    private String salePercentMax; // 퍼센트 할인 시 최대 할인 금액

    @Column(name = "useMinPrice", length = 50)
    private String useMinPrice; // 사용 가능 최소 금액

    @Column(name = "useTargetType", length = 1, nullable = false)
    private String useTargetType; // 사용 대상 유형 (A: 전체, M: 회원, J: 직업, N: 없음)

    @Column(name = "useTarget", columnDefinition = "LONGTEXT")
    private String useTarget; // 사용 가능 대상 (회원 ID 또는 직업 형태)

    @Column(name = "maxIssuedCount", length = 50)
    private String maxIssuedCount; // 최대 발급 수 (0: 무제한)

    @Column(name = "issuedCount", columnDefinition = "INT DEFAULT 0")
    private Integer issuedCount; // 발급된 수량

    @Column(name = "usedCount", columnDefinition = "INT DEFAULT 0")
    private Integer usedCount; // 사용된 수량

    @Column(name = "isDuplicated", length = 1)
    private String isDuplicated; // 중복 발급 가능 여부 (Y: 가능, N: 불가능)

    @Column(name = "offLineProgramType", length = 1)
    private String offLineProgramType; // 오프라인 프로그램 유형 (A: 전체, T: 대상)

    @Column(name = "offlineProgramList", columnDefinition = "LONGTEXT")
    private String offlineProgramList; // 오프라인 강의 ID 목록

    @Column(name = "onlineProgramType", length = 1)
    private String onlineProgramType; // 온라인 프로그램 유형 (A: 전체, T: 대상)

    @Column(name = "onlineProgramList", columnDefinition = "LONGTEXT")
    private String onlineProgramList; // 온라인 강의 ID 목록

    @Column(name = "promotionType", length = 1)
    private String promotionType; // 프로모션 유형 (A: 전체, T: 대상)

    @Column(name = "promotionList", columnDefinition = "LONGTEXT")
    private String promotionList; // 프로모션 ID 목록

    @Column(name = "marketType", length = 1)
    private String marketType; // 마켓 유형 (A: 전체, T: 대상)

    @Column(name = "marketList", columnDefinition = "LONGTEXT")
    private String marketList; // 마켓 ID 목록

    @Column(name = "isView", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'Y'")
    private String isView; // 노출 여부 (Y: 노출, N: 비노출)

    @Column(name = "isDel", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String isDel; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "regDate", nullable = false)
    private LocalDateTime regDate; // 등록일

    @Column(name = "modDate")
    private LocalDateTime modDate; // 수정일


}
