package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SPRING_SESSION_ATTRIBUTES")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class SpringSessionAttributes {

    @Id
    @Column(name = "SESSION_PRIMARY_ID", nullable = false, length = 36, columnDefinition = "CHAR(36) COMMENT 'SPRING_SESSION 테이블의 PRIMARY_ID를 참조하는 세션 고유 ID'")
    private String sessionPrimaryId;

    @Column(name = "ATTRIBUTE_NAME", nullable = false, length = 200, columnDefinition = "VARCHAR(200) COMMENT '세션에 저장된 속성의 이름(키)'")
    private String attributeName;

    @Lob
    @Column(name = "ATTRIBUTE_BYTES", nullable = false, columnDefinition = "BLOB COMMENT '세션 속성의 값을 직렬화된 바이너리 데이터로 저장'")
    private byte attributeBytes;
}
