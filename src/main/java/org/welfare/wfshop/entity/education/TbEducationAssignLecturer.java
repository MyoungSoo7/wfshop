package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_assign_lecturer", indexes = {
        @Index(name = "ix_education_no", columnList = "education_no"),
        @Index(name = "ix_lecturer_seq", columnList = "lecturer_seq")
})
public class TbEducationAssignLecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", nullable = false, length = 20)
    private String educationNo; // 강좌 고유 번호 (tb_education.education_no 참조)

    @Column(name = "lecture_type", nullable = false, length = 6)
    private String lectureType; // 강의 유형

    @Column(name = "lecturer_seq", nullable = false, length = 20)
    private String lecturerSeq; // 강사 고유 번호 (tb_education_lecturer.lecturer_seq 참조)

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록일

    @Column(name = "registrant_no", nullable = false, length = 15)
    private String registrantNo; // 등록자 회원 번호

    @ManyToOne
    @JoinColumn(name = "education_no", referencedColumnName = "education_no", insertable = false, updatable = false)
    private TbEducation tbEducation; // 강좌와의 관계 (외래키)

    @ManyToOne
    @JoinColumn(name = "lecturer_seq", referencedColumnName = "lecturer_seq", insertable = false, updatable = false)
    private TbEducationLecturer tbEducationLecturer; // 강사와의 관계 (외래키)
}
