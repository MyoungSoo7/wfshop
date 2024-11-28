package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_order_product_option_temp",
        indexes = {
                @Index(name = "idx_product_temp_seq", columnList = "product_temp_seq"),
                @Index(name = "idx_member_no", columnList = "member_no")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderProductOptionTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "product_temp_seq", columnDefinition = "INT COMMENT '임시 주문 상품 SEQ (tb_market_order_product_temp 참조)'")
    private Integer productTempSeq;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호 (회원 고유 번호)'")
    private String memberNo;

    @Column(name = "product_id", columnDefinition = "INT COMMENT '상품 아이디 (tb_market 테이블 참조)'")
    private Integer productId;

    @Column(name = "product_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '상품 번호'")
    private String productCode;

    @Column(name = "option_group_no", columnDefinition = "INT COMMENT '옵션 그룹 번호'")
    private Integer optionGroupNo;

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
}
