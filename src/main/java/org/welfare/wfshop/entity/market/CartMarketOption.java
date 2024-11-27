package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_cart_market_option",
        indexes = {
                @Index(name = "idx_product_id", columnList = "PRODUCT_ID"),
                @Index(name = "idx_cart_market_seq", columnList = "CART_MARKET_SEQ")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartMarketOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQ", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "CART_MARKET_SEQ", columnDefinition = "INT COMMENT 'tb_cart_market 테이블의 seq (외래 키)'")
    private Integer cartMarketSeq;

    @Column(name = "MEMBER_NO", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "PRODUCT_ID", columnDefinition = "INT COMMENT '상품 ID (tb_market 테이블의 product_id와 연관)'")
    private Integer productId;

    @Column(name = "PRODUCT_CODE", length = 20, columnDefinition = "VARCHAR(20) COMMENT '상품 코드 (고유 식별자)'")
    private String productCode;

    @Column(name = "OPTION_GROUP_NO", columnDefinition = "INT COMMENT '옵션 그룹 번호'")
    private Integer optionGroupNo;

    @Column(name = "OPTION_SERIAL", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 옵션 시리얼 번호'")
    private String optionSerial;

    @Column(name = "OPTION_ITEM_SERIAL", length = 50, columnDefinition = "VARCHAR(50) COMMENT '옵션 항목 시리얼 번호'")
    private String optionItemSerial;

    @Column(name = "OPTION_ITEM_NAME", length = 255, columnDefinition = "VARCHAR(255) COMMENT '옵션 항목 이름'")
    private String optionItemName;

    @Column(name = "OPTION_ITEM_PRICE", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 가격 (기본값: 0)'")
    private Integer optionItemPrice;

    @Column(name = "OPTION_ITEM_COUNT", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 수량 (기본값: 0)'")
    private Integer optionItemCount;

    @Column(name = "OPTION_ITEM_SUB_PRICE", columnDefinition = "INT DEFAULT 0 COMMENT '옵션 항목 가격 x 항목 수량 값 (기본값: 0)'")
    private Integer optionItemSubPrice;
}

