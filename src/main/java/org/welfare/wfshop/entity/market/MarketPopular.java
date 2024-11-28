package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_market_popular",
        indexes = {
                @Index(name = "idx_product_id", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketPopular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "popular_id", nullable = false, columnDefinition = "BIGINT COMMENT '기본키 (Primary Key)'")
    private Long popularId;

    @Column(name = "product_id", columnDefinition = "BIGINT COMMENT '상품 ID (tb_market 테이블 참조)'")
    private Long productId;

    @Column(name = "my_index", columnDefinition = "INT COMMENT '인기 상품 순번'")
    private Integer myIndex;

    @Column(name = "product_thumb", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 이미지'")
    private String productThumb;

    @Column(name = "product_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "reg_date", columnDefinition = "DATE COMMENT '인기 상품 등록일'")
    private LocalDate regDate;

    @Column(name = "is_view", length = 50, columnDefinition = "VARCHAR(50) COMMENT '인기 상품 노출 여부 (Y/N)'")
    private String isView;

    @Column(name = "file_path", length = 50, columnDefinition = "VARCHAR(50) COMMENT '이미지 URL'")
    private String filePath;

    @Column(name = "sort", length = 255, columnDefinition = "VARCHAR(255) COMMENT '정렬 순서'")
    private String sort;
}

