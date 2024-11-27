package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shedlock")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Shedlock {

    @Id
    @Column(name = "name", nullable = false, length = 64, columnDefinition = "VARCHAR(64) COMMENT '락의 고유 이름 (Primary Key)'")
    private String name;

    @Column(name = "lock_until", nullable = false, columnDefinition = "TIMESTAMP(3) COMMENT '락이 만료되는 시간 (언제까지 유효한지)'")
    private LocalDateTime lockUntil;

    @Column(name = "locked_at", nullable = false, columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3) COMMENT '락이 생성된 시간 (기본값: 현재 시간)'")
    private LocalDateTime lockedAt;

    @Column(name = "locked_by", nullable = false, length = 255, columnDefinition = "VARCHAR(255) COMMENT '락을 획득한 주체 (서버 이름, IP 등)'")
    private String lockedBy;
}
