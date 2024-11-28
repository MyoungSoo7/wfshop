package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_grade_master")
public class TbGradeMaster {

    @Id
    @Column(name = "grade_id", nullable = false, length = 20)
    private String gradeId; // 등급 아이디

    @Column(name = "grade_name", length = 50)
    private String gradeName; // 등급 명

    @Column(name = "education_task", columnDefinition = "INT DEFAULT 0")
    private Integer educationTask; // 최소 교육 수강

    @Column(name = "market_price", columnDefinition = "INT DEFAULT 0")
    private Integer marketPrice; // 최소 마켓 구매 금액

    @Column(name = "point_price", columnDefinition = "INT DEFAULT 0")
    private Integer pointPrice; // 최소 포인트 구매 금액

    @Column(name = "maintain_monthly", nullable = false, columnDefinition = "INT DEFAULT 12")
    private Integer maintainMonthly; // 등급 유지기간 설정

    @Column(name = "is_use", columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean isUse; // 사용 여부

    @Column(name = "is_grant_admin", columnDefinition = "TINYINT(1) DEFAULT 0")
    private Boolean isGrantAdmin; // 관리자 등급 부여 여부

    @Column(name = "always_rate", columnDefinition = "FLOAT DEFAULT 0")
    private Float alwaysRate; // 상시 할인율

    @Column(name = "point_rate", columnDefinition = "FLOAT DEFAULT 0")
    private Float pointRate; // 적립식 포인트 적립율

    @Column(name = "etc", length = 3000)
    private String etc; // 비고

    @Column(name = "reg_date")
    private java.time.LocalDateTime regDate; // 등록일

    @Column(name = "mod_date")
    private java.time.LocalDateTime modDate; // 수정일

    @Column(name = "sort")
    private Integer sort; // 순서 - 추후 개발

    @Column(name = "front_color", length = 7, columnDefinition = "VARCHAR(7) DEFAULT '#FFFFFF'")
    private String frontColor; // 글자 색

    @Column(name = "back_color", length = 7, columnDefinition = "VARCHAR(7) DEFAULT '#FF7500'")
    private String backColor; // 배경 색
}
