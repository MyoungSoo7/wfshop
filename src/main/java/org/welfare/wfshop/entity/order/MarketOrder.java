package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_order",
        indexes = {
                @Index(name = "tb_market_order_member_no_IDX", columnList = "member_no, order_no"),
                @Index(name = "tb_market_order_member_no_IDX1", columnList = "member_no"),
                @Index(name = "tb_market_order_order_no_IDX", columnList = "order_no"),
                @Index(name = "tb_market_order_order_market_id_IDX", columnList = "order_market_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_market_id", nullable = false, columnDefinition = "INT COMMENT '주문 정보 테이블 아이디 (Primary Key)'")
    private Integer orderMarketId;

    @Column(name = "cno", length = 50, columnDefinition = "VARCHAR(50) COMMENT 'PG 거래 번호 (결제 게이트웨이 거래 번호)'")
    private String cno;

    @Column(name = "order_state", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문 상태 (예: 결제 완료, 배송 중, 배송 완료 등)'")
    private String orderState;

    @Column(name = "cart_type", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '구매 유형 (N: 바로구매, C: 장바구니 구매)'")
    private String cartType;

    @Column(name = "member_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 회원 고유번호 (회원 식별자)'")
    private String memberNo;

    @Column(name = "order_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문 번호 (고유 주문 식별자)'")
    private String orderNo;

    @Column(name = "user_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 이름'")
    private String userName;

    @Column(name = "recipient_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수취자 이름'")
    private String recipientName;

    @Column(name = "recipient_phone_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수취자 전화 번호'")
    private String recipientPhoneNo;

    @Column(name = "recipient_telephone_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수취자 추가 연락처'")
    private String recipientTelephoneNo;

    @Column(name = "recipient_address_base", length = 50, columnDefinition = "VARCHAR(50) COMMENT '수취자 기본 주소'")
    private String recipientAddressBase;

    @Column(name = "pay_type", length = 50, columnDefinition = "VARCHAR(50) COMMENT '결제 수단 (예: 카드, 계좌이체 등)'")
    private String payType;

    @Column(name = "user_phone_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 휴대폰 번호'")
    private String userPhoneNo;

    @Column(name = "user_email", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문자 이메일'")
    private String userEmail;

    @Column(name = "earn_point", columnDefinition = "INT DEFAULT 0 COMMENT '사용 가능한 포인트'")
    private Integer earnPoint;

    @Column(name = "use_point", columnDefinition = "INT DEFAULT 0 COMMENT '사용된 포인트'")
    private Integer usePoint;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '최종 결제 금액 (배송비 + 포인트 + 쿠폰)'")
    private Integer totalPrice;

    @Column(name = "pay_price", columnDefinition = "INT DEFAULT 0 COMMENT '결제 금액 (실제 결제된 금액)'")
    private Integer payPrice;

    @Column(name = "order_date", columnDefinition = "DATETIME COMMENT '주문 일자'")
    private LocalDateTime orderDate;

    @Column(name = "delivery_msg", length = 50, columnDefinition = "VARCHAR(50) COMMENT '배송 메시지 (예: 부재 시 문 앞에 두세요)'")
    private String deliveryMsg;

    @Column(name = "product_qty", columnDefinition = "INT COMMENT '주문 수량'")
    private Integer productQty;

    @Column(name = "delivery_price", columnDefinition = "INT COMMENT '배송비'")
    private Integer deliveryPrice;
}
