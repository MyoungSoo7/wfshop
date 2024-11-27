package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_common_code_detail",
        indexes = {
                @Index(name = "fk_tb_common_code_detail_code_tb_common_code_code", columnList = "code"),
                @Index(name = "ix_tb_common_code_detail_sub_code", columnList = "sub_code")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCommonCodeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '세부 코드'")
    private String subCode;

    @ManyToOne
    @JoinColumn(name = "code", nullable = false, columnDefinition = "VARCHAR(6) COMMENT '공통 코드 (tb_common_code 테이블 참조)'")
    private TbCommonCode commonCode;

    @Column(name = "code_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '세부 코드 이름'")
    private String codeName;

    @Column(name = "code_description", length = 100, columnDefinition = "VARCHAR(100) COMMENT '세부 코드 설명'")
    private String codeDescription;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;
}
