package org.welfare.wfshop.domain.biztalk;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_biztalk_token",
        indexes = {
                @Index(name = "idx_expire_date", columnList = "expire_date")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BiztalkToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT COMMENT '비즈톡 시퀀스'")
    private Long id;

    @Column(name = "token", nullable = false, length = 255, columnDefinition = "VARCHAR(255) COMMENT '비즈톡 토큰정보 (24시간 유효)'")
    private String token;

    @Column(name = "reg_date", nullable = false, columnDefinition = "DATETIME COMMENT '등록 시간'")
    private LocalDateTime regDate;

    @Column(name = "expire_date", nullable = false, columnDefinition = "DATETIME COMMENT '토큰 만료 시간'")
    private LocalDateTime expireDate;

    @Column(name = "status", length = 50, columnDefinition = "VARCHAR(50) DEFAULT '유효' COMMENT '토큰 상태 (예: 유효, 만료, 비활성화)'")
    private String status;

    @Column(name = "updated_date", columnDefinition = "DATETIME DEFAULT NULL COMMENT '토큰 수정 시간'")
    private LocalDateTime updatedDate;

    @Column(name = "created_by", length = 100, columnDefinition = "VARCHAR(100) DEFAULT NULL COMMENT '토큰 생성자 정보 (관리자 ID 또는 시스템 이름)'")
    private String createdBy;
}
