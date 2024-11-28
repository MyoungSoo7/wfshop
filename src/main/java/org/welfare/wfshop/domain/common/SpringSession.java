package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "SPRING_SESSION",
        indexes = {
                @Index(name = "SPRING_SESSION_IX2", columnList = "EXPIRY_TIME"),
                @Index(name = "SPRING_SESSION_IX3", columnList = "PRINCIPAL_NAME")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class SpringSession {

    @Id
    @Column(name = "PRIMARY_ID", nullable = false, length = 36, columnDefinition = "CHAR(36) COMMENT '세션의 고유 식별자 (UUID 형식, Primary Key)'")
    private String primaryId;

    @Column(name = "SESSION_ID", nullable = false, length = 36, columnDefinition = "CHAR(36) COMMENT 'HTTP 세션의 ID (UUID 형식, 고유해야 함)'")
    private String sessionId;

    @Column(name = "CREATION_TIME", nullable = false, columnDefinition = "BIGINT COMMENT '세션이 생성된 시간 (Unix 타임스탬프, 밀리초 단위)'")
    private Long creationTime;

    @Column(name = "LAST_ACCESS_TIME", nullable = false, columnDefinition = "BIGINT COMMENT '세션에 마지막으로 접근한 시간 (Unix 타임스탬프, 밀리초 단위)'")
    private Long lastAccessTime;

    @Column(name = "MAX_INACTIVE_INTERVAL", nullable = false, columnDefinition = "INT COMMENT '세션의 최대 비활성화 시간 (초 단위, 이 시간이 지나면 세션 만료)'")
    private Integer maxInactiveInterval;

    @Column(name = "EXPIRY_TIME", nullable = false, columnDefinition = "BIGINT COMMENT '세션이 만료되는 시간 (Unix 타임스탬프, 밀리초 단위)'")
    private Long expiryTime;

    @Column(name = "PRINCIPAL_NAME", length = 100, columnDefinition = "VARCHAR(100) COMMENT '세션과 연결된 사용자 이름 (로그인한 사용자 정보)'")
    private String principalName;
}
