package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;
import org.welfare.wfshop.domain.market.Market;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_order_product",
        indexes = {
                @Index(name = "idx_tb_market_order_product_cno", columnList = "cno"),
                @Index(name = "tb_market_order_product_order_product_code_IDX", columnList = "order_product_code"),
                @Index(name = "tb_market_order_product_order_id_IDX", columnList = "order_id"),
                @Index(name = "fk_product", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_market_id", foreignKey = @ForeignKey(name = "fk_child_parent"), nullable = false)
    private MarketOrder marketOrder;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", foreignKey = @ForeignKey(name = "fk_product"))
    private Market market;

    @Column(name = "cno", length = 50, columnDefinition = "VARCHAR(50) COMMENT 'PG거래 번호 (결제 Gateway 거래 번호)'")
    private String cno;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원번호 (회원 고유 번호)'")
    private String memberNo;

    @Column(name = "order_product_code", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문 상품 코드'")
    private String orderProductCode;

    @Column(name = "product_count", columnDefinition = "INT COMMENT '상품 수량'")
    private Integer productCount;

    @Column(name = "product_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 코드'")
    private String productCode;

    @Column(name = "product_sub_price", columnDefinition = "INT COMMENT '상품 개별 합계 금액'")
    private Integer productSubPrice;

    @Column(name = "product_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '총 합 가격 (상품 가격 + 옵션 가격 - 할인 금액)'")
    private Integer totalPrice;

    @Column(name = "product_price", columnDefinition = "INT COMMENT '상품 가격'")
    private Integer productPrice;

    @Column(name = "discount_price", columnDefinition = "INT DEFAULT 0 COMMENT '할인 금액'")
    private Integer discountPrice;

    @Column(name = "pay_price", columnDefinition = "INT COMMENT '실제 결제 금액'")
    private Integer payPrice;

    @Column(name = "file_master_thumb", length = 50, columnDefinition = "VARCHAR(50) COMMENT '이미지 코드 (썸네일 이미지)'")
    private String fileMasterThumb;

    @Column(name = "option_serial", length = 100, columnDefinition = "VARCHAR(100) COMMENT '옵션 시리얼 (tb_market_opt_item 참조)'")
    private String optionSerial;

    @Column(name = "item_serial", length = 100, columnDefinition = "VARCHAR(100) COMMENT '옵션 항목 시리얼 (tb_market_opt_item 참조)'")
    private String itemSerial;

    @Column(name = "option_item_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '옵션 항목 이름'")
    private String optionItemName;

    @Column(name = "option_item_price", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 가격'")
    private Integer optionItemPrice;

    @Column(name = "option_item_count", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 수량'")
    private Integer optionItemCount;

    @Column(name = "option_item_sub_price", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 총 가격 (항목 가격 x 항목 수량)'")
    private Integer optionItemSubPrice;

    @Column(name = "cart_type", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '구매 유형 (N: 바로 구매, C: 장바구니)'")
    private String cartType;

    @Column(name = "discount_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '상품 할인 여부 (Y/N)'")
    private String discountYn;

    @Column(name = "coupon_seq", length = 255, columnDefinition = "VARCHAR(255) COMMENT '쿠폰 번호'")
    private String couponSeq;

    @Column(name = "order_state", length = 6, columnDefinition = "VARCHAR(6) COMMENT '주문 상태 코드'")
    private String orderState;

    @Column(name = "order_state_date", columnDefinition = "DATETIME COMMENT '주문 상태 변경 날짜'")
    private LocalDateTime orderStateDate;

    @Column(name = "delivery_number", length = 50, columnDefinition = "VARCHAR(50) COMMENT '배송 번호'")
    private String deliveryNumber;

    @Column(name = "delivery_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '배송 코드'")
    private String deliveryCode;

    @Column(name = "delivery_start_date", columnDefinition = "TIMESTAMP NULL COMMENT '배송 시작 날짜'")
    private LocalDateTime deliveryStartDate;

    @Column(name = "delivery_end_date", columnDefinition = "TIMESTAMP NULL COMMENT '배송 완료 날짜'")
    private LocalDateTime deliveryEndDate;

    @Column(name = "sale_item_price", columnDefinition = "INT COMMENT '판매 상품 가격'")
    private Integer saleItemPrice;

    @Column(name = "delivery_date_time", columnDefinition = "DATETIME COMMENT '배송 시작 시간 (API 연동)'")
    private LocalDateTime deliveryDateTime;


}
