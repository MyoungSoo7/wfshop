package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_best_product_sort",
        indexes = {
                @Index(name = "ix_tb_best_product_scateid", columnList = "category_id"),
                @Index(name = "tb_best_product_sort_product_code_IDX", columnList = "product_code, use_yn, delete_yn"),
                @Index(name = "tb_best_product_sort_product_code", columnList = "product_code")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BestProductSort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스'")
    private Integer seq;

    @Column(name = "category_id", nullable = false, columnDefinition = "INT COMMENT '카테고리 ID'")
    private Integer categoryId;

    @Column(name = "product_code", nullable = false, length = 30, columnDefinition = "VARCHAR(30) COMMENT '상품 번호'")
    private String productCode;

    @Column(name = "product_name", nullable = false, length = 300, columnDefinition = "VARCHAR(300) COMMENT '상품명'")
    private String productName;

    @Column(name = "sort", columnDefinition = "INT COMMENT '카테고리 내 상품 정렬 순서'")
    private Integer sort;

    @Column(name = "use_yn", nullable = false, length = 2, columnDefinition = "CHAR(2) COMMENT '사용여부'")
    private String useYn;

    @Column(name = "delete_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '삭제여부'")
    private String deleteYn;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '등록일시'")
    private LocalDateTime regDate;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제일시'")
    private LocalDateTime deleteDate;
}
