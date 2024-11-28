package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_fulltext",

        indexes = {
                @Index(name = "market_keyword_ngram", columnList = "keywords", unique = false),
                @Index(name = "tb_market_fulltext_keyword_idx", columnList = "keywords", unique = false)
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketFulltext {

    @Id
    @Column(name = "product_id", nullable = false, columnDefinition = "INT COMMENT '상품 ID'")
    private Integer productId;

    @Column(name = "keywords", nullable = false, columnDefinition = "TEXT COMMENT '키워드'")
    private String keywords;
}
