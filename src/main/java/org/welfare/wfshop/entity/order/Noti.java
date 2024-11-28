package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_noti",
        indexes = {
                @Index(name = "idx_r_order_no", columnList = "r_order_no"),
                @Index(name = "idx_r_cno", columnList = "r_cno")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Noti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer idx;

    @Column(name = "r_res_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '응답 코드'")
    private String rResCd;

    @Column(name = "r_res_msg", length = 255, columnDefinition = "VARCHAR(255) COMMENT '응답 메시지'")
    private String rResMsg;

    @Column(name = "r_cno", length = 100, columnDefinition = "VARCHAR(100) COMMENT 'PG 거래 번호'")
    private String rCno;

    @Column(name = "product_type", length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품 유형'")
    private String productType;

    @Column(name = "r_memb_id", length = 100, columnDefinition = "VARCHAR(100) COMMENT '가맹점 ID'")
    private String rMembId;

    @Column(name = "r_amount", length = 100, columnDefinition = "VARCHAR(100) COMMENT '총 결제 금액'")
    private String rAmount;

    @Column(name = "r_order_no", length = 100, columnDefinition = "VARCHAR(100) COMMENT '주문 번호'")
    private String rOrderNo;

    @Column(name = "r_noti_type", length = 45, columnDefinition = "VARCHAR(45) COMMENT '노티 구분'")
    private String rNotiType;

    @Column(name = "r_auth_no", length = 100, columnDefinition = "VARCHAR(100) COMMENT '승인 번호'")
    private String rAuthNo;

    @Column(name = "r_tran_date", length = 100, columnDefinition = "VARCHAR(100) COMMENT '승인/변경 일시'")
    private String rTranDate;

    @Column(name = "r_card_no", length = 255, columnDefinition = "VARCHAR(255) COMMENT '카드 번호'")
    private String rCardNo;

    @Column(name = "r_issuer_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '발급사 코드'")
    private String rIssuerCd;

    @Column(name = "r_issuer_nm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '발급사명'")
    private String rIssuerNm;

    @Column(name = "r_acquirer_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '매입사 코드'")
    private String rAcquirerCd;

    @Column(name = "r_acquirer_nm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '매입사명'")
    private String rAcquirerNm;

    @Column(name = "r_install_period", length = 45, columnDefinition = "VARCHAR(45) COMMENT '할부 개월'")
    private String rInstallPeriod;

    @Column(name = "r_noint", length = 45, columnDefinition = "VARCHAR(45) COMMENT '무이자 여부'")
    private String rNoint;

    @Column(name = "r_bank_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '은행 코드'")
    private String rBankCd;

    @Column(name = "r_bank_nm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '은행명'")
    private String rBankNm;

    @Column(name = "r_account_no", length = 255, columnDefinition = "VARCHAR(255) COMMENT '계좌 번호'")
    private String rAccountNo;

    @Column(name = "r_deposit_nm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '입금자명'")
    private String rDepositNm;

    @Column(name = "r_escrow_yn", length = 45, columnDefinition = "VARCHAR(45) COMMENT '에스크로 사용 여부'")
    private String rEscrowYn;

    @Column(name = "r_pay_type", length = 100, columnDefinition = "VARCHAR(100) COMMENT '결제 수단'")
    private String rPayType;

    @Column(name = "r_cash_issue_yn", length = 45, columnDefinition = "VARCHAR(45) COMMENT '현금 영수증 발행 여부'")
    private String rCashIssueYn;

    @Column(name = "r_cash_res_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '현금 영수증 응답 코드'")
    private String rCashResCd;

    @Column(name = "r_cash_tran_date", length = 100, columnDefinition = "VARCHAR(100) COMMENT '현금 영수증 거래 일시'")
    private String rCashTranDate;

    @Column(name = "r_cash_auth_no", length = 100, columnDefinition = "VARCHAR(100) COMMENT '현금 영수증 승인 번호'")
    private String rCashAuthNo;

    @Column(name = "r_stat_cd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '상태 코드'")
    private String rStatCd;

    @Column(name = "r_stat_msg", length = 255, columnDefinition = "VARCHAR(255) COMMENT '상태 메시지'")
    private String rStatMsg;

    @Column(name = "r_tlf_sno", length = 100, columnDefinition = "VARCHAR(100) COMMENT 'TID 번호'")
    private String rTlfSno;

    @Column(name = "r_account_type", length = 100, columnDefinition = "VARCHAR(100) COMMENT '계좌 유형'")
    private String rAccountType;

    @Column(name = "r_user_id", length = 100, columnDefinition = "VARCHAR(100) COMMENT '고객 ID (거래처 코드)'")
    private String rUserId;

    @Column(name = "r_user_nm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '고객명 (영업자 코드)'")
    private String rUserNm;

    @Column(name = "r_canc_date", length = 100, columnDefinition = "VARCHAR(100) COMMENT '취소 일시'")
    private String rCancDate;

    @Column(name = "r_reserve1", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 1'")
    private String rReserve1;

    @Column(name = "r_reserve2", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 2'")
    private String rReserve2;

    @Column(name = "r_reserve3", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 3'")
    private String rReserve3;

    @Column(name = "r_reserve4", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 4'")
    private String rReserve4;

    @Column(name = "r_reserve5", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 5'")
    private String rReserve5;

    @Column(name = "r_reserve6", length = 255, columnDefinition = "VARCHAR(255) COMMENT '가맹점 데이터 6'")
    private String rReserve6;

    @Column(name = "r_noti_subtype", length = 100, columnDefinition = "VARCHAR(100) COMMENT '결제 상세 수단'")
    private String rNotiSubtype;

    @Column(name = "r_depo_bkcd", length = 100, columnDefinition = "VARCHAR(100) COMMENT '입금 은행 코드'")
    private String rDepoBkcd;

    @Column(name = "r_depo_bknm", length = 100, columnDefinition = "VARCHAR(100) COMMENT '입금 은행명'")
    private String rDepoBknm;
}
