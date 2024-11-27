package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_category",
        indexes = {
                @Index(name = "idx_category_product_id", columnList = "product_id"),
                @Index(name = "idx_tb_category_sort", columnList = "sort"),
                @Index(name = "idx_tb_category_parent_id", columnList = "parent_id"),
                @Index(name = "idx_tb_category_is_view", columnList = "is_view, is_del"),
                @Index(name = "idx_tb_category_category_id", columnList = "category_id")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false, columnDefinition = "INT COMMENT '카테고리 고유 ID (Primary Key)'")
    private Integer categoryId;

    @Column(name = "parent_id", columnDefinition = "INT COMMENT '부모 카테고리 ID (상위 카테고리)'")
    private Integer parentId;

    @Column(name = "name", length = 200, columnDefinition = "VARCHAR(200) COMMENT '카테고리 이름'")
    private String name;

    @Column(name = "display_seq", columnDefinition = "INT COMMENT '카테고리 표시 순서'")
    private Integer displaySeq;

    @Column(name = "depth", columnDefinition = "INT COMMENT '카테고리 깊이 (0: 최상위, 1: 1단계 하위 등)'")
    private Integer depth;

    @Column(name = "is_view", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '카테고리 노출 여부 (Y: 노출, N: 비노출)'")
    private String isView;

    @Column(name = "is_sort_view", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '진열 관리 노출 여부 (Y: 노출, N: 비노출)'")
    private String isSortView;

    @Column(name = "sort", columnDefinition = "INT COMMENT '진열 관리 순번'")
    private Integer sort;

    @Column(name = "is_del", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '삭제 여부 (N: 사용, Y: 삭제)'")
    private String isDel;

    @Column(name = "reg_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블의 product_id와 연관)'")
    private Integer productId;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_category_product_id"))
    private Market market; // tb_market 테이블과 연관 관계
}

