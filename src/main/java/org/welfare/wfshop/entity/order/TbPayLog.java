package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_pay_log", indexes = {
        @Index(name = "idx_order_no", columnList = "order_no"),
        @Index(name = "idx_member_no", columnList = "member_no")
})
public class TbPayLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_no", nullable = false)
    private Integer payNo;

    @Column(name = "order_no", length = 20)
    private String orderNo;

    @Column(name = "member_no", length = 20)
    private String memberNo;

    @Column(name = "pay_date")
    private LocalDateTime payDate;

    @Column(name = "pay_cancel_date")
    private LocalDateTime payCancelDate;

    @Column(name = "cancel_code", length = 6)
    private String cancelCode;

    @Column(name = "pay_state", length = 6)
    private String payState;

    @Column(name = "pay_method", length = 6)
    private String payMethod;

    @Column(name = "pay_company", length = 50)
    private String payCompany;

    @Column(name = "pay_price")
    private Integer payPrice;

    @Column(name = "coupon_code", length = 20)
    private String couponCode;

    @Column(name = "discount_price")
    private Integer discountPrice;

    @Column(name = "use_point")
    private Integer usePoint;

    @Column(name = "pay_memo", length = 200)
    private String payMemo;

    @Column(name = "shop_transaction_id", length = 60)
    private String shopTransactionId;

    @Column(name = "pg_cno", length = 20)
    private String pgCno;

    @Column(name = "res_cd", length = 4)
    private String resCd;

    @Column(name = "res_msg", length = 100)
    private String resMsg;

    @Column(name = "transaction_date", length = 14)
    private String transactionDate;

    @Column(name = "revise_message", length = 100)
    private String reviseMessage;

    @Column(name = "status_code", length = 4)
    private String statusCode;

    @Column(name = "coupon_price")
    private Integer couponPrice;
}
