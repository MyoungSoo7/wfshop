package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_order_temp", indexes = {
        @Index(name = "ix_tb_education_order_temp_member_no", columnList = "member_no"),
        @Index(name = "ix_tb_education_order_temp_education_no", columnList = "education_no")
})
public class TbEducationOrderTemp {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id; // 고유 식별자 (Primary Key)

    @Column(name = "member_no", length = 20)
    private String memberNo; // 회원 번호

    @Column(name = "education_no", length = 50)
    private String educationNo; // 강좌 코드 (온/오프 공통)

    @Column(name = "lecture_type", length = 50)
    private String lectureType; // 강좌 유형 (온/오프 구분 코드)

    @Column(name = "total_price", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer totalPrice; // 총 금액

    @Column(name = "package_gubun", length = 50, nullable = false, columnDefinition = "VARCHAR(50) DEFAULT 'P'")
    private String packageGubun; // 패키지 구분 (P: 패키지)

    @Column(name = "cart_view_yn", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'Y'")
    private String cartViewYn; // 장바구니 노출 여부 (Y/N)

    @Column(name = "education_price")
    private Integer educationPrice; // 강좌 정가 (온/오프)

    @Column(name = "education_discount_price", columnDefinition = "INT UNSIGNED")
    private Integer educationDiscountPrice; // 강좌 할인가 (온/오프)

    @Column(name = "education_name", length = 500)
    private String educationName; // 강좌 이름 (온/오프)

    @Column(name = "education_round_no", length = 255)
    private String educationRoundNo; // 회차 번호

    @Column(name = "education_round_price")
    private Integer educationRoundPrice; // 회차 정가 (온라인)

    @Column(name = "education_round_discount_price")
    private Integer educationRoundDiscountPrice; // 회차 할인가 (온라인)

    @Column(name = "education_round_name", length = 500)
    private String educationRoundName; // 회차 이름 (온라인)

    @Column(name = "education_round_count", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer educationRoundCount; // 회차 수 (온라인)

    @Column(name = "education_round_watch_time")
    private java.sql.Time educationRoundWatchTime; // 회차 시청 시간

    @Column(name = "file_master_thumb", length = 50)
    private String fileMasterThumb; // 썸네일 이미지 코드

    @Column(name = "discount_yn", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String discountYn; // 할인 여부 (Y/N)

    @Column(name = "cart_type", length = 1, nullable = false, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String cartType; // 구매 유형 (N: 바로구매, C: 장바구니)

    @Column(name = "education_start_date")
    private java.sql.Date educationStartDate; // 수강 시작일

    @Column(name = "education_start_time", length = 50)
    private String educationStartTime; // 수강 시작 시간

    @Column(name = "education_end_date")
    private java.sql.Date educationEndDate; // 수강 종료일

    @Column(name = "education_end_time", length = 50)
    private String educationEndTime; // 수강 종료 시간

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시

    @Column(name = "recruit_personnel")
    private Integer recruitPersonnel; // 모집 인원

    @Column(name = "lecturer_name", length = 255)
    private String lecturerName; // 강사 이름

    @Column(name = "cart_education_view_yn", length = 255)
    private String cartEducationViewYn; // 장바구니 강좌 노출 여부

    @Column(name = "class_lecturer", length = 255)
    private String classLecturer; // 강사 정보

    @Column(name = "time_appointed", precision = 6)
    private java.sql.Timestamp timeAppointed; // 예약 시간
}
