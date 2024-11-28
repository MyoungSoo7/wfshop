package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_lecturer_field", indexes = {
        @Index(name = "ix_lecturer_seq", columnList = "lecturer_seq"),
        @Index(name = "ix_field", columnList = "field")
})
public class TbEducationLecturerField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ask_seq", nullable = false)
    private Integer askSeq; // 고유 식별자 (Primary Key)

    @Column(name = "lecturer_seq", nullable = false, length = 20)
    private String lecturerSeq; // 강사 고유 번호 (tb_education_lecturer.lecturer_seq 참조)

    @Column(name = "field", length = 6)
    private String field; // 강의 분야

    @Column(name = "lecture_field", length = 6)
    private String lectureField; // 세부 강의 분야

    @ManyToOne
    @JoinColumn(name = "lecturer_seq", referencedColumnName = "lecturer_seq", insertable = false, updatable = false)
    private TbEducationLecturer tbEducationLecturer; // 강사와의 관계 (외래키)
}

