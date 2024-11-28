package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_promocategory",
        indexes = {
                @Index(name = "idx_product_id", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketPromoCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "market_promocategory_id", nullable = false, columnDefinition = "INT COMMENT '스페셜 카테고리 ID (Primary Key)'")
    private Integer marketPromoCategoryId;

    @Column(name = "product_id", nullable = false, columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블 참조)'")
    private Integer productId;

    @Column(name = "promocategory_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '스페셜 카테고리 이름'")
    private String promoCategoryName;

    @Column(name = "category_special_id", nullable = false, columnDefinition = "INT DEFAULT 0 COMMENT '스페셜 카테고리 고유 ID'")
    private Integer categorySpecialId;
}
