package org.welfare.wfshop.domain.order;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_point_all", indexes = {
        @Index(name = "idx_member_no", columnList = "member_no"),
        @Index(name = "idx_admin_no", columnList = "admin_no")
})
public class TbPointAll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id", nullable = false)
    private Integer pointId;

    @Column(name = "member_no", length = 20)
    private String memberNo;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "url", length = 255)
    private String url;

    @Column(name = "amount", columnDefinition = "BIGINT DEFAULT 0")
    private Long amount;

    @Column(name = "balance", columnDefinition = "BIGINT DEFAULT 0")
    private Long balance;

    @Column(name = "memo", length = 255)
    private String memo;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @Column(name = "expect_date")
    private LocalDateTime expectDate;

    @Column(name = "expire_date")
    private LocalDateTime expireDate;

    @Column(name = "account_number", length = 50)
    private String accountNumber;

    @Column(name = "bank_code", length = 20)
    private String bankCode;

    @Column(name = "depositor", length = 20)
    private String depositor;

    @Column(name = "education_no", length = 255)
    private String educationNo;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_type", length = 6)
    private String productType;

    @Column(name = "product_name", length = 500)
    private String productName;

    @Column(name = "category_name", length = 200)
    private String categoryName;

    @Column(name = "order_no", length = 255)
    private String orderNo;

    @Column(name = "record", length = 40)
    private String record;

    @Column(name = "earn_type", length = 100)
    private String earnType;

    @Column(name = "admin_no", length = 15)
    private String adminNo;

    @Column(name = "order_product_code", length = 255)
    private String orderProductCode;

    @Column(name = "ground_payment", columnDefinition = "LONGTEXT")
    private String groundPayment;

    @Column(name = "search_keyword", columnDefinition = "LONGTEXT")
    private String searchKeyword;

    @Column(name = "sdate", length = 100)
    private String sdate;

    @Column(name = "edate", length = 100)
    private String edate;

    @Column(name = "acc_amount", columnDefinition = "MEDIUMTEXT")
    private String accAmount;

    @Column(name = "cha_amount", columnDefinition = "MEDIUMTEXT")
    private String chaAmount;
}
