package org.welfare.wfshop.domain.coupon;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "view_my_available_find_coupon")
public class ViewMyAvailableFindCoupon {

    @Id
    @Column(name = "DETAIL_SEQ", nullable = false)
    private Integer detailSeq;

    @Column(name = "MEMBER_NO", nullable = false)
    private String memberNo;

    @Column(name = "USED_DATE")
    private java.sql.Date usedDate;

    @Column(name = "PRINT_DATE")
    private java.sql.Date printDate;

    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SALE_TYPE")
    private String saleType;

    @Column(name = "IS_USED")
    private String isUsed;

    @Column(name = "EXPIRED_TYPE")
    private String expiredType;

    @Column(name = "EXPIRED_START_DATE")
    private String expiredStartDate;

    @Column(name = "EXPIRED_END_DATE")
    private String expiredEndDate;

    @Column(name = "EXPIRED_DATE")
    private String expiredDate;

    @Column(name = "SALE_PRICE")
    private String salePrice;

    @Column(name = "SALE_PERCENT")
    private String salePercent;

    @Column(name = "SALE_PERCENT_MAX")
    private String salePercentMax;

    @Column(name = "USE_MIN_PRICE")
    private String useMinPrice;

    @Column(name = "USE_TARGET_TYPE")
    private String useTargetType;

    @Column(name = "USE_TARGET")
    private String useTarget;

    @Column(name = "MAX_ISSUED_COUNT")
    private String maxIssuedCount;

    @Column(name = "ISSUED_COUNT")
    private Integer issuedCount;

    @Column(name = "USED_COUNT")
    private Integer usedCount;

    @Column(name = "IS_DUPLICATED")
    private String isDuplicated;

    @Column(name = "OFF_LINE_PROGRAM_TYPE")
    private String offLineProgramType;

    @Column(name = "OFFLINE_PROGRAM_LIST")
    private String offlineProgramList;

    @Column(name = "ONLINE_PROGRAM_TYPE")
    private String onlineProgramType;

    @Column(name = "ONLINE_PROGRAM_LIST")
    private String onlineProgramList;

    @Column(name = "PROMOTION_TYPE")
    private String promotionType;

    @Column(name = "PROMOTION_LIST")
    private String promotionList;

    @Column(name = "MARKET_TYPE")
    private String marketType;

    @Column(name = "MARKET_LIST")
    private String marketList;

    @Column(name = "IS_VIEW")
    private String isView;

    @Column(name = "IS_DEL")
    private String isDel;

    @Column(name = "REG_DATE")
    private java.sql.Date regDate;

    @Column(name = "MOD_DATE")
    private java.sql.Date modDate;

    @Column(name = "JOB_TYPE")
    private String jobType;
}
