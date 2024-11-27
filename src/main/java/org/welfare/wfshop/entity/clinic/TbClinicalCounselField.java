package org.welfare.wfshop.entity.clinic;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_clinical_counsel_field")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbClinicalCounselField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "field", length = 6, nullable = false, columnDefinition = "VARCHAR(6) COMMENT '필드 코드'")
    private String field;

    @Column(name = "reg_date", nullable = false, columnDefinition = "DATE COMMENT '등록일'")
    private LocalDate regDate;

    @Column(name = "member_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "contents_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '콘텐츠 번호'")
    private String contentsNo;
}
