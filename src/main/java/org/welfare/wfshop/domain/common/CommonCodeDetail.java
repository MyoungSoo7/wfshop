package org.welfare.wfshop.domain.common;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_common_code_detail",
        indexes = {
                @Index(name = "ix_tb_common_code_detail_sub_code", columnList = "sub_code")
        }
)
@IdClass(CommonCodeDetailId.class) // 복합 키 클래스 지정
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CommonCodeDetail {

    @Id
    @Column(name = "code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '공통 코드'")
    private String code; // 공통 코드

    @Id
    @Column(name = "sub_code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '세부 코드'")
    private String subCode; // 세부 코드

    @Column(name = "code_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '세부 코드 이름'")
    private String codeName; // 세부 코드 이름

    @Column(name = "code_description", length = 100, columnDefinition = "VARCHAR(100) COMMENT '세부 코드 설명'")
    private String codeDescription; // 세부 코드 설명

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate; // 등록일

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort; // 정렬 순서

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code", referencedColumnName = "code", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_tb_common_code_detail_code_tb_common_code_code"))
    private CommonCode commonCode; // 공통 코드 외래키 참조
}
