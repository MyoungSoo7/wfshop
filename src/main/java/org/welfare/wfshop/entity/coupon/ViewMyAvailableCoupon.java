package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "view_my_available_coupon", indexes = {
        @Index(name = "idx_member_no", columnList = "member_no"),
        @Index(name = "idx_code", columnList = "code"),
        @Index(name = "idx_is_used", columnList = "is_used"),
        @Index(name = "idx_is_view", columnList = "is_view"),
        @Index(name = "idx_expired_date", columnList = "expired_date")
})
public class ViewMyAvailableCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_seq", nullable = false)
    private Integer detailSeq;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "expired_date", length = 10)
    private String expiredDate;

    @Column(name = "expired_end_date", length = 30)
    private String expiredEndDate;

    @Column(name = "expired_start_date", length = 30)
    private String expiredStartDate;

    @Column(name = "expired_type", length = 1)
    private String expiredType;

    @Column(name = "is_del", length = 1)
    private String isDel;

    @Column(name = "is_duplicated", length = 1)
    private String isDuplicated;

    @Column(name = "is_used", length = 1)
    private String isUsed;

    @Column(name = "is_view", length = 1)
    private String isView;

    @Column(name = "issued_count")
    private Integer issuedCount;

    @Column(name = "job_type", length = 6)
    private String jobType;

    @Column(name = "market_list", columnDefinition = "LONGTEXT")
    private String marketList;

    @Column(name = "market_type", length = 50)
    private String marketType;

    @Column(name = "max_issued_count", length = 50)
    private String maxIssuedCount;

    @Column(name = "member_no", length = 20, nullable = false)
    private String memberNo;

    @Column(name = "mod_date")
    private java.sql.Date modDate;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "off_line_program_type", length = 50)
    private String offLineProgramType;

    @Column(name = "offline_program_list", columnDefinition = "LONGTEXT")
    private String offlineProgramList;

    @Column(name = "online_program_list", columnDefinition = "LONGTEXT")
    private String onlineProgramList;

    @Column(name = "online_program_type", length = 50)
    private String onlineProgramType;

    @Column(name = "print_date", nullable = false)
    private java.sql.Date printDate;

    @Column(name = "promotion_list", columnDefinition = "LONGTEXT")
    private String promotionList;

    @Column(name = "promotion_type", length = 50)
    private String promotionType;

    @Column(name = "reg_date")
    private java.sql.Date regDate;

    @Column(name = "sale_percent", length = 50)
    private String salePercent;

    @Column(name = "sale_percent_max", length = 50)
    private String salePercentMax;

    @Column(name = "sale_price", length = 50)
    private String salePrice;

    @Column(name = "sale_type", length = 1)
    private String saleType;

    @Column(name = "seq")
    private Integer seq;

    @Column(name = "type", length = 1)
    private String type;

    @Column(name = "use_min_price", length = 50)
    private String useMinPrice;

    @Column(name = "use_target", columnDefinition = "LONGTEXT")
    private String useTarget;

    @Column(name = "use_target_type", length = 1)
    private String useTargetType;

    @Column(name = "used_count")
    private Integer usedCount;

    @Column(name = "used_date")
    private java.sql.Date usedDate;
}
