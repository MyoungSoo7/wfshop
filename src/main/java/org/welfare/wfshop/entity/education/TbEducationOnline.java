package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_online", indexes = {
        @Index(name = "ix_tb_education_online_education_no", columnList = "education_no"),
        @Index(name = "ix_tb_education_online_use_yn", columnList = "use_yn"),
        @Index(name = "ix_tb_education_online_delete_yn", columnList = "delete_yn")
})
public class TbEducationOnline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", nullable = false, length = 20)
    private String educationNo; // 강좌 고유 번호 (tb_education.education_no 참조)

    @Column(name = "title", nullable = false, length = 500)
    private String title; // 강좌 제목

    @Column(name = "use_yn", nullable = false, length = 1)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제 일시

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시

    @Column(name = "registrant_no", nullable = false, length = 15)
    private String registrantNo; // 등록자 회원 번호

    @Column(name = "education_round", nullable = false)
    private Integer educationRound; // 강좌 회차

    @Column(name = "mod_date")
    private java.sql.Timestamp modDate; // 수정 일시

    @Column(name = "discount_price")
    private Integer discountPrice; // 할인 금액

    @Column(name = "pay_price", nullable = false)
    private Integer payPrice; // 결제 금액

    @Column(name = "discount_yn", length = 1)
    private String discountYn; // 할인 여부 (Y: 할인, N: 미할인)

    @Column(name = "education_watch_time", nullable = false)
    private java.sql.Time educationWatchTime; // 강좌 시청 시간

    @Column(name = "url", length = 100)
    private String url; // 강좌 URL

    @ManyToOne
    @JoinColumn(name = "education_no", referencedColumnName = "education_no", insertable = false, updatable = false)
    private TbEducation tbEducation; // 강좌와의 관계 (외래키)
}
