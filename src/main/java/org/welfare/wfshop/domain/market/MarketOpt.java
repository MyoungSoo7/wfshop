package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_opt"
     )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOpt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스'")
    private Integer seq;

    @Column(name = "product_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 코드'")
    private String productCode;

    @Column(name = "option_serial", length = 100, columnDefinition = "VARCHAR(100) COMMENT '옵션 시리얼'")
    private String optionSerial;

    @Column(name = "name", length = 255, columnDefinition = "VARCHAR(255) COMMENT '옵션 이름'")
    private String name;

    @Column(name = "price", length = 255, columnDefinition = "VARCHAR(255) COMMENT '옵션 가격'")
    private String price;
}
