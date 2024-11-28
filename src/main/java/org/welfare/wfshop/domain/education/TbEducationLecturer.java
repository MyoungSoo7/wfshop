package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_lecturer", indexes = {
        @Index(name = "ix_tb_education_lecturer_name", columnList = "name"),
        @Index(name = "ix_tb_education_lecturer_use_yn", columnList = "use_yn"),
        @Index(name = "ix_tb_education_lecturer_delete_yn", columnList = "delete_yn")
})
public class TbEducationLecturer {

    @Id
    @Column(name = "lecturer_seq", nullable = false, length = 20)
    private String lecturerSeq; // 강사 고유 식별자 (Primary Key)

    @Column(name = "name", nullable = false, length = 50)
    private String name; // 강사 이름

    @Column(name = "en_name", length = 50)
    private String enName; // 강사 영문 이름

    @Column(name = "graduate_school", length = 30)
    private String graduateSchool; // 졸업 학교

    @Column(name = "office_name", length = 50)
    private String officeName; // 소속 기관명

    @Column(name = "etc_memo", columnDefinition = "TEXT")
    private String etcMemo; // 기타 메모

    @Column(name = "file_master_code", length = 20)
    private String fileMasterCode; // 파일 마스터 코드

    @Column(name = "lecturer_history_en", columnDefinition = "TEXT")
    private String lecturerHistoryEn; // 강사 이력 (영문)

    @Column(name = "lecturer_history_kr", columnDefinition = "TEXT")
    private String lecturerHistoryKr; // 강사 이력 (한글)

    @Column(name = "career_code", nullable = false, length = 6)
    private String careerCode; // 경력 코드

    @Column(name = "lecturer_type_code", nullable = false, length = 6)
    private String lecturerTypeCode; // 강사 유형 코드

    @Column(name = "registrant_no", nullable = false, length = 15)
    private String registrantNo; // 등록자 회원 번호

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록일

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제일

    @Column(name = "mod_date")
    private java.sql.Timestamp modDate; // 수정일

    @Column(name = "modify_no", length = 15)
    private String modifyNo; // 수정자 회원 번호

    @Column(name = "use_yn", nullable = false, length = 1)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "member_no", length = 20)
    private String memberNo; // 회원 번호
}

