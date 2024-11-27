package org.welfare.wfshop.entity.admin;
import jakarta.persistence.*;
import lombok.*;
import org.welfare.wfshop.entity.common.Authority;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_admin",
        indexes = {
                @Index(name = "idx_admin_id", columnList = "id"),
                @Index(name = "idx_admin_name", columnList = "name"),
                @Index(name = "idx_authority_code", columnList = "authority_code")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @Column(name = "admin_no", nullable = false, length = 15, columnDefinition = "VARCHAR(15) COMMENT '관리자 고유 번호 (Primary Key)'")
    private String adminNo;

    @Column(name = "id", nullable = false, length = 50, unique = true, columnDefinition = "VARCHAR(50) COMMENT '관리자 아이디 (Unique)'")
    private String id;

    @Column(name = "pwd", nullable = false, length = 128, columnDefinition = "VARCHAR(128) COMMENT '관리자 비밀번호 (암호화된 값)'")
    private String pwd;

    @Column(name = "reg_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '등록 일자'")
    private LocalDateTime regDate;

    @Column(name = "name", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '관리자 이름'")
    private String name;

    @Column(name = "telephone_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '관리자 전화번호'")
    private String telephoneNo;

    @Column(name = "authority_code", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '권한 코드 (예: ROLE_ADMIN)'")
    private String authorityCode;

    @Column(name = "authority_level", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '권한 레벨 (숫자 또는 코드)'")
    private String authorityLevel;

    @Column(name = "login_date", nullable = false, columnDefinition = "DATETIME COMMENT '마지막 로그인 일시'")
    private LocalDateTime loginDate;

    @Column(name = "change_date", columnDefinition = "TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '정보 변경 일자'")
    private LocalDateTime changeDate;

    @Column(name = "delete_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y: 삭제됨, N: 사용 중)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제 처리 일자'")
    private LocalDateTime deleteDate;

    @Column(name = "use_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, columnDefinition = "ENUM('1', '2', '3') COMMENT '관리자 유형 (1=슈퍼 관리자, 2=일반 관리자, 3= etc)'")
    private AdminType type;

    @Column(name = "memo", length = 255, columnDefinition = "VARCHAR(255) COMMENT '관리자 메모 또는 비고'")
    private String memo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "authority_code",
            referencedColumnName = "authority_code",
            insertable = false,
            updatable = false,
            foreignKey = @ForeignKey(name = "fk_authority_code")
    )
    private Authority authority;
}
