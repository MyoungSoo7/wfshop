package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_grade_coupon_issuance_history", indexes = {
        @Index(name = "idx_grade_id", columnList = "grade_id"),
        @Index(name = "idx_coupon_seq", columnList = "coupon_seq"),
        @Index(name = "idx_member_no", columnList = "member_no")
})
@IdClass(TbGradeCouponIssuanceHistoryId.class) // 복합 키 클래스 지정
public class TbGradeCouponIssuanceHistory {

    @Id
    @Column(name = "grade_id", nullable = false, length = 20)
    private String gradeId; // 등급 아이디

    @Id
    @Column(name = "coupon_seq", nullable = false)
    private Integer couponSeq; // 쿠폰 시퀀스

    @Id
    @Column(name = "member_no", nullable = false, length = 50)
    private String memberNo; // 회원 번호

    @Id
    @Column(name = "issuance_monthly", nullable = false, length = 6)
    private String issuanceMonthly; // 발급 년/월

    @Column(name = "issuance_date")
    private java.time.LocalDateTime issuanceDate; // 발급 날짜

    @Column(name = "coupon_name", length = 200)
    private String couponName; // 쿠폰 이름
}
