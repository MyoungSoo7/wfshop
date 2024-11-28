package org.welfare.wfshop.domain.clinic;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_clinical_counsel",
        indexes = {
                @Index(name = "ix_tb_clinical_counsel_file_master_code1", columnList = "file_master_code1"),
                @Index(name = "ix_tb_clinical_counsel_file_master_code2", columnList = "file_master_code2"),
                @Index(name = "ix_tb_clinical_counsel_file_master_code3", columnList = "file_master_code3"),
                @Index(name = "ix_tb_clinical_counsel_file_master_code4", columnList = "file_master_code4"),
                @Index(name = "ix_tb_clinical_counsel_file_master_code5", columnList = "file_master_code5")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbClinicalCounsel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinical_counsel_no", nullable = false, columnDefinition = "INT COMMENT '임상 상담 고유 번호 (Primary Key)'")
    private Integer clinicalCounselNo;

    @Lob
    @Column(name = "content", nullable = false, columnDefinition = "MEDIUMTEXT")
    private String content;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "delete_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y: 삭제, N: 사용)'")
    private String deleteYn;

    @Column(name = "file_master_code1", length = 100, columnDefinition = "VARCHAR(100) COMMENT '첨부 파일 코드 1'")
    private String fileMasterCode1;

    @Column(name = "file_master_code2", length = 100, columnDefinition = "VARCHAR(100) COMMENT '첨부 파일 코드 2'")
    private String fileMasterCode2;

    @Column(name = "file_master_code3", length = 100, columnDefinition = "VARCHAR(100) COMMENT '첨부 파일 코드 3'")
    private String fileMasterCode3;

    @Column(name = "file_master_code4", length = 100, columnDefinition = "VARCHAR(100) COMMENT '첨부 파일 코드 4'")
    private String fileMasterCode4;

    @Column(name = "file_master_code5", length = 100, columnDefinition = "VARCHAR(100) COMMENT '첨부 파일 코드 5'")
    private String fileMasterCode5;

    @Column(name = "answer_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '답변 여부 (Y: 답변 완료, N: 미완료)'")
    private String answerYn;

    @Column(name = "member_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "precautions_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '주의사항 여부'")
    private String precautionsYn;

    @Column(name = "main_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '메인 여부'")
    private String mainYn;

    @Column(name = "contents_no", length = 20, columnDefinition = "CHAR(20) COMMENT '콘텐츠 번호'")
    private String contentsNo;

    @Column(name = "search_count", columnDefinition = "INT COMMENT '검색 횟수'")
    private Integer searchCount;

    @Column(name = "url", length = 100, columnDefinition = "VARCHAR(100) COMMENT 'URL'")
    private String url;

    @Column(name = "url_img_path", length = 30, columnDefinition = "VARCHAR(30) COMMENT 'URL 이미지 경로'")
    private String urlImgPath;
}
