package org.welfare.wfshop.entity.member;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_member_existing",
        indexes = {
                @Index(name = "idx_member_id", columnList = "member_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberExisting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer idx;

    @Column(name = "member_id", length = 45, columnDefinition = "VARCHAR(45) COMMENT '회원 ID'")
    private String memberId;

    @Column(name = "existing_yn", length = 1, columnDefinition = "VARCHAR(1) COMMENT 'Y: 인증 필요, N: 인증 완료된 회원'")
    private String existingYn;

    @Column(name = "existing_date", columnDefinition = "DATETIME COMMENT '인증 처리 날짜'")
    private LocalDateTime existingDate;
}
