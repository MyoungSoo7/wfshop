package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_order_product_cancel",
        indexes = {
                @Index(name = "idx_tb_market_order_product_cancel_order_id", columnList = "order_id"),
                @Index(name = "idx_tb_market_order_product_cancel_cno", columnList = "cno"),
                @Index(name = "idx_tb_market_order_product_cancel_product_id", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderProductCancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "order_id", nullable = false, columnDefinition = "INT DEFAULT 0 COMMENT '주문 정보 테이블 아이디 (tb_market_order_product 참조)'")
    private Integer orderId;

    @Column(name = "cno", length = 50, columnDefinition = "VARCHAR(50) COMMENT 'PG거래 번호 (결제 Gateway 거래 번호)'")
    private String cno;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원번호 (회원 고유 번호)'")
    private String memberNo;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블 참조)'")
    private Integer productId;

    @Column(name = "order_product_code", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문 상품 코드'")
    private String orderProductCode;

    @Column(name = "cnt_cancel_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '수량 부분 취소 여부 (Y/N)'")
    private String cntCancelYn;

    @Column(name = "cancel_real_price", columnDefinition = "INT DEFAULT 0 COMMENT '수량 부분 취소 선택 금액'")
    private Integer cancelRealPrice;

    @Column(name = "cnt_pay_price", columnDefinition = "INT COMMENT '취소된 상품의 결제 금액'")
    private Integer cntPayPrice;

    @Column(name = "cancel_product_count", columnDefinition = "INT DEFAULT 0 COMMENT '취소 수량'")
    private Integer cancelProductCount;

    @Column(name = "cancel_product_count_msg", length = 500, columnDefinition = "VARCHAR(500) COMMENT '수량 취소 사유'")
    private String cancelProductCountMsg;

    @Column(name = "coupon_return_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'Y' COMMENT '쿠폰 반환 여부 (Y/N)'")
    private String couponReturnYn;

    @Column(name = "cancel_price", columnDefinition = "INT DEFAULT 0 COMMENT '취소 금액'")
    private Integer cancelPrice;

    @Column(name = "cancel_cp_point", columnDefinition = "INT DEFAULT 0 COMMENT '취소 포인트 (충전식)'")
    private Integer cancelCpPoint;

    @Column(name = "cancel_ep_point", columnDefinition = "INT DEFAULT 0 COMMENT '취소 포인트 (적립식)'")
    private Integer cancelEpPoint;

    @Column(name = "reg_date", columnDefinition = "DATETIME COMMENT '등록 날짜'")
    private LocalDateTime regDate;
}
