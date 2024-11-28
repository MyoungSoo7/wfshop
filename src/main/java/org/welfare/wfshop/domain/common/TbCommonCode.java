package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_common_code",
        indexes = {
                @Index(name = "ix_tb_common_code_code_name", columnList = "code_name")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbCommonCode {

    @Id
    @Column(name = "code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '공통 코드 (Primary Key)'")
    private String code;

    @Column(name = "code_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '공통 코드 이름'")
    private String codeName;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "code_description", length = 100, columnDefinition = "VARCHAR(100) COMMENT '공통 코드 설명'")
    private String codeDescription;

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;
}
