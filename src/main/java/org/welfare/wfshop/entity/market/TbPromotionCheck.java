package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_promotion_check", indexes = {
        @Index(name = "idx_product_id", columnList = "product_id"),
        @Index(name = "idx_promo_start_date", columnList = "promo_start_date"),
        @Index(name = "idx_promo_end_date", columnList = "promo_end_date"),
        @Index(name = "idx_promotion_yn", columnList = "promotion_yn")
})
public class TbPromotionCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name", length = 500)
    private String productName;

    @Column(name = "promo_cate_name", length = 50)
    private String promoCateName;

    @Column(name = "promo_start_date")
    private LocalDate promoStartDate;

    @Column(name = "promo_end_date")
    private LocalDate promoEndDate;

    @Column(name = "promotion_yn", length = 50)
    private String promotionYn;

    @Column(name = "product_code", length = 255)
    private String productCode;
}
