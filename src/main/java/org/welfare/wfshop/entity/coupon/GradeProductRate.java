package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_grade_product_rate")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(GradeProductRateId.class) // 복합 키 클래스 지정
public class GradeProductRate {

    @Id
    @Column(name = "category", nullable = false, length = 20)
    private String category;

    @Id
    @Column(name = "product_id", nullable = false, length = 20)
    private String productId;

    @Id
    @Column(name = "grade_id", nullable = false, length = 20)
    private String gradeId;

    @Id
    @Column(name = "is_promotion", nullable = false)
    private boolean isPromotion;

    @Column(name = "open_date")
    private LocalDateTime openDate;

    @Column(name = "close_date")
    private LocalDateTime closeDate;

    @Column(name = "grade_rate")
    private Float gradeRate;

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "mod_date")
    private LocalDateTime modDate;
}
