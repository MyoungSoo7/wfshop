package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_order_product_temp",
        indexes = {
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_product_id", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderProductTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호 (회원 고유 번호)'")
    private String memberNo;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 아이디 (tb_market 테이블 참조)'")
    private Integer productId;

    @Column(name = "product_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '상품 번호'")
    private String productCode;

    @Column(name = "product_count", columnDefinition = "INT COMMENT '상품 수량'")
    private Integer productCount;

    @Column(name = "product_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "discount_price", columnDefinition = "INT COMMENT '할인 금액'")
    private Integer discountPrice;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '총 금액 (상품 금액 + 옵션 금액 - 할인 금액)'")
    private Integer totalPrice;

    @Column(name = "product_price", columnDefinition = "INT COMMENT '상품 금액'")
    private Integer productPrice;

    @Column(name = "product_sub_price", columnDefinition = "INT COMMENT '상품 개별 합계 금액'")
    private Integer productSubPrice;

    @Column(name = "pay_price", columnDefinition = "INT COMMENT '실제 결제 금액'")
    private Integer payPrice;

    @Column(name = "file_master_thumb", length = 50, columnDefinition = "VARCHAR(50) COMMENT '이미지 코드 (썸네일 이미지)'")
    private String fileMasterThumb;

    @Column(name = "option_serial", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 옵션 시리얼'")
    private String optionSerial;

    @Column(name = "option_item_serial", length = 50, columnDefinition = "VARCHAR(50) COMMENT '옵션 아이템 시리얼'")
    private String optionItemSerial;

    @Column(name = "option_item_name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '옵션 항목 이름'")
    private String optionItemName;

    @Column(name = "option_item_price", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 가격'")
    private Integer optionItemPrice;

    @Column(name = "option_item_count", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 수량'")
    private Integer optionItemCount;

    @Column(name = "option_item_sub_price", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 가격 x 항목 수량 값'")
    private Integer optionItemSubPrice;

    @Column(name = "cart_type", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '구매 유형 (N: 바로구매, C: 장바구니)'")
    private String cartType;

    @Column(name = "discount_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '상품 할인 여부 (Y/N)'")
    private String discountYn;

    @Column(name = "cart_view_yn", length = 255, columnDefinition = "VARCHAR(255) COMMENT '장바구니 노출 여부'")
    private String cartViewYn;

    @Column(name = "promotion_yn", length = 1, columnDefinition = "VARCHAR(1) COMMENT '프로모션 여부 (Y/N)'")
    private String promotionYn;
}
