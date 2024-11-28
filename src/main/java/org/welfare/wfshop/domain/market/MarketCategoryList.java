package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_market_categorylist",
        indexes = {
                @Index(name = "ix_tb_market_catelist_pid", columnList = "product_id"),
                @Index(name = "ix_tb_market_categorylist_cid", columnList = "category1_id"),
                @Index(name = "tb_market_categorylist_category2_id_IDX", columnList = "category2_id"),
                @Index(name = "category3_id", columnList = "category3_id"),
                @Index(name = "category4_id", columnList = "category4_id"),
                @Index(name = "category5_id", columnList = "category5_id")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarketCategoryList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorylist_id", nullable = false, columnDefinition = "BIGINT COMMENT '카테고리 리스트 고유 ID (Primary Key)'")
    private Long categoryListId;

    @Column(name = "category1_id", nullable = false, columnDefinition = "INT COMMENT '1차 카테고리 ID'")
    private Integer category1Id;

    @Column(name = "category1_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '1차 카테고리 이름'")
    private String category1Name;

    @Column(name = "category2_id", columnDefinition = "INT COMMENT '2차 카테고리 ID'")
    private Integer category2Id;

    @Column(name = "category2_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '2차 카테고리 이름'")
    private String category2Name;

    @Column(name = "category3_id", columnDefinition = "INT DEFAULT 0 COMMENT '3차 카테고리 ID (기본값: 0)'")
    private Integer category3Id;

    @Column(name = "category3_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '3차 카테고리 이름'")
    private String category3Name;

    @Column(name = "category4_id", columnDefinition = "INT DEFAULT 0 COMMENT '4차 카테고리 ID (기본값: 0)'")
    private Integer category4Id;

    @Column(name = "category4_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '4차 카테고리 이름'")
    private String category4Name;

    @Column(name = "category5_id", columnDefinition = "INT DEFAULT 0 COMMENT '5차 카테고리 ID (기본값: 0)'")
    private Integer category5Id;

    @Column(name = "category5_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '5차 카테고리 이름'")
    private String category5Name;

    @Column(name = "product_code", length = 255, columnDefinition = "VARCHAR(255) COMMENT '상품 코드 (고유 식별자)'")
    private String productCode;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블의 product_id와 연관)'")
    private Integer productId;
}
