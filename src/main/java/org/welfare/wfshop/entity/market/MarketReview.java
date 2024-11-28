package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_review",

        indexes = {
                @Index(name = "ix_tb_market_review_pcode", columnList = "product_code"),
                @Index(name = "idx_member_no", columnList = "member_no")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_seq", nullable = false, columnDefinition = "INT COMMENT '리뷰 시퀀스 (Primary Key)'")
    private Integer reviewSeq;

    @Column(name = "order_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '주문번호'")
    private String orderNo;

    @Column(name = "product_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '상품 번호'")
    private String productCode;

    @Column(name = "order_product_code", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '주문상품 번호'")
    private String orderProductCode;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT COMMENT '리뷰 내용'")
    private String content;

    @Column(name = "score", columnDefinition = "INT DEFAULT 0 COMMENT '별표점수'")
    private Integer score;

    @Column(name = "member_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '회원번호'")
    private String memberNo;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '최초 등록일'")
    private LocalDateTime regDate;

    @Column(name = "mod_date", columnDefinition = "TIMESTAMP NULL COMMENT '수정일'")
    private LocalDateTime modDate;

    @Column(name = "file_master_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '파일 마스터 코드'")
    private String fileMasterCode;

    @Column(name = "delete_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y/N)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제일'")
    private LocalDateTime deleteDate;

    @Column(name = "use_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '사용 여부 (Y/N)'")
    private String useYn;

    @Column(name = "best_product_yn", length = 1, nullable = false, columnDefinition = "CHAR(1) COMMENT '베스트 상품 여부 (Y/N)'")
    private String bestProductYn;

    @Column(name = "answer_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '답변 여부 (Y/N)'")
    private String answerYn;
}
