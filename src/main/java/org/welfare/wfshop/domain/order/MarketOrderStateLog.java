package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_order_state_log",
        indexes = {
                @Index(name = "idx_order_no", columnList = "order_no, order_product_code")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketOrderStateLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_seq", nullable = false, columnDefinition = "INT COMMENT '로그 시퀀스 (Primary Key)'")
    private Integer logSeq;

    @Column(name = "order_id", columnDefinition = "INT COMMENT '주문 정보 테이블 아이디 (tb_market_order_product 참조)'")
    private Integer orderId;

    @Column(name = "order_no", length = 50, columnDefinition = "VARCHAR(50) COMMENT '주문 번호'")
    private String orderNo;

    @Column(name = "order_product_code", length = 255, columnDefinition = "VARCHAR(255) COMMENT '주문번호 - 하위 상품 주문번호'")
    private String orderProductCode;

    @Column(name = "old_order_state", length = 50, columnDefinition = "VARCHAR(50) COMMENT '이전 주문 상태값'")
    private String oldOrderState;

    @Column(name = "new_order_state", length = 50, columnDefinition = "VARCHAR(50) COMMENT '변경된 주문 상태값'")
    private String newOrderState;

    @Column(name = "log_date", columnDefinition = "DATETIME COMMENT '변경된 주문 상태 값 날짜'")
    private LocalDateTime logDate;
}
