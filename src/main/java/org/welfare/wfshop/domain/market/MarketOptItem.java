package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_opt_item"
        )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOptItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스'")
    private Integer seq;

    @Column(name = "product_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 코드'")
    private String productCode;

    @Column(name = "option_serial", length = 100, columnDefinition = "VARCHAR(100) COMMENT '옵션 시리얼'")
    private String optionSerial;

    @Column(name = "item_serial", length = 100, columnDefinition = "VARCHAR(100) COMMENT '아이템 시리얼 (yyyy mm dd)'")
    private String itemSerial;

    @Column(name = "name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '아이템 이름'")
    private String name;

    @Column(name = "price", columnDefinition = "INT COMMENT '아이템 가격'")
    private Integer price;

    @Column(name = "open_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'Y' COMMENT '공개 여부 (Y: 공개, N: 비공개)'")
    private String openYn;

    @Column(name = "stock_yn", length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N' COMMENT '재고 여부 (Y: 품절, N: 재고 있음)'")
    private String stockYn;
}
