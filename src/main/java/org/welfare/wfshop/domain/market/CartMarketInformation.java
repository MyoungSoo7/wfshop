package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_cart_market_information",
        indexes = {
                @Index(name = "ix_member_order", columnList = "member_no, order_no"),
                @Index(name = "ix_payment_method", columnList = "payment_method"),
                @Index(name = "ix_purchase_path", columnList = "purchase_path")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartMarketInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "member_no", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "user_name", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자명'")
    private String userName;

    @Column(name = "user_phone_no1", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰1'")
    private String userPhoneNo1;

    @Column(name = "user_phone_no2", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰2'")
    private String userPhoneNo2;

    @Column(name = "user_phone_no3", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문자 휴대폰3'")
    private String userPhoneNo3;

    @Column(name = "user_telephone_no1", length = 20, columnDefinition = "VARCHAR(20) COMMENT '추가 연락처 1'")
    private String userTelephoneNo1;

    @Column(name = "user_telephone_no2", length = 20, columnDefinition = "VARCHAR(20) COMMENT '추가 연락처 2'")
    private String userTelephoneNo2;

    @Column(name = "user_telephone_no3", length = 20, columnDefinition = "VARCHAR(20) COMMENT '추가 연락처 3'")
    private String userTelephoneNo3;

    @Column(name = "user_hospital_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '병원 주소'")
    private String userHospitalAddress;

    @Column(name = "user_hospital_name", length = 100, columnDefinition = "VARCHAR(100) COMMENT '병원명'")
    private String userHospitalName;

    @Column(name = "user_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문자 주소'")
    private String userAddress;

    @Column(name = "recipient_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '받으시는 분'")
    private String recipientName;

    @Column(name = "user_email", length = 100, columnDefinition = "VARCHAR(100) COMMENT '이메일'")
    private String userEmail;

    @Column(name = "user_detail_address", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문자 상세 주소'")
    private String userDetailAddress;

    @Column(name = "delivery_msg", length = 255, columnDefinition = "VARCHAR(255) COMMENT '배송 메시지'")
    private String deliveryMsg;

    @Column(name = "use_point", columnDefinition = "INT DEFAULT 0 COMMENT '사용 포인트'")
    private Integer usePoint;

    @Column(name = "payment_method", columnDefinition = "ENUM('신용카드', '계좌이체', '카카오페이') COMMENT '결제 수단'")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(name = "purchase_path", length = 50, columnDefinition = "VARCHAR(50) COMMENT '구매 경로'")
    private String purchasePath;

    @Column(name = "delivery_fee", columnDefinition = "INT DEFAULT 0 COMMENT '배송비'")
    private Integer deliveryFee;

    @Column(name = "payment_amount", columnDefinition = "INT DEFAULT 0 COMMENT '결제 예정 금액'")
    private Integer paymentAmount;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '상품 합계'")
    private Integer totalPrice;

    @Column(name = "user_postcode", length = 20, columnDefinition = "VARCHAR(20) COMMENT '우편번호'")
    private String userPostcode;

    @Column(name = "user_address_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문자 주소 이름'")
    private String userAddressName;

    @Column(name = "product_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "coupon_seq", length = 255, columnDefinition = "VARCHAR(255) COMMENT '쿠폰 번호'")
    private String couponSeq;

    @Column(name = "use_coupon", columnDefinition = "INT DEFAULT 0 COMMENT '사용 쿠폰 금액'")
    private Integer useCoupon;

    @Column(name = "cash_receipt_type", length = 50, columnDefinition = "VARCHAR(50) COMMENT '현금영수증 유형'")
    private String cashReceiptType;

    @Column(name = "sales_person", length = 100, columnDefinition = "VARCHAR(100) COMMENT '영업 담당자'")
    private String salesPerson;

    @Column(name = "coupon_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '쿠폰 이름'")
    private String couponName;

    @Column(name = "product_id", length = 255, columnDefinition = "VARCHAR(255) COMMENT '상품 아이디'")
    private String productId;

    @Column(name = "order_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문 번호'")
    private String orderNo;

    @Column(name = "contract_master_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '계약 마스터 코드'")
    private String contractMasterCode;
}
