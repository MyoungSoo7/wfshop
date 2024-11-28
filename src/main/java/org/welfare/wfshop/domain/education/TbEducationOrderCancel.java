package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_order_cancel", indexes = {
        @Index(name = "ix_tb_education_order_cancel_cno", columnList = "cno"),
        @Index(name = "ix_tb_education_order_cancel_education_no", columnList = "education_no")
})
public class TbEducationOrderCancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id; // 고유 식별자 (Primary Key)

    @Column(name = "cno", nullable = false, length = 50)
    private String cno; // 결제 번호

    @Column(name = "education_no", nullable = false, length = 50)
    private String educationNo; // 강좌 코드

    @Column(name = "education_round", length = 50)
    private String educationRound; // 회차 번호

    @Column(name = "education_round_title", length = 500)
    private String educationRoundTitle; // 회차명

    @Column(name = "cancel_reason", columnDefinition = "TEXT")
    private String cancelReason; // 취소 상세 사유

    @Column(name = "bank_code", length = 6)
    private String bankCode; // 은행 코드

    @Column(name = "deposit_name", length = 255)
    private String depositName; // 예금주

    @Column(name = "deposit_account", length = 255)
    private String depositAccount; // 환불 계좌 번호

    @Column(name = "refund_cancel_date")
    private java.sql.Timestamp refundCancelDate; // 환불 접수일/결제 취소일

    @Column(name = "refund_cmpl_date")
    private java.sql.Timestamp refundCmplDate; // 환불 완료일

    @Column(name = "refund_price")
    private Long refundPrice; // 환불 금액

    @Column(name = "cancel_data", columnDefinition = "LONGTEXT")
    private String cancelData; // 취소 데이터

    @Column(name = "refund_pay_price")
    private Long refundPayPrice; // 환불 결제 금액

    @Column(name = "refund_point")
    private Long refundPoint; // 환불 포인트
}
