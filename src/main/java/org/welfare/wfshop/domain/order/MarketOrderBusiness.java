package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_market_order_business" 
       )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderBusiness {

    @Id
    @Column(name = "order_market_id", nullable = false, columnDefinition = "INT COMMENT '주문 정보 테이블 아이디 (Foreign Key)'")
    private Integer orderMarketId;

    @Column(name = "bussiness_owner", length = 50, columnDefinition = "VARCHAR(50) COMMENT '세금계산서 대표자 명'")
    private String businessOwner;

    @Column(name = "bussiness_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '세금계산서 사업자등록번호'")
    private String businessNo;

    @Column(name = "bussiness_address", length = 50, columnDefinition = "VARCHAR(50) COMMENT '세금계산서 사업장 주소'")
    private String businessAddress;
}
