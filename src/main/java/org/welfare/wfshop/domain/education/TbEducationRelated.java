package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_related", indexes = {
        @Index(name = "ix_tb_education_related_education_no", columnList = "education_no"),
        @Index(name = "ix_tb_education_related_related_education_no", columnList = "related_education_no")
})
public class TbEducationRelated {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX", nullable = false)
    private Integer idx; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", length = 20)
    private String educationNo; // 강좌 코드

    @Column(name = "related_education_no", length = 20)
    private String relatedEducationNo; // 연관 강좌 코드
}
