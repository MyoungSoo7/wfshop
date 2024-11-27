package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_cart_education",
        indexes = {
                @Index(name = "ix_tb_cart_education_member_no", columnList = "member_no"),
                @Index(name = "ix_tb_cart_education_education_no", columnList = "education_no"),
                @Index(name = "ix_tb_cart_education_cart_type", columnList = "cart_type"),
                @Index(name = "ix_tb_cart_education_reg_date", columnList = "reg_date")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer id;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호 (장바구니 소유자)'")
    private String memberNo;

    @Column(name = "education_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 아이디 (온/오프라인 강좌)'")
    private String educationNo;

    @Column(name = "lecture_type", length = 50, columnDefinition = "VARCHAR(50) COMMENT '강좌 유형 (온/오프 구분 코드)'")
    private String lectureType;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '총 금액 (할인 적용 전/후)'")
    private Integer totalPrice;

    @Column(name = "package_gubun", length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'P' COMMENT '패키지 구분 (P: 패키지, S: 단일)'")
    private String packageGubun;

    @Column(name = "cart_view_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'Y' COMMENT '장바구니 노출 여부 (Y: 노출, N: 비노출)'")
    private String cartViewYn;

    @Column(name = "education_price", columnDefinition = "INT COMMENT '강좌 정가 (온/오프라인)'")
    private Integer educationPrice;

    @Column(name = "education_discount_price", columnDefinition = "INT UNSIGNED COMMENT '강좌 할인가 (온/오프라인)'")
    private Integer educationDiscountPrice;

    @Column(name = "education_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '강좌 이름 (온/오프라인)'")
    private String educationName;

    @Column(name = "education_round_no", length = 255, columnDefinition = "VARCHAR(255) COMMENT '회차 번호 (온라인 강좌)'")
    private String educationRoundNo;

    @Column(name = "education_round_price", columnDefinition = "INT COMMENT '회차 정가 (온라인 강좌)'")
    private Integer educationRoundPrice;

    @Column(name = "education_round_discount_price", columnDefinition = "INT COMMENT '회차 할인가 (온라인 강좌)'")
    private Integer educationRoundDiscountPrice;

    @Column(name = "education_round_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '회차 이름 (온라인 강좌)'")
    private String educationRoundName;

    @Column(name = "education_round_count", columnDefinition = "INT DEFAULT 0 COMMENT '회차 카운트 (온라인 강좌)'")
    private Integer educationRoundCount;

    @Column(name = "education_round_watch_time", columnDefinition = "TIME COMMENT '회차 시청 시간 (온라인 강좌)'")
    private java.time.LocalTime educationRoundWatchTime;

    @Column(name = "file_master_thumb", length = 50, columnDefinition = "VARCHAR(50) COMMENT '강좌 썸네일 이미지 코드'")
    private String fileMasterThumb;

    @Column(name = "discount_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '할인 여부 (Y: 할인 적용, N: 할인 미적용)'")
    private String discountYn;

    @Column(name = "cart_type", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '장바구니 유형 (N: 바로구매, C: 장바구니)'")
    private String cartType;

    @Column(name = "education_start_date", columnDefinition = "DATE COMMENT '수강 시작일'")
    private java.time.LocalDate educationStartDate;

    @Column(name = "education_start_time", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수강 시작 시간'")
    private String educationStartTime;

    @Column(name = "education_end_date", columnDefinition = "DATE COMMENT '수강 종료일'")
    private java.time.LocalDate educationEndDate;

    @Column(name = "education_end_time", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수강 종료 시간'")
    private String educationEndTime;

    @Column(name = "reg_date", columnDefinition = "DATETIME COMMENT '등록 날짜'")
    private java.time.LocalDateTime regDate;

    @Column(name = "recruit_personnel", columnDefinition = "INT COMMENT '정원 (모집 인원)'")
    private Integer recruitPersonnel;

    @Column(name = "lecturer_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '강사 이름'")
    private String lecturerName;

    @Column(name = "cart_education_view_yn", length = 255, columnDefinition = "VARCHAR(255) COMMENT '강좌 장바구니 노출 여부'")
    private String cartEducationViewYn;

    @Column(name = "class_lecturer", length = 255, columnDefinition = "VARCHAR(255) COMMENT '강좌 강사 정보'")
    private String classLecturer;

    @Column(name = "time_appointed", columnDefinition = "DATETIME(6) COMMENT '예약된 시간'")
    private java.time.LocalDateTime timeAppointed;
}

