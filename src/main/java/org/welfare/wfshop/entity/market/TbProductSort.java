package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_product_sort", indexes = {
        @Index(name = "tb_product_sort_product_code_IDX", columnList = "product_code, use_yn, delete_yn"),
        @Index(name = "idx_sort", columnList = "sort"),
        @Index(name = "idx_use_yn", columnList = "use_yn"),
        @Index(name = "idx_delete_yn", columnList = "delete_yn")
})
public class TbProductSort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "product_code", length = 30, nullable = false)
    private String productCode;

    @Column(name = "product_name", length = 300, nullable = false)
    private String productName;

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
