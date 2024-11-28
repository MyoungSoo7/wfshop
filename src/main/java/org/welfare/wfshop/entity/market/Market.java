package org.welfare.wfshop.entity.market;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_market",
        indexes = {
                @Index(name = "idx_is_view", columnList = "is_view"),
                @Index(name = "idx_is_del", columnList = "is_del"),
                @Index(name = "idx_product_code", columnList = "product_code"),
                @Index(name = "idx_file_master_thumb", columnList = "file_master_thumb"),
                @Index(name = "idx_promo_date", columnList = "promo_start_date, promo_end_date"),
                @Index(name = "idx_origin_manufacturer_jj1", columnList = "origin_manufacturer_jj1"),
                @Index(name = "idx_origin_manufacturer_jj2", columnList = "origin_manufacturer_jj2"),
                @Index(name = "idx_medicine_yn", columnList = "medicine_yn")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Market  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, updatable = false, columnDefinition = "INT COMMENT '상품번호 (Primary Key)'")
    private Integer productId;

    @Column(name = "product_name", nullable = false, length = 500, columnDefinition = "VARCHAR(500) COMMENT '상품 이름'")
    private String productName;

    @Column(name = "product_code", nullable = false, unique = true, length = 50, columnDefinition = "VARCHAR(50) COMMENT '상품번호 (11자리 고유번호)'")
    private String productCode;

    @Column(name = "promo_cate_name", length = 50, columnDefinition = "VARCHAR(50) COMMENT '프로모션 카테고리 이름'")
    private String promoCateName;

    @Column(name = "promo_start_date", columnDefinition = "DATE COMMENT '프로모션 시작 날짜'")
    private LocalDate promoStartDate;

    @Column(name = "promo_end_date", columnDefinition = "DATE COMMENT '프로모션 종료 날짜'")
    private LocalDate promoEndDate;

    @Column(name = "promotion_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '스페셜 프로모션 적용 여부 (Y/N)'")
    private String promotionYn;

    @Lob
    @Column(name = "product_description", columnDefinition = "LONGTEXT COMMENT '상품 상세 설명'")
    private String productDescription;

    @Lob
    @Column(name = "easy_description", columnDefinition = "LONGTEXT COMMENT '간단 설명'")
    private String easyDescription;

    @Lob
    @Column(name = "mobile_description", columnDefinition = "LONGTEXT COMMENT '모바일 설명'")
    private String mobileDescription;

    @Column(name = "pay_price", nullable = false, columnDefinition = "INT UNSIGNED COMMENT '상품 가격'")
    private Integer payPrice;

    @Column(name = "reg_date", nullable = false, updatable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '상품 등록일'")
    private LocalDateTime regDate;

    @Column(name = "mod_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정 날짜'")
    private LocalDateTime modDate;

    @Column(name = "discount_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '할인 적용 여부 (Y/N)'")
    private String discountYn;

    @Column(name = "discount_price", columnDefinition = "INT UNSIGNED DEFAULT 0 COMMENT '상품 가격 할인액'")
    private Integer discountPrice;

    @Column(name = "discount_start_term", columnDefinition = "DATETIME COMMENT '할인 시작일'")
    private LocalDateTime discountStartTerm;

    @Column(name = "discount_end_term", columnDefinition = "DATETIME COMMENT '할인 종료일'")
    private LocalDateTime discountEndTerm;

    @Column(name = "earn_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '포인트 적립 상품 여부 (Y/N)'")
    private String earnYn;

    @Column(name = "recommendation_product_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '추천상품 적용 여부 (Y/N)'")
    private String recommendationProductYn;

    @Column(name = "best_product_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '베스트 상품 적용 여부 (Y/N)'")
    private String bestProductYn;

    @Column(name = "is_view", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y' COMMENT '화면 노출 여부 (Y/N)'")
    private String isView;

    @Column(name = "is_del", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '삭제 처리 여부 (Y/N)'")
    private String isDel;

    @Column(name = "stock_use_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '품절 여부 (Y: 품절, N: 재고 있음)'")
    private String stockUseYn;

    @Column(name = "soldout_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '옵션 여부 (Y: 사용, N: 미사용)'")
    private String soldoutYn;

    @Column(name = "qty", columnDefinition = "BIGINT DEFAULT 0 COMMENT '상품 수량'")
    private Long qty;

    @Column(name = "delivery_price", length = 50, columnDefinition = "VARCHAR(50) COMMENT '배송비'")
    private String deliveryPrice;

    @Column(name = "counsel_reserve_product_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '상담 예약 상품 여부 (Y/N)'")
    private String counselReserveProductYn;

    @Column(name = "event_product_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '이벤트 상품 여부 (Y/N)'")
    private String eventProductYn;

    @Column(name = "youtube_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '유튜브 코드'")
    private String youtubeCode;

    @Column(name = "insurance_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '보험 청구 코드 (medical insurance claim)'")
    private String insuranceCode;

    @Column(name = "file_master_thumb", length = 100, columnDefinition = "VARCHAR(100) COMMENT '이미지 썸네일'")
    private String fileMasterThumb;

    @Column(name = "main_view_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '메인 등록 여부 (Y/N)'")
    private String mainViewYn;

    @Column(name = "description_pconly_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '모바일/웹 동일 안내 사용 여부 (Y/N)'")
    private String descriptionPconlyYn;

    @Column(name = "specification", length = 200, columnDefinition = "VARCHAR(200) COMMENT '상품 사양'")
    private String specification;

    @Column(name = "origin_manufacturer_jj", length = 255, columnDefinition = "VARCHAR(255) COMMENT '제조사 정보 (1차)'")
    private String originManufacturerJj;

    @Column(name = "origin_manufacturer_os", length = 255, columnDefinition = "VARCHAR(255) COMMENT '제조사 정보 (2차)'")
    private String originManufacturerOs;

    @Column(name = "seo_keyword", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 키워드'")
    private String seoKeyword;

    @Column(name = "seo_exp", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 설명'")
    private String seoExp;

    @Column(name = "seo_image_code", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 이미지 코드'")
    private String seoImageCode;

    @Column(name = "order_limit_use_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '주문 제한 여부 (Y/N)'")
    private String orderLimitUseYn;

    @Column(name = "max_purchases_per_id", columnDefinition = "INT DEFAULT 0 COMMENT 'ID당 최대 구매 횟수'")
    private Integer maxPurchasesPerId;

    @Column(name = "min_purchases_per_time", columnDefinition = "INT DEFAULT 0 COMMENT '1회 최소 구매 수량'")
    private Integer minPurchasesPerTime;

    @Column(name = "max_purchases_per_time", columnDefinition = "INT DEFAULT 0 COMMENT '1회 최대 구매 수량'")
    private Integer maxPurchasesPerTime;

    @Column(name = "origin_manufacturer_jj1", length = 30, columnDefinition = "VARCHAR(30) COMMENT '제조사 1 depth'")
    private String originManufacturerJj1;

    @Column(name = "origin_manufacturer_jj2", length = 255, columnDefinition = "VARCHAR(255) COMMENT '제조사 2 depth'")
    private String originManufacturerJj2;

    @Column(name = "insurance_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '보험 적용 여부 (Y/N)'")
    private String insuranceYn;

    @Column(name = "point_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '포인트 사용 여부 (Y/N)'")
    private String pointYn;

    @Column(name = "point_benefit", length = 500, columnDefinition = "VARCHAR(500) COMMENT '포인트 혜택 설명'")
    private String pointBenefit;

    @Column(name = "manage_code", length = 50, columnDefinition = "VARCHAR(50) COMMENT '관리 코드'")
    private String manageCode;

    @Column(name = "point_res", length = 10, columnDefinition = "VARCHAR(10) COMMENT '포인트 관련 정보'")
    private String pointRes;

    @Column(name = "reservation_yn", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '예약 상품 여부 (Y/N)'")
    private String reservationYn;

    @Column(name = "external_market_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '외부 마켓 여부 (Y/N)'")
    private String externalMarketYn;

    @Column(name = "pcount", columnDefinition = "INT DEFAULT 0 COMMENT '상품 조회수'")
    private Integer pcount;

    @Column(name = "medicine_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) DEFAULT 'N' COMMENT '의약품 여부 (Y: 할인 불가)'")
    private String medicineYn;

    @Column(name = "of_main_code", length = 100, columnDefinition = "VARCHAR(100) COMMENT '메인 코드'")
    private String ofMainCode;

    @Column(name = "version", columnDefinition = "INT DEFAULT 0 COMMENT '버전'")
    private Integer version;
}
