package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_grade_coupon_bridge", indexes = {
        @Index(name = "idx_grade_id", columnList = "grade_id"),
        @Index(name = "idx_coupon_seq", columnList = "coupon_seq")
})
@IdClass(TbGradeCouponBridgeId.class) // 복합 키 클래스 지정
public class TbGradeCouponBridge {

    @Id
    @Column(name = "grade_id", length = 20, nullable = false)
    private String gradeId; // 등급 아이디

    @Id
    @Column(name = "coupon_seq", nullable = false)
    private Integer couponSeq; // 쿠폰 시퀀스
}

