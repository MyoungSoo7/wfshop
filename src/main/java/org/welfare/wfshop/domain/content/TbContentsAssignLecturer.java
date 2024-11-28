package org.welfare.wfshop.domain.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_contents_assign_lecturer",
        indexes = {
                @Index(name = "ix_tb_contents_assign_lecturer_contents_no", columnList = "contents_no"),
                @Index(name = "ix_tb_contents_assign_lecturer_lecturer_seq", columnList = "lecturer_seq")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsAssignLecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "contents_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '콘텐츠 번호'")
    private String contentsNo;

    @Column(name = "lecturer_seq", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '강사 시퀀스 번호'")
    private String lecturerSeq;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "registrant_no", length = 15, nullable = false, columnDefinition = "VARCHAR(15) COMMENT '등록자 번호'")
    private String registrantNo;
}
