package org.welfare.wfshop.entity.common;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "tb_common_code",
        indexes = {
                @Index(name = "ix_tb_common_code_code_name", columnList = "code_name")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CommonCode {

    @Id
    @Column(name = "code", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '공통 코드 (Primary Key)'")
    private String code; // 공통 코드 (Primary Key)

    @Column(name = "code_name", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '공통 코드 이름'")
    private String codeName; // 공통 코드 이름

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate; // 등록일

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "code_description", length = 100, columnDefinition = "VARCHAR(100) COMMENT '공통 코드 설명'")
    private String codeDescription; // 공통 코드 설명

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort; // 정렬 순서

    // 1:다 관계 설정
    @OneToMany(mappedBy = "commonCode", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<CommonCodeDetail> details = new ArrayList<>(); // 공통 코드 상세 리스트

    // 연관 관계 편의 메서드
    public void addDetail(CommonCodeDetail detail) {
        details.add(detail);
        detail.setCommonCode(this);
    }

    public void removeDetail(CommonCodeDetail detail) {
        details.remove(detail);
        detail.setCommonCode(null);
    }
}
