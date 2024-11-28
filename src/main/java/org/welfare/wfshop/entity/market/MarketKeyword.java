package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_keyword",
        indexes = {
                @Index(name = "FKjtykwbmocmsin5giq20wg2elx", columnList = "product_id")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "keyword_id", nullable = false, columnDefinition = "INT COMMENT '키워드 ID'")
    private Integer keywordId;

    @Column(name = "keyword_name", length = 200, columnDefinition = "VARCHAR(200) COMMENT '키워드 이름'")
    private String keywordName;


    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", foreignKey = @ForeignKey(name = "FKjtykwbmocmsin5giq20wg2elx"))
    private Market market;
}
