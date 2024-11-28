package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_order_education", indexes = {
        @Index(name = "idx_member_no", columnList = "member_no"),
        @Index(name = "idx_order_state", columnList = "order_state")
})
public class TbOrderEducation {

    @Id
    @Column(name = "order_no", length = 20, nullable = false)
    private String orderNo;

    @Column(name = "order_state", length = 8, nullable = false)
    private String orderState;

    @Column(name = "education_no", length = 20, nullable = false)
    private String educationNo;

    @Column(name = "member_no", length = 20, nullable = false)
    private String memberNo;

    @Column(name = "applicant_name_kr", length = 50, nullable = false)
    private String applicantNameKr;

    @Column(name = "applicant_name_en", length = 20, nullable = false)
    private String applicantNameEn;

    @Column(name = "applicant_phone_no", length = 100, nullable = false)
    private String applicantPhoneNo;

    @Column(name = "applicant_email", length = 200, nullable = false)
    private String applicantEmail;

    @Column(name = "applicant_hospital_name", length = 20, nullable = false)
    private String applicantHospitalName;

    @Column(name = "applicant_work_type", length = 30, nullable = false)
    private String applicantWorkType;

    @Column(name = "applicant_hospital_postcode", length = 5, nullable = false)
    private String applicantHospitalPostcode;

    @Column(name = "applicant_hospital_address", length = 200, nullable = false)
    private String applicantHospitalAddress;

    @Column(name = "applicant_hospital_address_detail", length = 200, nullable = false)
    private String applicantHospitalAddressDetail;

    @Column(name = "earn_point", columnDefinition = "INT DEFAULT 0")
    private Integer earnPoint;

    @Column(name = "use_point", columnDefinition = "INT DEFAULT 0")
    private Integer usePoint;

    @Column(name = "coupon_code", length = 20)
    private String couponCode;

    @Column(name = "price", columnDefinition = "INT DEFAULT 0")
    private Integer price;

    @Column(name = "discount_price", columnDefinition = "INT DEFAULT 0")
    private Integer discountPrice;

    @Column(name = "pay_price", columnDefinition = "INT DEFAULT 0")
    private Integer payPrice;

    @Column(name = "payment_type", length = 20)
    private String paymentType;

    @Column(name = "receipt_type", length = 1, nullable = false)
    private String receiptType;

    @Column(name = "business_name", length = 50)
    private String businessName;

    @Column(name = "business_owner", length = 50)
    private String businessOwner;

    @Column(name = "business_no", length = 20)
    private String businessNo;

    @Column(name = "business_postcode", length = 5)
    private String businessPostcode;

    @Column(name = "business_address", length = 200)
    private String businessAddress;

    @Column(name = "business_address_detail", length = 200)
    private String businessAddressDetail;

    @Column(name = "business_industry", length = 200)
    private String businessIndustry;

    @Column(name = "business_sector", length = 200)
    private String businessSector;

    @Column(name = "business_file_master_code", length = 200)
    private String businessFileMasterCode;

    @Column(name = "tax_receipt_no", length = 20)
    private String taxReceiptNo;

    @Column(name = "buy_path_code", length = 6, nullable = false)
    private String buyPathCode;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "cancel_apply_date")
    private LocalDateTime cancelApplyDate;

    @Column(name = "cancel_cmpl_date")
    private LocalDateTime cancelCmplDate;

    @Column(name = "check_no", length = 20)
    private String checkNo;

    @Column(name = "admin_memo", columnDefinition = "LONGTEXT", nullable = false)
    private String adminMemo;

    @Column(name = "delete_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'", nullable = false)
    private String deleteYn;

    @Column(name = "cancel_reason", length = 50)
    private String cancelReason;

    @Column(name = "return_apply_date")
    private LocalDateTime returnApplyDate;

    @Column(name = "mod_date")
    private LocalDate modDate;

    @Column(name = "modify_no", length = 255)
    private String modifyNo;
}
