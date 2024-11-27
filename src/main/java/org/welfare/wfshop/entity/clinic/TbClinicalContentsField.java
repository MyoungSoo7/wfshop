package org.welfare.wfshop.entity.clinic;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_clinical_contents_field")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbClinicalContentsField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "contents_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '임상 콘텐츠 번호 (tb_clinical_contents 테이블 참조)'")
    private String contentsNo;

    @Column(name = "field", length = 10, nullable = false, columnDefinition = "VARCHAR(10) COMMENT '필드 코드'")
    private String field;

    @Column(name = "reg_date", nullable = false, columnDefinition = "DATE COMMENT '등록일'")
    private LocalDate regDate;

    @Column(name = "board_type_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드'")
    private String boardTypeCode;
}
