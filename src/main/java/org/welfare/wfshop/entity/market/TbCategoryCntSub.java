package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_category_cnt_sub",
        indexes = {
                @Index(name = "idx_tb_category_cnt_sub_parent_id", columnList = "parent_id"),
                @Index(name = "idx_tb_category_cnt_sub_is_view", columnList = "is_view, is_del"),
                @Index(name = "idx_tb_category_cnt_sub_product_id", columnList = "product_id"),
                @Index(name = "idx_tb_category_cnt_sub_category_id", columnList = "category_id")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCategoryCntSub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "parent_id", columnDefinition = "INT COMMENT '부모 카테고리 ID (상위 카테고리)'")
    private Integer parentId;

    @Column(name = "is_view", length = 1, columnDefinition = "CHAR(1) COMMENT '카테고리 노출 여부 (Y: 노출, N: 비노출)'")
    private String isView;

    @Column(name = "is_del", length = 1, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (N: 사용, Y: 삭제)'")
    private String isDel;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블의 product_id와 연관)'")
    private Integer productId;

    @Column(name = "category_id", columnDefinition = "INT COMMENT '카테고리 ID (tb_category 테이블의 category_id와 연관)'")
    private Integer categoryId;

    @Column(name = "COUNT", columnDefinition = "INT DEFAULT 0 COMMENT '카테고리 내 상품 수'")
    private Integer count;
}

