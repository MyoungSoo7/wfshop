package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_relativeproduct",
        indexes = {
                @Index(name = "idx_product_id", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketRelativeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tb_market_relativeproduct_pk", nullable = false, columnDefinition = "INT COMMENT '기본키 (Primary Key)'")
    private Integer id;

    @Column(name = "relativeproduct_id", nullable = false, columnDefinition = "INT COMMENT '관련 상품 ID'")
    private Integer relativeProductId;

    @Column(name = "relativeproduct_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) DEFAULT '0' COMMENT '관련 상품 이름'")
    private String relativeProductName;

    @Column(name = "product_id", nullable = false, columnDefinition = "INT DEFAULT 0 COMMENT '상품 ID (tb_market 테이블 참조)'")
    private Integer productId;
}
