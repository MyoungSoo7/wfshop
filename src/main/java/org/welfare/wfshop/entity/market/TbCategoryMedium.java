package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_category_medium",
        indexes = {
                @Index(name = "idx_tb_category_medium_top_category_code", columnList = "top_category_code")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCategoryMedium {

    @Id
    @Column(name = "medium_category_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '중분류 카테고리 코드 (Primary Key)'")
    private String mediumCategoryCode;

    @Column(name = "top_category_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '상위 카테고리 코드 (tb_category_top 테이블 참조)'")
    private String topCategoryCode;

    @Column(name = "category_type_code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '카테고리 유형 코드'")
    private String categoryTypeCode;

    @Column(name = "medium_category_name", length = 40, nullable = false, columnDefinition = "VARCHAR(40) COMMENT '중분류 카테고리 이름'")
    private String mediumCategoryName;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "reg_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '등록자 번호'")
    private String regNo;

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;

    @Column(name = "modify_no", length = 15, columnDefinition = "VARCHAR(15) COMMENT '수정자 번호'")
    private String modifyNo;

    @Column(name = "mod_date", columnDefinition = "TIMESTAMP NULL COMMENT '수정일'")
    private LocalDateTime modDate;

    @Column(name = "delete_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y: 삭제, N: 사용)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제일'")
    private LocalDateTime deleteDate;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @ManyToOne
    @JoinColumn(name = "top_category_code", referencedColumnName = "top_category_code", insertable = false, updatable = false)
    private TbCategoryTop topCategory;
}

