package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education", indexes = {
        @Index(name = "ix_tb_education_master_title", columnList = "title"),
        @Index(name = "ix_tb_education_master_writer_no", columnList = "writer_no"),
        @Index(name = "idx_use_yn", columnList = "use_yn"),
        @Index(name = "idx_hot_yn", columnList = "hot_yn"),
        @Index(name = "idx_deadline_yn", columnList = "deadline_yn")
})
public class TbEducation {

    @Id
    @Column(name = "education_no", nullable = false, length = 20)
    private String educationNo; // 강좌 고유 식별자 (Primary Key)

    @Column(name = "lecture_type", nullable = false, length = 6)
    private String lectureType; // 강좌 유형

    @Column(name = "title", length = 500)
    private String title; // 강좌 제목

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content; // 강좌 내용

    @Column(name = "brief_content", nullable = false, length = 600)
    private String briefContent; // 강좌 요약 내용

    @Column(name = "apply_genre", nullable = false, length = 6)
    private String applyGenre; // 신청 장르

    @Column(name = "education_field", nullable = false, length = 6)
    private String educationField; // 교육 분야

    @Column(name = "education_place", length = 50)
    private String educationPlace; // 교육 장소

    @Column(name = "education_place_detail", length = 50)
    private String educationPlaceDetail; // 교육 장소 상세

    @Column(name = "area_type", length = 6)
    private String areaType; // 지역 유형

    @Column(name = "recruit_personnel")
    private Integer recruitPersonnel; // 모집 인원

    @Column(name = "education_start_date")
    private java.sql.Date educationStartDate; // 교육 시작 날짜

    @Column(name = "education_start_time", length = 5)
    private String educationStartTime; // 교육 시작 시간

    @Column(name = "education_end_date")
    private java.sql.Date educationEndDate; // 교육 종료 날짜

    @Column(name = "education_end_time", length = 5)
    private String educationEndTime; // 교육 종료 시간

    @Column(name = "apply_start_date")
    private java.sql.Date applyStartDate; // 신청 시작 날짜

    @Column(name = "apply_start_time", length = 5)
    private String applyStartTime; // 신청 시작 시간

    @Column(name = "apply_end_date")
    private java.sql.Date applyEndDate; // 신청 종료 날짜

    @Column(name = "apply_end_time", length = 5)
    private String applyEndTime; // 신청 종료 시간

    @Column(name = "discount_price")
    private Integer discountPrice; // 할인 금액

    @Column(name = "price")
    private Integer price; // 강좌 가격

    @Column(name = "together_person", columnDefinition = "TEXT")
    private String togetherPerson; // 동반 신청자 정보

    @Column(name = "file_master_code", length = 20)
    private String fileMasterCode; // 파일 마스터 코드

    @Column(name = "file_master_code_old", length = 20)
    private String fileMasterCodeOld; // 이전 파일 마스터 코드

    @Column(name = "relation_search", length = 500)
    private String relationSearch; // 관련 검색어

    @Column(name = "ask_seq")
    private Integer askSeq; // 문의 고유 식별자

    @Column(name = "use_yn", nullable = false, length = 1)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "writer_no", nullable = false, length = 15)
    private String writerNo; // 작성자 회원 번호

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록일

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제일

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "mod_date")
    private java.sql.Timestamp modDate; // 수정일

    @Column(name = "apply_personnel")
    private Integer applyPersonnel; // 신청 인원

    @Column(name = "detail_brief_description", columnDefinition = "TEXT")
    private String detailBriefDescription; // 상세 요약 설명

    @Column(name = "sort")
    private Integer sort; // 정렬 순서

    @Column(name = "url", length = 50)
    private String url; // 강좌 URL

    @Column(name = "class_lecturer", length = 10)
    private String classLecturer; // 강사 정보

    @Column(name = "education_place2", length = 50)
    private String educationPlace2; // 교육 장소 2

    @Column(name = "coordinate_x", length = 20)
    private String coordinateX; // 교육 장소 X 좌표

    @Column(name = "coordinate_y", length = 20)
    private String coordinateY; // 교육 장소 Y 좌표

    @Column(name = "time_appointed", length = 3)
    private String timeAppointed; // 시간 지정 여부

    @Column(name = "edu_time", length = 20)
    private String eduTime; // 교육 시간

    @Column(name = "main_yn", length = 2)
    private String mainYn; // 메인 여부

    @Column(name = "hot_yn", nullable = false, length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String hotYn; // 인기 여부 (Y: 인기, N: 비인기)

    @Column(name = "deadline_yn", nullable = false, length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String deadlineYn; // 마감 여부 (Y: 마감, N: 미마감)

    @Column(name = "of_original_yn", nullable = false, length = 45, columnDefinition = "VARCHAR(45) DEFAULT 'N'")
    private String ofOriginalYn; // 원본 여부 (Y: 원본, N: 비원본)

    @Column(name = "doctor_type", nullable = false, length = 255, columnDefinition = "VARCHAR(255) DEFAULT 'E07001'")
    private String doctorType; // 의사 유형

    @Column(name = "seo_keyword", length = 300)
    private String seoKeyword; // SEO 키워드

    @Column(name = "seo_exp", length = 300)
    private String seoExp; // SEO 설명

    @Column(name = "seo_image_code", length = 30)
    private String seoImageCode; // SEO 이미지 코드

    @Column(name = "recruit_personnel_dummy", columnDefinition = "INT DEFAULT 0")
    private Integer recruitPersonnelDummy; // 더미 모집 인원

    @Column(name = "mon_start_time", length = 5)
    private String monStartTime; // 월요일 시작 시간

    @Column(name = "mon_end_time", length = 5)
    private String monEndTime; // 월요일 종료 시간

    @Column(name = "tue_start_time", length = 5)
    private String tueStartTime; // 화요일 시작 시간

    @Column(name = "tue_end_time", length = 5)
    private String tueEndTime; // 화요일 종료 시간

    @Column(name = "wed_start_time", length = 5)
    private String wedStartTime; // 수요일 시작 시간

    @Column(name = "wed_end_time", length = 5)
    private String wedEndTime; // 수요일 종료 시간

    @Column(name = "thu_start_time", length = 5)
    private String thuStartTime; // 목요일 시작 시간

    @Column(name = "thu_end_time", length = 5)
    private String thuEndTime; // 목요일 종료 시간

    @Column(name = "fri_start_time", length = 5)
    private String friStartTime; // 금요일 시작 시간

    @Column(name = "fri_end_time", length = 5)
    private String friEndTime; // 금요일 종료 시간

    @Column(name = "sat_start_time", length = 5)
    private String satStartTime; // 토요일 시작 시간

    @Column(name = "sat_end_time", length = 5)
    private String satEndTime; // 토요일 종료 시간

    @Column(name = "sun_start_time", length = 5)
    private String sunStartTime; // 일요일 시작 시간

    @Column(name = "sun_end_time", length = 5)
    private String sunEndTime; // 일요일 종료 시간
}
