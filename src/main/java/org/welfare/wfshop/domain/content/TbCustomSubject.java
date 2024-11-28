package org.welfare.wfshop.domain.content;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_custom_subject", indexes = {
        @Index(name = "idx_custom_type", columnList = "custom_type")
})
public class TbCustomSubject {

    @Id
    @Column(name = "seq", nullable = false)
    private Integer seq; // 커스텀 제목 고유 식별자 (Primary Key)

    @Column(name = "custom_type", length = 45)
    private String customType; // 커스텀 유형

    @Column(name = "custom_subject", length = 255)
    private String customSubject; // 커스텀 제목
}

