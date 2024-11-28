package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_coupon_detail",
        indexes = {
                @Index(name = "idx_couponSeq", columnList = "couponSeq"),
                @Index(name = "idx_code", columnList = "code"),
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_isDel", columnList = "isDel")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCouponDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 쿠폰 이력 고유 식별자 (Primary Key)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "couponSeq", nullable = false)
    private TbCoupon coupon; // 쿠폰 고유 식별자 (tb_coupon.seq)

    @Column(name = "code", length = 50, nullable = false)
    private String code; // 쿠폰 코드

    @Column(name = "member_no", length = 20)
    private String memberNo; // 회원 번호

    @Column(name = "expiredType", length = 1, nullable = false)
    private String expiredType; // 만료 형태 (E: 무제한, S: 날짜 지정, D: 발급일 기준)

    @Column(name = "expiredStartDate", length = 30)
    private String expiredStartDate; // 만료 시작일

    @Column(name = "expiredEndDate", length = 30)
    private String expiredEndDate; // 만료 종료일

    @Column(name = "expiredDate", length = 10)
    private String expiredDate; // 발급일로부터 사용 가능 기간 (일 단위)

    @Column(name = "isDuplicated", length = 1)
    private String isDuplicated; // 중복 발급 가능 여부 (Y: 가능, N: 불가능)

    @Column(name = "reg_date")
    private LocalDateTime regDate; // 발급일

    @Column(name = "used_date")
    private LocalDateTime usedDate; // 사용일 (NULL: 미사용)

    @Column(name = "isDel", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String isDel; // 삭제 여부 (Y: 삭제, N: 미삭제)

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

    @Column(name = "delYn", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String delYn; // 삭제 여부 (Y: 삭제, N: 미삭제)
}
