package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_market_promotion",
        indexes = {
                @Index(name = "idx_product_id", columnList = "product_id"),
                @Index(name = "idx_category_id", columnList = "category_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketPromotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotion_id", nullable = false, columnDefinition = "INT COMMENT '프로모션 ID (Primary Key)'")
    private Integer promotionId;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블 참조)'")
    private Integer productId;

    @Column(name = "category_id", columnDefinition = "INT COMMENT '카테고리 ID'")
    private Integer categoryId;

    @Column(name = "start_date", columnDefinition = "DATE COMMENT '프로모션 시작일'")
    private LocalDate startDate;

    @Column(name = "end_date", columnDefinition = "DATE COMMENT '프로모션 종료일'")
    private LocalDate endDate;

    @Column(name = "is_view", length = 50, columnDefinition = "VARCHAR(50) COMMENT '프로모션 노출 여부 (Y/N)'")
    private String isView;

    @Column(name = "my_index", columnDefinition = "INT COMMENT '상품 순서'")
    private Integer myIndex;

    @Column(name = "reg_date", columnDefinition = "DATE COMMENT '프로모션 상품 등록일'")
    private LocalDate regDate;
}
