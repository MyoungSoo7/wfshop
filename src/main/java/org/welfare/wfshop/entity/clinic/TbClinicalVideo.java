package org.welfare.wfshop.entity.clinic;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_clinical_video",
        indexes = {
                @Index(name = "ix_tb_clinical_video_title", columnList = "title"),
                @Index(name = "ix_tb_clinical_video_delete_yn", columnList = "delete_yn")
        })
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbClinicalVideo {

    @Id
    @Column(name = "contents_no", length = 15, nullable = false, columnDefinition = "VARCHAR(15) COMMENT '콘텐츠 번호 (Primary Key)'")
    private String contentsNo;

    @Column(name = "series_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '시리즈 코드'")
    private String seriesCode;

    @Column(name = "title", length = 300, columnDefinition = "VARCHAR(300) COMMENT '비디오 제목'")
    private String title;

    @Lob
    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "field", length = 6, nullable = false, columnDefinition = "CHAR(6) COMMENT '필드 코드'")
    private String field;

    @Column(name = "activity_field", length = 6, nullable = false, columnDefinition = "CHAR(6) COMMENT '활동 필드 코드'")
    private String activityField;

    @Column(name = "thumbnail_file", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '썸네일 파일 경로'")
    private String thumbnailFile;

    @Column(name = "thumbnail_file_old", length = 20, columnDefinition = "VARCHAR(20) COMMENT '이전 썸네일 파일 경로'")
    private String thumbnailFileOld;

    @Column(name = "registrant_no", length = 15, nullable = false, columnDefinition = "VARCHAR(15) COMMENT '등록자 번호'")
    private String registrantNo;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @Column(name = "mod_date", columnDefinition = "TIMESTAMP NULL COMMENT '수정일'")
    private LocalDateTime modDate;

    @Column(name = "modify_no", length = 15, columnDefinition = "VARCHAR(15) COMMENT '수정자 번호'")
    private String modifyNo;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "doctor_yn", length = 1, columnDefinition = "VARCHAR(1) COMMENT '의사 여부 (Y: 의사, N: 비의사)'")
    private String doctorYn;

    @Column(name = "step_yn", length = 1, columnDefinition = "VARCHAR(1) COMMENT '단계 여부'")
    private String stepYn;

    @Column(name = "of_original_yn", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '원본 여부 (Y: 원본, N: 복사본)'")
    private String ofOriginalYn;

    @Column(name = "hot_yn", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '인기 여부 (Y: 인기, N: 일반)'")
    private String hotYn;

    @Column(name = "delete_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y: 삭제, N: 사용)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제일'")
    private LocalDateTime deleteDate;

    @Lob
    @Column(name = "search_keyword", nullable = false, columnDefinition = "TEXT")
    private String searchKeyword;

    @Column(name = "video_code", length = 300, columnDefinition = "VARCHAR(300) COMMENT '비디오 코드'")
    private String videoCode;

    @Column(name = "teeth", length = 300, nullable = false, columnDefinition = "VARCHAR(300) COMMENT '치아 관련 정보'")
    private String teeth;

    @Column(name = "main_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '메인 여부'")
    private String mainYn;

    @Column(name = "lecturer_seq", length = 50, columnDefinition = "VARCHAR(50) COMMENT '강사 시퀀스'")
    private String lecturerSeq;

    @Column(name = "board_type_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드'")
    private String boardTypeCode;

    @Column(name = "seo_keyword", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 키워드'")
    private String seoKeyword;

    @Column(name = "seo_exp", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 설명'")
    private String seoExp;

    @Column(name = "seo_image_code", length = 30, columnDefinition = "VARCHAR(30) COMMENT 'SEO 이미지 코드'")
    private String seoImageCode;

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;
}
