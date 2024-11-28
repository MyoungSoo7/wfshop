package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;
import org.welfare.wfshop.entity.order.InvoiceType;
import org.welfare.wfshop.entity.market.PaymentMethod;

@Entity
@Table(
        name = "tb_cart_education_information",
        indexes = {
                @Index(name = "ix_member_education", columnList = "member_no, education_no", unique = false),
                @Index(name = "ix_order_no", columnList = "order_no", unique = false),
                @Index(name = "ix_payment", columnList = "payment", unique = false),
                @Index(name = "ix_purchase_channel", columnList = "purchase_channel", unique = false)
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartEducationInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT COMMENT '교육 결제 신청자 임시 테이블 (Primary Key)'")
    private Integer id;

    @Column(name = "member_no", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "education_no", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '교육 번호'")
    private String educationNo;

    @Column(name = "is_default_save", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '기본 배송지로 저장 (Y/N)'")
    private String isDefaultSave;

    @Column(name = "name", nullable = false, length = 100, columnDefinition = "VARCHAR(100) COMMENT '주문자 이름'")
    private String name;

    @Column(name = "en_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 영문 이름'")
    private String enName;

    @Column(name = "telephone_no_1", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰 번호1'")
    private String telephoneNo1;

    @Column(name = "telephone_no_2", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰 번호2'")
    private String telephoneNo2;

    @Column(name = "telephone_no_3", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰 번호3'")
    private String telephoneNo3;

    @Column(name = "mail_1", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 메일명'")
    private String mail1;

    @Column(name = "mail_2", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 메일 도메인(선택)'")
    private String mail2;

    @Column(name = "mail_3", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 메일 도메인(직접입력)'")
    private String mail3;

    @Column(name = "office_name", length = 100, columnDefinition = "VARCHAR(100) COMMENT '주문자 병원명'")
    private String officeName;

    @Column(name = "job_type", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 재직 형태'")
    private String jobType;

    @Column(name = "office_postcode", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 병원 우편번호'")
    private String officePostcode;

    @Column(name = "office_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문자 병원 주소'")
    private String officeAddress;

    @Column(name = "office_detail_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문자 병원 주소 상세'")
    private String officeDetailAddress;

    @Column(name = "point", columnDefinition = "BIGINT DEFAULT 0 COMMENT '사용한 포인트'")
    private Long point;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment", columnDefinition = "ENUM('신용카드', '계좌이체', '무통장입금') COMMENT '결제수단'")
    private PaymentMethod payment;

    @Enumerated(EnumType.STRING)
    @Column(name = "invoice", columnDefinition = "ENUM('미발행', '세금계산서', '현금영수증') COMMENT '세금계산서 발행 여부'")
    private InvoiceType invoice;

    @Column(name = "workplace_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상호(법인명)'")
    private String workplaceName;

    @Column(name = "agent_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '대표자명'")
    private String agentName;

    @Column(name = "business_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '사업자등록번호'")
    private String businessNo;

    @Column(name = "workplace_postcode", length = 20, columnDefinition = "VARCHAR(20) COMMENT '사업장 주소 우편번호'")
    private String workplacePostcode;

    @Column(name = "workplace_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '사업장 주소'")
    private String workplaceAddress;

    @Column(name = "workplace_detail_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '사업장 주소 상세'")
    private String workplaceDetailAddress;

    @Column(name = "industry", length = 50, columnDefinition = "VARCHAR(50) COMMENT '사업자 업태'")
    private String industry;

    @Column(name = "sectors", length = 50, columnDefinition = "VARCHAR(50) COMMENT '사업자 종목'")
    private String sectors;

    @Column(name = "business_file_master_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '사업자 등록증 이미지 번호'")
    private String businessFileMasterCode;

    @Column(name = "business_file_master_code_msg", length = 255, columnDefinition = "VARCHAR(255) COMMENT '사업자 등록증 이미지 이름'")
    private String businessFileMasterCodeMsg;

    @Column(name = "is_company_save", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '변경된 내용 저장 (Y/N)'")
    private String isCompanySave;

    @Column(name = "tax_receipt_phone_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '현금영수증 휴대폰 번호'")
    private String taxReceiptPhoneNo;

    @Column(name = "tax_receipt_business_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '현금영수증 사업자 번호'")
    private String taxReceiptBusinessNo;

    @Column(name = "purchase_channel", length = 50, columnDefinition = "VARCHAR(50) COMMENT '구매 경로'")
    private String purchaseChannel;

    @Column(name = "product_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품명'")
    private String productName;

    @Column(name = "payment_amount", columnDefinition = "BIGINT DEFAULT 0 COMMENT '결제 금액'")
    private Long paymentAmount;

    @Column(name = "cart_type", length = 255, columnDefinition = "VARCHAR(255) COMMENT '장바구니 유형'")
    private String cartType;

    @Column(name = "coupon_seq", length = 255, columnDefinition = "VARCHAR(255) COMMENT '쿠폰 번호'")
    private String couponSeq;

    @Column(name = "use_coupon", columnDefinition = "BIGINT DEFAULT 0 COMMENT '사용한 쿠폰 금액'")
    private Long useCoupon;

    @Column(name = "package_gubun", length = 2, columnDefinition = "CHAR(2) COMMENT '패키지 구분'")
    private String packageGubun;

    @Column(name = "sales_person", length = 100, columnDefinition = "VARCHAR(100) COMMENT '영업 담당자'")
    private String salesPerson;

    @Column(name = "order_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문 번호'")
    private String orderNo;

    @Column(name = "friend", length = 100, columnDefinition = "VARCHAR(100) COMMENT '추천인'")
    private String friend;
}

