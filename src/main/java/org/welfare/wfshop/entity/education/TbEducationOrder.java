package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_order", indexes = {
        @Index(name = "ix_tb_education_order_member_no", columnList = "member_no"),
        @Index(name = "ix_tb_education_order_order_no", columnList = "order_no"),
        @Index(name = "ix_tb_education_order_pay_state", columnList = "pay_state")
})
public class TbEducationOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id; // 고유 식별자 (Primary Key)

    @Column(name = "cno", length = 50)
    private String cno; // 결제 번호

    @Column(name = "order_no", length = 50)
    private String orderNo; // 주문 번호

    @Column(name = "pay_state", length = 50)
    private String payState; // 결제 상태

    @Column(name = "member_no", length = 50)
    private String memberNo; // 회원 번호

    @Column(name = "applicant_name", length = 50)
    private String applicantName; // 주문자 이름

    @Column(name = "applicant_name_en", length = 50)
    private String applicantNameEn; // 주문자 이름 (영문)

    @Column(name = "applicant_phone_no", length = 100)
    private String applicantPhoneNo; // 주문자 휴대폰 번호

    @Column(name = "applicant_hospital_name", length = 20)
    private String applicantHospitalName; // 병원명

    @Column(name = "applicant_work_type", length = 20)
    private String applicantWorkType; // 재직 형태

    @Column(name = "applicant_hospital_postcode", length = 20)
    private String applicantHospitalPostcode; // 병원 우편번호

    @Column(name = "applicant_hospital_address", length = 255)
    private String applicantHospitalAddress; // 병원 주소

    @Column(name = "applicant_hospital_address_detail", length = 255)
    private String applicantHospitalAddressDetail; // 병원 상세 주소

    @Column(name = "bussiness_owner", length = 50)
    private String bussinessOwner; // 세금계산서 대표자 명

    @Column(name = "bussiness_no", length = 50)
    private String bussinessNo; // 세금계산서 사업자등록번호

    @Column(name = "bussiness_postcode", length = 50)
    private String bussinessPostcode; // 세금계산서 사업장 우편번호

    @Column(name = "bussiness_address", length = 255)
    private String bussinessAddress; // 세금계산서 사업장 주소

    @Column(name = "bussiness_address_detail", length = 255)
    private String bussinessAddressDetail; // 세금계산서 사업장 상세 주소

    @Column(name = "bussiness_name", length = 50)
    private String bussinessName; // 세금계산서 상호(법인명)

    @Column(name = "bussiness_industry", length = 50)
    private String bussinessIndustry; // 세금계산서 업태

    @Column(name = "bussiness_sector", length = 50)
    private String bussinessSector; // 세금계산서 종목

    @Column(name = "bussiness_file_master_code", length = 50)
    private String bussinessFileMasterCode; // 세금계산서 첨부 파일 코드

    @Column(name = "tax_receipt_no", length = 50)
    private String taxReceiptNo; // 현금영수증 번호

    @Column(name = "use_point", length = 50)
    private String usePoint; // 사용된 포인트

    @Column(name = "coupon_seq", length = 255)
    private String couponSeq; // 쿠폰 번호

    @Column(name = "deposit_account", length = 50)
    private String depositAccount; // 입금 계좌

    @Column(name = "buy_path_code", length = 50)
    private String buyPathCode; // 구매 경로

    @Column(name = "pay_price", length = 50)
    private String payPrice; // 결제 금액

    @Column(name = "payment_type", length = 50)
    private String paymentType; // 결제 수단

    @Column(name = "order_date")
    private java.sql.Timestamp orderDate; // 주문 날짜

    @Column(name = "tax_receipt_phone_no", length = 255)
    private String taxReceiptPhoneNo; // 현금영수증 전화번호

    @Column(name = "earn_point")
    private Long earnPoint; // 적립 포인트

    @Column(name = "card_type", length = 255)
    private String cardType; // 카드 유형

    @Column(name = "coupon_discount_price")
    private Long couponDiscountPrice; // 쿠폰 할인 금액

    @Column(name = "cash_receipt_type", length = 255)
    private String cashReceiptType; // 현금영수증 유형

    @Column(name = "receipt_type", length = 255)
    private String receiptType; // 영수증 유형

    @Column(name = "use_cp_point")
    private Long useCpPoint; // 사용된 CP 포인트

    @Column(name = "use_ep_point")
    private Long useEpPoint; // 사용된 EP 포인트

    @Column(name = "recruit_personnel_count", length = 255)
    private String recruitPersonnelCount; // 모집 인원 수

    @Column(name = "pay_date")
    private java.sql.Timestamp payDate; // 결제 일시

    @Column(name = "waiting_type", length = 1)
    private String waitingType; // 대기 유형

    @Column(name = "sales_person", length = 100)
    private String salesPerson; // 영업 담당자

    @Column(name = "receipt_yn", length = 2, nullable = false)
    private String receiptYn = "N"; // 영수증 발행 여부

    @Column(name = "virtual_bank_cd", length = 5)
    private String virtualBankCd; // 가상계좌 은행 코드

    @Column(name = "virtual_bank_nm", length = 50)
    private String virtualBankNm; // 가상계좌 은행명

    @Column(name = "virtual_account_no", length = 100)
    private String virtualAccountNo; // 가상계좌 번호

    @Column(name = "virtual_deposit_nm", length = 50)
    private String virtualDepositNm; // 가상계좌 예금주

    @Column(name = "virtual_expire_date")
    private java.sql.Timestamp virtualExpireDate; // 가상계좌 입금 기한

    @Column(name = "friend", length = 100)
    private String friend; // 추천인
}
