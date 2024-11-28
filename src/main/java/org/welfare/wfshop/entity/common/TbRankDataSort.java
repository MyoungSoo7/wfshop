package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_rank_data_sort", indexes = {
        @Index(name = "tb_best_product_sort_product_code_IDX", columnList = "data_code, use_yn, delete_yn"),
        @Index(name = "idx_data_code", columnList = "data_code"),
        @Index(name = "idx_sort", columnList = "sort"),
        @Index(name = "idx_use_yn", columnList = "use_yn"),
        @Index(name = "idx_delete_yn", columnList = "delete_yn")
})
public class TbRankDataSort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "data_code", length = 30, nullable = false)
    private String dataCode;

    @Column(name = "data_name", length = 300, nullable = false)
    private String dataName;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "use_yn", length = 2, nullable = false)
    private String useYn;

    @Column(name = "delete_yn", length = 2)
    private String deleteYn;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regDate;

    @Column(name = "delete_date")
    private LocalDateTime deleteDate;
}
