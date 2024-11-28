package org.welfare.wfshop.entity.manufacturer;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_manufacturer",
        indexes = {
                @Index(name = "idx_manufacturer_no", columnList = "manufacturer_no"),
                @Index(name = "idx_use_yn", columnList = "use_yn")
        } )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스'")
    private Integer seq;

    @Column(name = "sort", nullable = false, columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;

    @Column(name = "manufacturer_no", nullable = false, length = 30, columnDefinition = "VARCHAR(30) COMMENT '제조사 번호'")
    private String manufacturerNo;

    @Column(name = "manufacturer_name", nullable = false, length = 100, columnDefinition = "VARCHAR(100) COMMENT '제조사 이름'")
    private String manufacturerName;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "use_yn", nullable = false, length = 2, columnDefinition = "CHAR(2) COMMENT '사용 여부 (Y/N)'")
    private String useYn;

    @Column(name = "delete_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '삭제 여부 (Y/N)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제일'")
    private LocalDateTime deleteDate;
}
