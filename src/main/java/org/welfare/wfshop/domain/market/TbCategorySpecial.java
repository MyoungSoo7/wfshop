package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_category_special")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCategorySpecial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_special_id", nullable = false, columnDefinition = "INT COMMENT '특수 카테고리 ID (Primary Key)'")
    private Integer categorySpecialId;

    @Column(name = "name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '특수 카테고리 이름'")
    private String name;

    @Column(name = "is_view", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '노출 여부 (Y: 노출, N: 비노출)'")
    private String isView;

    @Column(name = "is_sort_view", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '진열 관리 노출 여부 (Y: 노출, N: 비노출)'")
    private String isSortView;

    @Column(name = "sort", columnDefinition = "INT COMMENT '진열 관리 순번'")
    private Integer sort;

    @Column(name = "is_del", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '삭제 여부 (N: 사용, Y: 삭제)'")
    private String isDel;

    @Column(name = "reg_date", columnDefinition = "DATETIME COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "display_seq", columnDefinition = "INT COMMENT '표시 순서'")
    private Integer displaySeq;

    @Column(name = "depth", columnDefinition = "INT COMMENT '카테고리 깊이'")
    private Integer depth;
}
