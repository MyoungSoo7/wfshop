package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_authority",
        indexes = {}
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Authority {

    @Id
    @Column(name = "authority_code", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '권한 코드'")
    private String authorityCode;

    @Column(name = "authority_level", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '권한 레벨'")
    private String authorityLevel;

    @Column(name = "description", length = 255, columnDefinition = "VARCHAR(255) COMMENT '권한 설명'")
    private String description;
}

