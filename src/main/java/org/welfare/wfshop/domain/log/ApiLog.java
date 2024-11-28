package org.welfare.wfshop.domain.log;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_api_log_all",
        indexes = {
                @Index(name = "idx_order_product_code", columnList = "order_product_code")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ApiLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT COMMENT 'API 로그 고유 번호 (Primary Key)'")
    private Long id;

    @Column(name = "update_date", columnDefinition = "DATETIME COMMENT 'API 호출 또는 업데이트 발생 시간'")
    private LocalDateTime updateDate;

    @Column(name = "order_product_code", length = 100, columnDefinition = "VARCHAR(100) COMMENT '주문 상품 코드 (API 호출 대상, 주문과 연관된 고유 코드)'")
    private String orderProductCode;

    @Lob
    @Column(name = "apijson", columnDefinition = "LONGTEXT")
    private String apiJson;
}
