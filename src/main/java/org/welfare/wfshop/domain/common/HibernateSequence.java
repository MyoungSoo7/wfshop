package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hibernate_sequence")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class HibernateSequence {

    @Id
    @Column(name = "next_val", nullable = false, columnDefinition = "BIGINT COMMENT 'Hibernate는 테이블을 사용하여 시퀀스를 관리'")
    private Long nextVal;
}
