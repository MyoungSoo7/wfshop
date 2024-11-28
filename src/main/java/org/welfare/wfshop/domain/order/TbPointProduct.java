package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_point_product", indexes = {
        @Index(name = "idx_name", columnList = "name"),
        @Index(name = "idx_use_yn", columnList = "use_yn"),
        @Index(name = "idx_del_yn", columnList = "del_yn")
})
public class TbPointProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "name", length = 300, nullable = false)
    private String name;

    @Column(name = "pro_view_name", length = 300)
    private String proViewName;

    @Column(name = "bonus", length = 300, nullable = false)
    private String bonus;

    @Column(name = "price", columnDefinition = "INT DEFAULT 0", nullable = false)
    private Integer price;

    @Column(name = "cp_point", columnDefinition = "INT DEFAULT 0")
    private Integer cpPoint;

    @Column(name = "ep_point", columnDefinition = "INT DEFAULT 0")
    private Integer epPoint;

    @Column(name = "use_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y'", nullable = false)
    private String useYn;

    @Column(name = "del_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'", nullable = false)
    private String delYn;

    @Column(name = "memo", length = 255)
    private String memo;

    @Column(name = "display_seq")
    private Integer displaySeq;

    @Column(name = "reg_date_time")
    private LocalDateTime regDateTime;

    @Column(name = "mod_date_time")
    private LocalDateTime modDateTime;
}
