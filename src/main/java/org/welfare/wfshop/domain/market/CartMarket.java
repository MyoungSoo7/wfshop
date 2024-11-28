package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;
import org.welfare.wfshop.domain.member.entity.Member;

@Entity
@Table(
        name = "tb_cart_market",
        indexes = {
                @Index(name = "ix_member_product", columnList = "member_no, product_id"),
                @Index(name = "ix_cart_type", columnList = "cart_type")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartMarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;


    @Column(name = "product_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '상품 번호'")
    private String productCode;

    @Column(name = "product_count", columnDefinition = "BIGINT DEFAULT 1 COMMENT '상품 수량'")
    private Long productCount;

    @Column(name = "product_name", length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "discount_price", columnDefinition = "INT DEFAULT 0 COMMENT '할인 금액'")
    private Integer discountPrice;

    @Column(name = "total_price", columnDefinition = "INT DEFAULT 0 COMMENT '총 금액'")
    private Integer totalPrice;

    @Column(name = "product_price", columnDefinition = "INT DEFAULT 0 COMMENT '상품 금액'")
    private Integer productPrice;

    @Column(name = "product_sub_price", columnDefinition = "INT DEFAULT 0 COMMENT '상품 부가 금액'")
    private Integer productSubPrice;

    @Column(name = "pay_price", columnDefinition = "INT DEFAULT 0 COMMENT '결제 금액'")
    private Integer payPrice;

    @Column(name = "file_master_thumb", length = 50, columnDefinition = "VARCHAR(50) COMMENT '이미지 코드'")
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

    @Column(name = "cart_type", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT 'N:바로구매, C:장바구니'")
    private String cartType;

    @Column(name = "discount_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '상품 할인 여부 (Y/N)'")
    private String discountYn;

    @Column(name = "cart_view_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '장바구니 노출 여부 (Y/N)'")
    private String cartViewYn;

    @Column(name = "medicine_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '의약품 여부 (Y/N)'")
    private String medicineYn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(name = "fk_cart_product"),
            nullable = false
    )
    private Market market;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "member_no",
            referencedColumnName = "member_no",
            foreignKey = @ForeignKey(name = "fk_user"),
            nullable = false
    )
    private Member member;
}

