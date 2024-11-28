package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_order_detail", indexes = {
        @Index(name = "ix_tb_education_order_detail_cno", columnList = "cno"),
        @Index(name = "ix_tb_education_order_detail_education_no", columnList = "education_no"),
        @Index(name = "ix_tb_education_order_detail_lecture_type", columnList = "lecture_type")
})
public class TbEducationOrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id; // 고유 식별자 (Primary Key)

    @Column(name = "cno", length = 50)
    private String cno; // 결제 번호

    @Column(name = "lecture_state", length = 50)
    private String lectureState; // 강좌 상태

    @Column(name = "lecture_type", length = 50)
    private String lectureType; // 강좌 유형 (오프라인/온라인)

    @Column(name = "education_no", length = 50)
    private String educationNo; // 강좌 코드

    @Column(name = "education_name", length = 500)
    private String educationName; // 강좌명

    @Column(name = "education_lecturer_name", length = 50)
    private String educationLecturerName; // 강사명

    @Column(name = "education_start_date", columnDefinition = "DATE DEFAULT '0000-00-00'")
    private java.sql.Date educationStartDate; // 강좌 시작일

    @Column(name = "education_end_date", columnDefinition = "DATE DEFAULT '0000-00-00'")
    private java.sql.Date educationEndDate; // 강좌 종료일

    @Column(name = "package_gubun", length = 2)
    private String packageGubun; // 패키지 여부

    @Column(name = "education_round", length = 50)
    private String educationRound; // 회차 번호

    @Column(name = "education_round_title", length = 50)
    private String educationRoundTitle; // 회차명

    @Column(name = "education_package_price", length = 50)
    private String educationPackagePrice; // 패키지 금액

    @Column(name = "education_round_price")
    private Integer educationRoundPrice; // 회차 금액 (정상가)

    @Column(name = "education_round_discount_price", length = 50)
    private String educationRoundDiscountPrice; // 회차 금액 (할인가)

    @Column(name = "cancel_yn", length = 2)
    private String cancelYn; // 취소 여부

    @Column(name = "cart_type", length = 50)
    private String cartType; // 구매 유형 (바로 구매/장바구니)

    @Column(name = "point_yn", length = 50)
    private String pointYn; // 포인트 적립 여부

    @Column(name = "education_round_watch_time", length = 255)
    private String educationRoundWatchTime; // 회차 시청 시간

    @Column(name = "file_master_thumb", length = 255)
    private String fileMasterThumb; // 썸네일 파일 코드

    @Column(name = "order_state", length = 255)
    private String orderState; // 주문 상태

    @Column(name = "pay_state", length = 255)
    private String payState; // 결제 상태

    @Column(name = "education_round_attend_yn", length = 255)
    private String educationRoundAttendYn; // 참석 여부

    @Column(name = "survey_yn", length = 2)
    private String surveyYn; // 설문 여부

    @Column(name = "earn_yn", length = 255)
    private String earnYn; // 적립 여부

    @Column(name = "class_lecturer", length = 255)
    private String classLecturer; // 강사 정보

    @Column(name = "admin_memo", length = 255)
    private String adminMemo; // 관리자 메모

    @Column(name = "talksend_yn", length = 1, nullable = false)
    private String talksendYn = "N"; // 알림톡 발송 여부
}
