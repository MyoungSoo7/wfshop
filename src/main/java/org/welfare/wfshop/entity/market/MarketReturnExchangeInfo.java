package org.welfare.wfshop.entity.market;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_return_exchange_info",
        indexes = {
                @Index(name = "idx_order_no", columnList = "order_no"),
                @Index(name = "idx_member_no", columnList = "member_no")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketReturnExchangeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "order_id", nullable = false, columnDefinition = "INT DEFAULT 0 COMMENT '주문 정보 테이블 아이디 (tb_market_order_product 참조)'")
    private Integer orderId;

    @Column(name = "cno", length = 50, columnDefinition = "VARCHAR(50) COMMENT 'PG 거래 번호'")
    private String cno;

    @Column(name = "order_no", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '주문번호'")
    private String orderNo;

    @Column(name = "member_no", length = 50, nullable = false, columnDefinition = "VARCHAR(50) COMMENT '회원 고유 번호'")
    private String memberNo;

    @Column(name = "return_exchange_cancel_date", columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00' COMMENT '교환/반품/취소 신청 날짜'")
    private LocalDateTime returnExchangeCancelDate;

    @Column(name = "exchange_delivery_date", columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00' COMMENT '교환 배송 시작일'")
    private LocalDateTime exchangeDeliveryDate;

    @Column(name = "return_exchange_cmpl_date", columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00' COMMENT '교환/반품 완료 날짜'")
    private LocalDateTime returnExchangeCmplDate;

    @Column(name = "refund_cmpl_date", columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00' COMMENT '환불 완료 날짜, 결제취소일'")
    private LocalDateTime refundCmplDate;

    @Column(name = "return_exchange_reason", length = 50, columnDefinition = "VARCHAR(50) COMMENT '교환/반품 사유'")
    private String returnExchangeReason;

    @Column(name = "return_exchange_detail_reason", length = 50, columnDefinition = "VARCHAR(50) COMMENT '교환/반품 상세사유'")
    private String returnExchangeDetailReason;

    @Column(name = "bank_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '은행명 코드(무통장일때만)'")
    private String bankCode;

    @Column(name = "deposit_name", length = 50, columnDefinition = "VARCHAR(50) DEFAULT '0' COMMENT '예금주 이름(무통장일때만)'")
    private String depositName;

    @Column(name = "deposit_account", length = 50, columnDefinition = "VARCHAR(50) DEFAULT '0' COMMENT '환불 받을 계좌번호(무통장일때만)'")
    private String depositAccount;

    @Column(name = "return_exchange_delivery_no", length = 30, columnDefinition = "VARCHAR(30) COMMENT '반품/교환 관련 송장번호'")
    private String returnExchangeDeliveryNo;

    @Column(name = "delivery_code", length = 30, columnDefinition = "VARCHAR(30) COMMENT '택배사 구분(우체국 : 1 / 용마: 2)'")
    private String deliveryCode;

    @Column(name = "cancel_data", length = 1000, columnDefinition = "VARCHAR(1000) COMMENT '취소 데이터'")
    private String cancelData;

    @Column(name = "cancel_reason", length = 6, columnDefinition = "VARCHAR(6) COMMENT '취소 사유'")
    private String cancelReason;

    @Column(name = "cancel_detail", columnDefinition = "LONGTEXT")
    private String cancelDetail;
}
