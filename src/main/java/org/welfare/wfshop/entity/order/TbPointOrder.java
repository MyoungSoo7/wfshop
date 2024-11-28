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
@Table(name = "tb_point_order", indexes = {
        @Index(name = "idx_order_no", columnList = "order_no"),
        @Index(name = "idx_member_no", columnList = "member_no")
})
public class TbPointOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "cno", length = 50)
    private String cno;

    @Column(name = "order_state", length = 50)
    private String orderState;

    @Column(name = "member_no", length = 50)
    private String memberNo;

    @Column(name = "order_no", length = 50)
    private String orderNo;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column(name = "user_phone_no", length = 50)
    private String userPhoneNo;

    @Column(name = "user_telephone_no", length = 50)
    private String userTelephoneNo;

    @Column(name = "user_email", length = 50)
    private String userEmail;

    @Column(name = "user_hospital_name", length = 50)
    private String userHospitalName;

    @Column(name = "user_work_type", length = 50)
    private String userWorkType;

    @Column(name = "user_hospital_postcode", length = 50)
    private String userHospitalPostcode;

    @Column(name = "user_hospital_address", length = 50)
    private String userHospitalAddress;

    @Column(name = "user_hospital_address_detail", length = 50)
    private String userHospitalAddressDetail;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name", length = 500)
    private String productName;

    @Column(name = "pay_price", columnDefinition = "INT DEFAULT 0")
    private Integer payPrice;

    @Column(name = "pay_type", length = 50)
    private String payType;

    @Column(name = "order_date_time")
    private LocalDateTime orderDateTime;

    @Column(name = "cancel_date_time")
    private LocalDateTime cancelDateTime;

    @Column(name = "memo", length = 1024)
    private String memo;

    @Column(name = "receipt_type", length = 50)
    private String receiptType;

    @Column(name = "business_owner", length = 50)
    private String businessOwner;

    @Column(name = "business_no", length = 50)
    private String businessNo;

    @Column(name = "business_postcode", length = 50)
    private String businessPostcode;

    @Column(name = "business_address", length = 50)
    private String businessAddress;

    @Column(name = "business_address_detail", length = 50)
    private String businessAddressDetail;

    @Column(name = "business_name", length = 50)
    private String businessName;

    @Column(name = "business_industry", length = 50)
    private String businessIndustry;

    @Column(name = "business_sector", length = 50)
    private String businessSector;

    @Column(name = "business_file_master_code", length = 50)
    private String businessFileMasterCode;

    @Column(name = "tax_receipt_no", length = 50)
    private String taxReceiptNo;

    @Column(name = "card_type", length = 20)
    private String cardType;

    @Column(name = "cash_receipt_type", length = 255)
    private String cashReceiptType;

    @Column(name = "contract_master_code", length = 30)
    private String contractMasterCode;

    @Column(name = "pay_date_time")
    private LocalDateTime payDateTime;

    @Column(name = "receipt_yn", length = 2, columnDefinition = "CHAR(2) DEFAULT 'N'")
    private String receiptYn;

    @Column(name = "virtual_bank_cd", length = 5)
    private String virtualBankCd;

    @Column(name = "virtual_bank_nm", length = 50)
    private String virtualBankNm;

    @Column(name = "virtual_account_no", length = 100)
    private String virtualAccountNo;

    @Column(name = "virtual_deposit_nm", length = 50)
    private String virtualDepositNm;

    @Column(name = "virtual_expire_date")
    private LocalDateTime virtualExpireDate;

    @Column(name = "point_paid", length = 1)
    private String pointPaid;
}

