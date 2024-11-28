package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_category_product",
        indexes = {
                @Index(name = "idx_tb_category_product_category_code", columnList = "category_code"),
                @Index(name = "idx_tb_category_product_category_type_code", columnList = "category_type_code"),
                @Index(name = "idx_tb_category_product_product_code", columnList = "product_code")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCategoryProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "product_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '상품 코드'")
    private String productCode;

    @Column(name = "category_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '카테고리 코드'")
    private String categoryCode;

    @Column(name = "category_type_code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '카테고리 유형 코드'")
    private String categoryTypeCode;
}
