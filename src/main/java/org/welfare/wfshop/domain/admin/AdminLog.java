package org.welfare.wfshop.domain.admin;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_admin_log",
        indexes = {
                @Index(name = "idx_admin_no", columnList = "admin_no"),
                @Index(name = "idx_login_date", columnList = "login_date")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class AdminLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '접속 이력 고유 번호 (Primary Key)'")
    private Integer seq;

    @Column(name = "admin_no", nullable = false, length = 15, columnDefinition = "VARCHAR(15) COMMENT '관리자 고유 번호 (tb_admin.admin_no 참조)'")
    private String adminNo;

    @Column(name = "id", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '관리자 아이디 (tb_admin.id 참조)'")
    private String id;

    @Column(name = "ip", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '관리자 접속 IP 주소 (IPv4 또는 IPv6)'")
    private String ip;

    @Column(name = "login_date", nullable = false, columnDefinition = "DATETIME COMMENT '관리자 접속 일시'")
    private LocalDateTime loginDate;

    @Column(name = "logout_date", columnDefinition = "DATETIME NULL COMMENT '관리자 로그아웃 일시'")
    private LocalDateTime logoutDate;

    @Column(name = "user_agent", length = 255, columnDefinition = "VARCHAR(255) COMMENT '접속한 브라우저 또는 디바이스 정보'")
    private String userAgent;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('SUCCESS', 'FAIL') DEFAULT 'SUCCESS' COMMENT '로그인 성공 여부'")
    private LoginStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "admin_no",
            referencedColumnName = "admin_no",
            insertable = false,
            updatable = false,
            foreignKey = @ForeignKey(name = "fk_admin_no")
    )
    private Admin admin;
}

